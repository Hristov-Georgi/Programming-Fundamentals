package TextProcessingExercise;

import java.util.Scanner;

public class MultiplyBigNumber_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String num1 = scanner.nextLine();
        int num2 = Integer.parseInt(scanner.nextLine());

        StringBuilder sb = new StringBuilder();

        int numRemain = 0;
        int printNum = 0;

        for (int i = num1.length() - 1; i >= 0 ; i--) {

            int digit = Integer.parseInt(num1.substring(i, i + 1));
            int currentSum = num2 * digit;

            currentSum += numRemain;

            sb.append(currentSum % 10);

            numRemain = currentSum / 10;

        }
        if (numRemain != 0){
            sb.append(numRemain);
        }

        boolean zero = true;
        for (int i = 0; i < sb.length(); i++) {
            if(Integer.parseInt(sb.substring(i, i + 1)) != 0){
                zero = false;
            }

        }
        if (zero){
            System.out.println(0);
        } else {
            StringBuilder sumOutput = new StringBuilder();

            boolean trailing = true;

            for (int i = sb.length() - 1; i >= 0; i--) {
                if (Integer.parseInt(sb.substring(i, i + 1)) == 0 && trailing) {

                } else {
                    trailing = false;
                    sumOutput.append(sb.charAt(i));
                }
            }
            System.out.println(sumOutput.toString());

        }
    }
}

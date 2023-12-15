package methodsTrainign;

import java.util.Scanner;

public class RepeatString07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputData = scanner.nextLine();
        int timesRepeat = Integer.parseInt(scanner.nextLine());

        System.out.println(stringRepeat(inputData, timesRepeat));


    }

    public static String stringRepeat(String data, int repeat) {
        String result = "";

        for (int i = 1; i <= repeat ; i++) {

            result += data;

        }
        return result;
    }
}

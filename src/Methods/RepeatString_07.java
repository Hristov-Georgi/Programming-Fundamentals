package Methods;

import java.util.Scanner;

public class RepeatString_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputText = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());

        System.out.println(repeatedText(inputText, n));



    }
    public static String repeatedText (String text, int timesRepeated){

        String newText = "";
        for (int i = 1; i <= timesRepeated ; i++) {
            newText += text;

        }
        return newText;

    }
}

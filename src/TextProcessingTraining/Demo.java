package TextProcessingTraining;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = new String (new char[] {'s', 't', 'r'});
        char[] charArr = str.toCharArray();

        System.out.println(str);
        System.out.println(charArr);
    }
}

package basicSyntaxConditionalStatementsLoops.exercise;

import java.util.Scanner;

public class Ex_01_Ages {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int age = Integer.parseInt(sc.nextLine());

        String person = "";

        if (age >= 0 && age <= 2) {
            person = "baby";

        } else if (age >= 3 && age <= 13) {
            person = "child";

        } else if (age >= 14 && age <= 19) {
            person = "teenager";

        } else if (age >= 20 && age <= 65) {
            person = "adult";

        } else if (age >= 66) {
            person = "elder";
        }

        System.out.println(person);
    }
}

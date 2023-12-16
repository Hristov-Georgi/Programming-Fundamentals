package objectsAndClasses.ex_02_Articles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] articleArr = scanner.nextLine().split(", ");

        Article article = new Article(articleArr[0], articleArr[1], articleArr[2]);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n ; i++) {

            String[] commandArr = scanner.nextLine().split(": ");

            String newData = commandArr[1];

            switch (commandArr[0]) {

                case "Edit":
                    article.edit(newData);
                    break;

                case "ChangeAuthor":
                    article.changeAuthor(newData);
                    break;

                case "Rename":
                    article.rename(newData);
                    break;
            }
        }

        String result = article.toString();
        System.out.println(result);
    }
}

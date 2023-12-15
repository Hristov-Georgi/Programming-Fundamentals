package BasicSyntaxConditionalStatementsLoops;

import java.util.Scanner;

public class BackIn30Minutes_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());


        int sumHM = (hours * 60) + minutes + 30;

        int searchedHour = sumHM / 60;
        int searchedMinutes = sumHM % 60;

        if(searchedHour > 23){
            searchedHour = 0;
        }


        System.out.printf("%d:%02d", searchedHour, searchedMinutes);



    }
}

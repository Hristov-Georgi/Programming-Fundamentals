package objectsAndClasses.ex_03_OpinionPoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Person> personList = new ArrayList<>();

        for (int i = 1; i <= n ; i++) {

            String[] peopleInfo = scanner.nextLine().split("\\s+");

            Person person = new Person(peopleInfo[0], Integer.parseInt(peopleInfo[1]));

            personList.add(person);

        }

        for (Person allPersons : personList) {
            if(allPersons.getAge() > 30){
                System.out.printf("%s - %d%n", allPersons.getName(), allPersons.getAge());
            }
        }
    }
}

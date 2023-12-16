package objectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab_05_Students {

    static class Student {

        private String firstName;
        private String lastName;
        private int age;
        private String homeTown;

        public Student(String firstName, String lastName, int age, String homeTown) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.homeTown = homeTown;
        }

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return this.lastName;
        }

        public int getAge() {
            return this.age;
        }

        public String getHomeTown() {
            return this.homeTown;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Student> studentDataList = new ArrayList<>();
        while (!input.equals("end")) {

            String[] studentData = input.split(" ");
            int studentAge = Integer.parseInt(studentData[2]);
            Student currentStudent = new Student(studentData[0], studentData[1], studentAge, studentData[3]);
            studentDataList.add(currentStudent);

            input = scanner.nextLine();
        }

        String town = scanner.nextLine();

        for (Student item : studentDataList) {
            if (town.equals(item.getHomeTown())) {
                System.out.printf("%s %s is %d years old%n", item.getFirstName(),
                        item.getLastName(), item.getAge());
            }
        }
    }
}

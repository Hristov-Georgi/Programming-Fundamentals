package ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class lab_Students_05 {

    static class Student {

        private String firstName;
        private String lastName;
        private int age;
        private String homeTown;

        public Student (String firstName, String lastName, int age, String homeTown){
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.homeTown = homeTown;
        }
        public String getFirstName(){
            return this.firstName;
        }
        public String getLastName(){
            return this.lastName;
        }
        public int getAge(){
            return this.age;
        }
        public String getHomeTown(){
            return this.homeTown;
        }

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();


        List<Student> studentsList = new ArrayList<>();

        while (!input.equals("end")){
            String[] studentInfoArr = input.split("\\s+");


            Student currentStudent = new Student(studentInfoArr[0], studentInfoArr[1],
                    Integer.parseInt(studentInfoArr[2]), studentInfoArr[3]);

            studentsList.add(currentStudent);


            input = scanner.nextLine();
        }

        String cityName = scanner.nextLine();

        for (Student item : studentsList) {

            if (cityName.equals(item.getHomeTown())){
                System.out.printf("%s %s is %d years old%n", item.getFirstName(), item.getLastName(), item.getAge());

            }
        }

    }
}

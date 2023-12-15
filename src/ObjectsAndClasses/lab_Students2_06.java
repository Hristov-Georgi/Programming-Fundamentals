package ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class lab_Students2_06 {


    static class Student {

        private String firstName;
        private String lastName;
        private int age;
        private String homeTown;


        Student (){

            this.firstName = null;
            this.lastName = null;
            this.age = 0;
            this.homeTown = null;
        }

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

        public void setAge(int age){

            this.age = age;
        }
        public String getHomeTown(){

            return this.homeTown;
        }
        public void setHomeTown(String homeTown){

            this.homeTown = homeTown;
        }


        @Override

        public String toString(){

            return String.format("%s %s is %d years old%n",
                    getFirstName(),
                    getLastName(),
                    getAge());

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




           int existingIndex = findStudentsIndex(studentsList, currentStudent.getFirstName(),
                   currentStudent.getLastName());
           if(existingIndex != -1){
               studentsList.get(existingIndex).setAge(currentStudent.getAge());
               studentsList.get(existingIndex).setHomeTown(currentStudent.getHomeTown());

           }else {
               studentsList.add(currentStudent);
           }


            input = scanner.nextLine();
        }

        String cityName = scanner.nextLine();

        for (Student item : studentsList) {

            if (cityName.equals(item.getHomeTown())){
                System.out.printf("%s %s is %d years old%n", item.getFirstName(), item.getLastName(), item.getAge());

            }
        }

    }

    static public int findStudentsIndex (List<Student> studentsList, String firstName, String lastName){
        for (int i = 0; i < studentsList.size(); i++) {
            String firstNameList = studentsList.get(i).getFirstName();
            String lastNameList = studentsList.get(i).getLastName();

            if(firstNameList.equals(firstName) && lastNameList.equals(lastName)){
                return i;

            }

        }
        return -1;


    }
}
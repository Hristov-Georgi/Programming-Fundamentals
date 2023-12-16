package objectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab_06_Students2 {

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

        public void setAge(int age) {
            this.age = age;
        }

        public String getHomeTown() {
            return this.homeTown;
        }

        public void setHomeTown(String homeTown) {
            this.homeTown = homeTown;
        }

    }

    private static boolean isStudentExist(List<Student> student, String firstName, String lastName){

        for (Student studentName : student) {
            if(studentName.getFirstName().equals(firstName) && studentName.getLastName().equals(lastName)){
                return  true;
            }
        }
        return false;
    }

    private static Student OverwriteInfo(List<Student> studentList, String firstName, String lastName) {

        Student existStudent = null;

        for (Student student : studentList) {
            if(student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {

                existStudent = student;
            }
        }
        return existStudent;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputCommands = scanner.nextLine();

        List<Student> studentList = new ArrayList<>();

        while(!inputCommands.equals("end")) {

            String[] studentData = inputCommands.split(" ");

            Student student = new Student(studentData[0], studentData[1], Integer.parseInt(studentData[2]), studentData[3]);

            if(!isStudentExist(studentList, student.getFirstName(), student.getLastName())){

                studentList.add(student);

            } else {

                Student overwriteStudent = OverwriteInfo(studentList, student.getFirstName(), student.getLastName());

                overwriteStudent.setAge(student.getAge());
                overwriteStudent.setHomeTown(student.getHomeTown());

            }

            inputCommands = scanner.nextLine();
        }

        String cityName = scanner.nextLine();

        for (Student student: studentList) {
            if(cityName.equals(student.getHomeTown())){
                System.out.printf("%s %s is %d years old%n", student.getFirstName(),
                        student.getLastName(), student.getAge());
            }
        }
    }
}

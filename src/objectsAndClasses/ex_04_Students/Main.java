package objectsAndClasses.ex_04_Students;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Students> studentsList = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n ; i++) {

            String[] studentInfo = scanner.nextLine().split("\\s+");

            Students student = new Students(studentInfo[0], studentInfo[1], Double.parseDouble(studentInfo[2]));

            studentsList.add(student);

        }

        studentsList.sort(Comparator.comparing(Students::getGrade).reversed());

        for (Students student: studentsList) {
            System.out.println(student);

        }

    }
}

package associativeArrays;

import java.util.*;

public class Ex_06_StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, List<Double>> studentData = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n ; i++) {

            String studentName = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if(!studentData.containsKey(studentName)) {
                studentData.put(studentName, new ArrayList<>());
            }
            studentData.get(studentName).add(grade);
        }

        LinkedHashMap<String, Double> averageStudentGrade = new LinkedHashMap<>();

        for (Map.Entry<String, List<Double>> entry : studentData.entrySet()){

            double avgGrade = averageGrade(entry.getValue());

            if(avgGrade >= 4.50) {
                averageStudentGrade.put(entry.getKey(), avgGrade);
            }
        }

        averageStudentGrade.entrySet().forEach(entry -> System.out.printf("%s -> %.2f%n",
                entry.getKey(), entry.getValue()));

    }

    static double averageGrade(List<Double> grades) {

        double sum = 0.0;

        for (double grade: grades) {
            sum += grade;

        }
        return sum / grades.size();
    }
}

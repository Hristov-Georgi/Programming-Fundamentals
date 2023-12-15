package Maps_Lambda_StreamApi;

import java.util.*;

public class Ex6StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<Double>> studentsData = new LinkedHashMap<>();

        int numberOfStudents = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= numberOfStudents ; i++) {

            String studentName = scanner.nextLine();
            double studentGrade = Double.parseDouble(scanner.nextLine());

            if(!studentsData.containsKey(studentName)){

               studentsData.put(studentName, new ArrayList<>());
           }

            studentsData.get(studentName).add(studentGrade);

        }

        Map<String, Double> averageStudentsGrade = new LinkedHashMap<>();

        for (Map.Entry<String, List<Double>> entry : studentsData.entrySet()){

            String name = entry.getKey();
            List <Double> listGrades = entry.getValue();

            double averageGrade = getAverageGrade(listGrades);

            if (averageGrade >= 4.50){
                averageStudentsGrade.put(name, averageGrade);
            }
        }

        averageStudentsGrade.entrySet()
                .forEach(entry -> System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue()));

    }

    private static double getAverageGrade (List<Double> listGrades){
        double gradesSummary = 0;

        for(double grade : listGrades){
            gradesSummary += grade;
        }

        return gradesSummary / listGrades.size();
    }
}

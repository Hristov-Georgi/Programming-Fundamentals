package associativeArrays;

import java.util.*;

public class Ex_05_Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, List<String>> courseDataMap = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("end")) {

            String course = input.split(" : ")[0];
            String studentName = input.split(" : ")[1];

            if (!courseDataMap.containsKey(course)) {
                courseDataMap.put(course, new ArrayList<>());
            }

            courseDataMap.get(course).add(studentName);


            input = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : courseDataMap.entrySet()) {

            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue().size());

            for (int i = 0; i < entry.getValue().size(); i++) {
                System.out.println("-- " + entry.getValue().get(i));
            }
        }
    }
}

//        courses.entrySet()
//                .forEach(entry -> {
//                    //key: име на курса
//                    //value: списък с хората
//                    //име на курса -> бр. хората
//                    System.out.println(entry.getKey() + ": " + entry.getValue().size());
//                    entry.getValue().forEach(studentName -> System.out.println("-- " + studentName));
//                    //ascending order / нарастващ ред
//                });

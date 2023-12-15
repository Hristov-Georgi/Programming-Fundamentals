package Maps_Lambda_StreamApi;

import java.util.*;

public class Ex5Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String info = scanner.nextLine();

        Map<String, List<String>> coursesInfo = new LinkedHashMap<>();


        while (!info.equals("end")){

            String course = info.split(" : ")[0];
            String studentName = info.split(" : ")[1];

            if(!coursesInfo.containsKey(course)){
                coursesInfo.put(course, new ArrayList<>());
            }

            coursesInfo.get(course).add(studentName);

            info = scanner.nextLine();
        }

        coursesInfo.entrySet().forEach(entry -> {System.out.println(entry.getKey()
        + ": " + entry.getValue().size());
        entry.getValue().forEach(studentName -> System.out.println("-- " + studentName));});
    }
}

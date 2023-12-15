package Maps_Lambda_StreamApi;

import java.util.*;

public class Ex8CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> companyEmployees = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("End")) {

            String[] dataArr = input.split(" -> ");

            if (companyEmployees.containsKey(dataArr[0])) {
                List<String> id = companyEmployees.get(dataArr[0]);

                if (!id.contains(dataArr[1])) {
                    id.add(dataArr[1]);
                }
            } else {
                List<String> id = new ArrayList<>();
                id.add(dataArr[1]);
                companyEmployees.put(dataArr[0], id);
            }

            input = scanner.nextLine();
        }

        companyEmployees.entrySet().stream()
                .forEach(company -> {System.out.printf("%s%n", company.getKey());
                company.getValue().forEach(id -> System.out.printf("-- %s%n", id));
                });
    }
}


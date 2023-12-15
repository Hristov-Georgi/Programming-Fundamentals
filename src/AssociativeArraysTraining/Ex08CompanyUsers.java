package AssociativeArraysTraining;

import java.util.*;

public class Ex08CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> companyMap = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("End")) {

            String companyName = input.split(" -> ")[0];
            String employeeId = input.split(" -> ")[1];

            if(!companyMap.containsKey(companyName)) {
                companyMap.put(companyName, new ArrayList<>());
                companyMap.get(companyName).add(employeeId);
            } else {
                if(!companyMap.get(companyName).contains(employeeId)) {
                    companyMap.get(companyName).add(employeeId);
                }
            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry: companyMap.entrySet()){

            System.out.println(entry.getKey());

            for (String listData: entry.getValue()) {
                System.out.printf("-- %s%n", listData);

            }
        }
    }
}

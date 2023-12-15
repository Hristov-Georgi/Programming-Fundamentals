package ListExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>(Arrays.asList(
                "one", "two", "three", "four", "five", "six"));

//        for (int i = 0; i < list.size(); i++) {
//            System.out.printf("arr[%d] = %s%n", i, list.get(i));
        System.out.println(String.join("; ", list));


    }
}

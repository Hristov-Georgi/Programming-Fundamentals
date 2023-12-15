package DataTypesAndVariables;

import java.util.Scanner;

public class Ex_03_Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte n = Byte.parseByte(scanner.nextLine());
        byte p = Byte.parseByte(scanner.nextLine());

        byte elevatorCourses = (byte) Math.ceil((double) n / p);



        System.out.println(elevatorCourses);
    }
}

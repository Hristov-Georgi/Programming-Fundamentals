package ObjectsAndClasses;

import java.math.BigInteger;
import java.util.Scanner;

public class lab_BigFactorial_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Short N = Short.parseShort(scanner.nextLine());


        BigInteger sumFactorialN = new BigInteger(String.valueOf(1));
        //BigInteger factorialN = BigInteger.valueOf(1);

        for (int i = 1; i <= N  ; i++) {
            sumFactorialN = sumFactorialN.multiply(BigInteger.valueOf(i));
        }

        System.out.println(sumFactorialN);
    }
}

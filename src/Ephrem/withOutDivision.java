package Ephrem;

import java.util.Scanner;

public class withOutDivision {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number");
        int numb1 = input.nextInt();
        System.out.println("Enter your second number");
        int numb2 = input.nextInt();

        System.out.println(divide(numb1,numb2));
    }

    public static String divide(int numb1, int numb2) {
        // handle divisibility by 0
        if (numb2 == 0) {
            System.out.println("Error!! Divisible by 0");
            System.exit(1);
        }

        // store sign of the result
        int sign = 1; int diff = numb1;
        if (numb1 * numb2 < 0) {
            sign = -1;
            // convert both dividend and divisor to positive
            numb1 = Math.abs(numb1);
            numb2 = Math.abs(numb2);
        }


        // initialize quotient by 0
        int quotient = 0;

        // loop till dividend `x` becomes less than divisor `y`
        while (numb1 >= numb2) {
            numb1 = numb1 - numb2;      // perform a reduction on the dividend
            quotient++;     // increase quotient by 1
        }
        String result = diff + " divided by " + numb2 + " is " + (sign * quotient) + " with a remainder " + (sign * numb1);


        return result;
    }

}

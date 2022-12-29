package Ephrem;

import java.util.Scanner;

public class oddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int numb = input.nextInt();

        System.out.println(isOddEven(numb));
    }

    public static String isOddEven(int numb) {
        String isOdd = "";
        isOdd = (numb % 2 == 0) ? "Even" : "Odd";

        return isOdd;
    }
}

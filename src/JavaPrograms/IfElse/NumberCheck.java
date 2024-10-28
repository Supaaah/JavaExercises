package JavaPrograms.IfElse;

import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println(checkNumberSign(number));
    }

    public static String checkNumberSign(int number) {
        if (number > 0) return "The number is positive.";
        else if (number < 0) return "The number is negative.";
        else return "The number is zero.";
    }
}

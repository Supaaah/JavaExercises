package JavaPrograms.IfElse;

import java.util.Scanner;

public class DivisibilityCheck {

    public static String checkDivisible(int number){
        if(number % 5 == 0 && number % 11 == 0) return "The number is divisible by both 5 and 11.";
        else return "The number is not divisible by both 5 and 11.";
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println(checkDivisible(number));
    }
}

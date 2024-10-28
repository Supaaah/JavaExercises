package JavaPrograms.IfElse;

import java.util.Scanner;

public class UpperLowerCaseChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an alphabet: ");
        char ch = scanner.next().charAt(0);
        System.out.println(LowerUpper(ch));

    }

    public static String LowerUpper(char ch) {
        if (ch >= 'A' && ch <= 'Z') return "The alphabet is uppercase.";
        else if (ch >= 'a' && ch <= 'z') return "The alphabet is lowercase.";
        else return "The character is not an alphabet.";
    }
}



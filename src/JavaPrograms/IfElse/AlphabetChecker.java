package JavaPrograms.IfElse;

import java.util.Scanner;

public class AlphabetChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        if (isAlphabet(ch)) System.out.println("The character is an alphabet.");
        else System.out.println("The character is not an alphabet.");
    }

    private static boolean isAlphabet(char ch) {
        return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z');
    }
}

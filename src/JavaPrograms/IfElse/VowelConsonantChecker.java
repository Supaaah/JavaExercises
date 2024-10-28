package JavaPrograms.IfElse;

import java.util.Scanner;

public class VowelConsonantChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an alphabet: ");
        char ch = scanner.next().toLowerCase().charAt(0);
        System.out.print(checkVowelConsonant(ch));
    }

    public static String checkVowelConsonant(char ch){
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') return ch + " is a vowel.";
        else if ((ch >= 'a' && ch <= 'z')) return ch + " is a consonant.";
        else return "Input is not a valid alphabet.";
    }
}

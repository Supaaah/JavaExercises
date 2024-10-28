import java.util.Scanner;

public class CharTypeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        System.out.println(getCharacterType(ch));
    }

    private static String getCharacterType(char ch) {
        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            return "The character is an alphabet.";
        } else if (ch >= '0' && ch <= '9') {
            return "The character is a digit.";
        } else {
            return "The character is a special character.";
        }
    }
}

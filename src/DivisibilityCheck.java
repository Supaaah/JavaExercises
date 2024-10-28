import java.util.Scanner;

public class DivisibilityCheck {

    public static String checkDivisible(int number){
        return (number % 5 == 0 && number % 11 == 0) ? "The number is divisible by both 5 and 11." : "The number is not divisible by both 5 and 11.";
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println(checkDivisible(number));
    }
}

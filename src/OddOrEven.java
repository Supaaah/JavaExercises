import java.util.Scanner;

public class OddOrEven {

    public static String checkOddOrEven(int number) {
        return (number % 2 == 0) ? "The number is even." : "The number is odd.";
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println(checkOddOrEven(number));
    }
}

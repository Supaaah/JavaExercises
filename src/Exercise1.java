import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfValues = getNumberOfValues(scanner);

        if(!isValidNumberOfValues(numberOfValues)){
            return;
        }
        boolean continueProcessing = true;
        while (continueProcessing) {
            List<Integer> values = getValues(scanner,numberOfValues);
            char operator = getOperatorInput(scanner);
            int result = performCalculation(values, operator);

            if(result != Integer.MIN_VALUE){
                displayResult(result);
            }else{
                System.out.print("Invalid Operator. Program Terminated!");
                continueProcessing = false;
            }
        }
        scanner.close();
    }

    private static int add(List<Integer> values, int index, int sum) {
        if (index >= values.size()) {
            return sum;
        }
        return add(values, index + 1, sum + values.get(index));
    }
    private static int mul(List<Integer> values, int index, int product) {
        if (index >= values.size()) {
            return product;
        }
        return mul(values, index + 1, product * values.get(index));
    }

    private static int performCalculation(List<Integer> values, char operator) {
        return switch (operator) {
            case '+' -> add(values, 1, values.get(0));
            case '*' -> mul(values, 1, values.get(0));
            default -> Integer.MIN_VALUE;
        };
    }

    private static List<Integer> getValues(Scanner scanner, int numberOfValues) {
        List<Integer> values = new ArrayList<>();
        for (int i = 0; i < numberOfValues; i++) {
            int value = getNumberInput(scanner, STR."Enter Number \{i + 1}: ");
            values.add(value);
        }
        return values;
    }

    private static boolean isValidNumberOfValues(int numberOfValues) {
        if(numberOfValues < 2){
            System.out.println("At least two values are required for the calculation.");
            return false;
        }
        return true;
    }

    private static int getNumberOfValues(Scanner scanner){
        System.out.print("Enter the number of values required: ");
        return scanner.nextInt();
    }

    private static int getNumberInput(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next();
            }
        }
    }

    private static char getOperatorInput(Scanner scanner) {
        System.out.print("Enter operator (+ or *): ");
        return scanner.next().charAt(0);
    }

    private static void displayResult(int result) {
        System.out.println(STR."Result is = \{result}");
    }
}

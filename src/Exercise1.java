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

    private static int performCalculation(List<Integer> values, char operator) {
        int result = values.get(0);
        switch (operator){
            case '+':
                for(int i = 1;i<values.size();i++){
                    result+=values.get(i);
                }
                break;
            case '*':
                for(int i=1;i<values.size();i++){
                    result*=values.get(i);
                }
                break;
            default:
                return Integer.MIN_VALUE;
        }
        return result;
    }

    private static List<Integer> getValues(Scanner scanner, int numberOfValues) {
        List<Integer> values = new ArrayList<>();
        for (int i = 0; i < numberOfValues; i++) {
            int value = getNumberInput(scanner, "Enter Number " + (i + 1) + ": ");
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
        System.out.print(prompt);
        return scanner.nextInt();
    }

    private static char getOperatorInput(Scanner scanner) {
        System.out.print("Enter operator (+ or *): ");
        return scanner.next().charAt(0);
    }

    private static void displayResult(int result) {
        System.out.println("Result is = " + result);
    }
}

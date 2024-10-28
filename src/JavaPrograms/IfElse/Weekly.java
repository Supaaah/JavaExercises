package JavaPrograms.IfElse;

import java.util.Scanner;

public class Weekly {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter day number (1-7):");
        int num = scan.nextInt();
        System.out.println(WeekDays(num));
    }

    private static String WeekDays(int num) {
        switch (num){
            case 1: return "Monday";
            case 2: return "Tuesday";
            case 3: return "Wednesday";
            case 4: return "Thursday";
            case 5: return "Friday";
            case 6: return "Saturday";
            case 7: return "Sunday";
            default: return "Invalid week number";
        }
    }
}

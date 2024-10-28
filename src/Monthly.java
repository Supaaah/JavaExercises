import java.util.Scanner;

public class Monthly {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter day number (1-12):");
        int num = scan.nextInt();
        System.out.println(Month(num));
    }

    private static String Month(int num) {
        switch (num){
            case 1: return "January";
            case 2: return "February";
            case 3: return "March";
            case 4: return "April";
            case 5: return "May";
            case 6: return "June";
            case 7: return "July";
            case 8: return "August";
            case 9: return "September";
            case 10: return "October";
            case 11: return "November";
            case 12: return "December";
            default: return "Invalid month number";
        }
    }
}

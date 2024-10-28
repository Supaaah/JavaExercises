import java.util.Scanner;

public class InsuranceChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Are you married (yes/no)? ");
        String maritalStatus = scanner.next().toLowerCase();

        if(isEligibleByMaritalStatus(maritalStatus)){
            System.out.println("The driver is eligible for insurance.");
        }else {
            System.out.print("Enter gender (male/female): ");
            String gender = scanner.next().toLowerCase();
            System.out.print("Enter age: ");
            int age = scanner.nextInt();
            if(isEligibleByGenderAndAge(gender,age)){
                System.out.println("The driver is eligible for insurance.");
            } else {
                System.out.println("The driver is not eligible for insurance.");
            }
        }

    }
    public static boolean isEligibleByMaritalStatus(String maritalStatus) {
        return maritalStatus.equals("yes");
    }


    public static boolean isEligibleByGenderAndAge(String gender, int age) {
        return (gender.equals("male") && age > 30) ||
                (gender.equals("female") && age > 25);
    }

}

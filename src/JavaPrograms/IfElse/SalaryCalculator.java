package JavaPrograms.IfElse;

import java.util.Scanner;

public class SalaryCalculator {

    private static final int EXPERIENCED_YEARS = 10;

    public static double calculateSalary(String gender, int yearsOfService, String qualification) {
        boolean isExperienced = yearsOfService >= EXPERIENCED_YEARS; //true if >= 10 false < 10

        if (gender.equalsIgnoreCase("Male")) {
            if (qualification.equalsIgnoreCase("Post Graduate")) {
                return isExperienced ? 15000 : 10000;
            } else {  // Graduate
                return isExperienced ? 10000 : 7000;
            }
        } else {  // Female
            if (qualification.equalsIgnoreCase("Post Graduate")) {
                return isExperienced ? 12000 : 10000;
            } else {  // Graduate
                return isExperienced ? 9000 : 6000;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Gender (Male/Female): ");
        String gender = scanner.nextLine();

        System.out.print("Enter Years of Service: ");
        int yearsOfService = scanner.nextInt();
        scanner.nextLine();//consume to avoid trap

        System.out.print("Enter Qualification (Graduate/Post Graduate): ");
        String qualification = scanner.nextLine();

        double salary = calculateSalary(gender, yearsOfService, qualification);
        System.out.println("Calculated Salary: " + salary);

        scanner.close();
    }
}
import java.util.Scanner;

public class SalaryCalculator {

    public static double calculateSalary(String gender, int yearsOfService, String qualification) {
        double salary = 0;

        if (gender.equalsIgnoreCase("Male")) {
            if (yearsOfService >= 10) {
                if (qualification.equalsIgnoreCase("Post Graduate")) {
                    salary = 15000;
                } else if (qualification.equalsIgnoreCase("Graduate")) {
                    salary = 10000;
                }
            } else {
                if (qualification.equalsIgnoreCase("Post Graduate")) {
                    salary = 10000;
                } else if (qualification.equalsIgnoreCase("Graduate")) {
                    salary = 7000;
                }
            }
        } else if (gender.equalsIgnoreCase("Female")) {
            if (yearsOfService >= 10) {
                if (qualification.equalsIgnoreCase("Post Graduate")) {
                    salary = 12000;
                } else if (qualification.equalsIgnoreCase("Graduate")) {
                    salary = 9000;
                }
            } else {
                if (qualification.equalsIgnoreCase("Post Graduate")) {
                    salary = 10000;
                } else if (qualification.equalsIgnoreCase("Graduate")) {
                    salary = 6000;
                }
            }
        }

        return salary;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Gender (Male/Female): ");
        String gender = scanner.nextLine();

        System.out.print("Enter Years of Service: ");
        int yearsOfService = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Qualification (Graduate/Post Graduate): ");
        String qualification = scanner.nextLine();

        double salary = calculateSalary(gender, yearsOfService, qualification);
        System.out.println("Calculated Salary: " + salary);

        scanner.close();
    }
}

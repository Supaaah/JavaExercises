package TryingOut;

import java.util.ArrayList;
import java.util.List;

class Customer{
    String customerCode;
    String planType;
    double charges;

    Customer(String customerCode, String planType, double charges){
        this.customerCode = customerCode;
        this.planType = planType;
        this.charges = charges;
    }
}
public class Exercise3 {
    public static void main(String [] args){
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("0001","A", 100.00));
        customers.add(new Customer("0002","B", 200.00));
        customers.add(new Customer("0003","C", 300.00));
        customers.add(new Customer("0004","B", 200.00));

        for (Customer customer : customers) {
            double totalCharges = calculateTotalCharges(customer);
            printBillingStatement(customer, totalCharges);
        }
    }
    private static double calculateTotalCharges(Customer customer) {
        double discount = calculateDiscount(customer.planType);
        double discountedCharges = customer.charges * (1 - discount);
        double vat = discountedCharges * 0.10;
        return discountedCharges + vat;
    }
    private static double calculateDiscount(String planType) {
        switch (planType) {
            case "B":
                return 0.10;
            case "C":
                return 0.25;
            default:
                return 0.0;
        }
    }
    private static void printBillingStatement(Customer customer, double totalCharges) {
        System.out.println("Customer Code: " + customer.customerCode);
        System.out.println("Plan Type: " + customer.planType);
        System.out.println("Total Charges: " + totalCharges);
        System.out.println();
    }
}

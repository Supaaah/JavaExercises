package JavaPrograms.Looping;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        String str = Integer.toString(num);
        int sum = 0;
        for(int i = 0; i < str.length(); i++) {
            sum += str.charAt(i) - '0'; //every loop ('1'-'0') ('2'-'0') exclude 0
        }
        System.out.print(sum);
        scan.close();
    }
}

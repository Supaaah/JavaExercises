package JavaPrograms.Looping;

import java.util.Scanner;

public class ReverseNumber {
    public static int reverse(int num){
        String rev = "";
        String str = Integer.toString(num);
        for(int i = str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        return Integer.parseInt(rev);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        System.out.print("Reverse: "+reverse(num));
    }
}

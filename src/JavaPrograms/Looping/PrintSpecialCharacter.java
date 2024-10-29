import java.util.Scanner;

public class PrintSpecialCharacter{
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Enter a sentence with special character: ");
        String sentence = scanner.nextLine();
        for(int i = 0; i<sentence.length();i++){
            char ch = sentence.charAt(i);
            if(!((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) && !(ch >= '0' && ch <= '9') && !(ch == ' ')){
                System.out.print(ch + " ");
            }
        }
    }
    
}

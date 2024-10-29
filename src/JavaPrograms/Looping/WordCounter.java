import java.util.Scanner;

public class WordCounter{
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        Counter(scan);
        
    }
    
    public static void Counter(Scanner scan){
        System.out.print("Write a sentence: ");
        String sentence = scan.nextLine();
         int count = 1;
         
        for(int i =0; i<sentence.length();i++){
            if(sentence.charAt(i) == ' '){
                count++;
            }
        }
        System.out.println("Word count: "+count);
    }
}

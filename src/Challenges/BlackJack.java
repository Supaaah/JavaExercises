import java.util.Scanner;

import static Challenges.Javapedia.scan;

public class BlackJack{
    
    public static Scanner scan = new Scanner(System.in);
    
    public static void main(String [] args){
        
        System.out.println("\nWelcome to Java Casino!");
        System.out.println("Do you have a knack for Black Jack?");
        System.out.println("We shall see..");
        System.out.println("..Ready? Press anything to begin!");
        scan.nextLine();
        
        int yourCard1 = drawRandomCard();
        int yourCard2 = drawRandomCard();

        System.out.println("\n You get a \n" + cardString(yourCard1) + "\n and a \n" + cardString(yourCard2));
        int total = cardValue(yourCard1) + cardValue(yourCard2);
        System.out.println("your total is: " + total);
        
        int dealerCard1 = drawRandomCard();
        int dealerCard2 = drawRandomCard();    
        
        System.out.println("\n" + dealerCard1 + "\nand has a card facing down \n" + faceDown());
        int dealerTotal = cardValue(dealerCard1) + cardValue(dealerCard2);
        System.out.println("\nThe dealer's total is hidden");

        deterMineWinner(total,delearTotal);
        }
         scan.close();
    }
    public static int cardValue(int card){
        return Math.min(card,10);
    }
    public static int drawRandomCard(){
        int randomNum = (int) (Math.random() * 13) + 1;
        return randomNum;
    }
    public static String deterMineWinner(int total, int dealerTotal){
         while(true){
            String choice = hitOrStay();
            if (choice.equalsIgnoreCase("stay")) {
                break;
            }
            int newCard = drawRandomCard();
            total += Math.min(newcard,10);
            System.out.println("\nYou get a\n" + cardString(newCard));
            System.out.println("your total is " + total);

            if (total > 21) {
                System.out.println("Bust! Player loses");
                System.exit(0);
            }
    }
    public static String cardString(int cardNumber){
        switch(cardNumber){
            case 1:   
            return "   _____\n"+
                   "  |A _  |\n"+ 
                   "  | ( ) |\n"+
                   "  |(_'_)|\n"+
                   "  |  |  |\n"+
                   "  |____V|\n";
            case 2:
            return  "   _____\n"+              
                    "  |2    |\n"+ 
                    "  |  o  |\n"+
                    "  |     |\n"+
                    "  |  o  |\n"+
                    "  |____Z|\n";
                  
            case 3:
            return"   _____\n" +
                  "  |3    |\n"+
                  "  | o o |\n"+
                  "  |     |\n"+
                  "  |  o  |\n"+
                  "  |____E|\n";

            case 4:
            return "   _____\n" +
                   "  |4    |\n"+
                   "  | o o |\n"+
                   "  |     |\n"+
                   "  | o o |\n"+
                   "  |____h|\n";

            case 5:
            return  "   _____ \n" +
                    "  |5    |\n" +
                    "  | o o |\n" +
                    "  |  o  |\n" +
                    "  | o o |\n" +
                    "  |____S|\n";

            case 6:
            return  "   _____ \n" +
                    "  |6    |\n" +
                    "  | o o |\n" +
                    "  | o o |\n" +
                    "  | o o |\n" +
                    "  |____6|\n";

            case 7:
            return  
                    "   _____ \n" +
                    "  |7    |\n" +
                    "  | o o |\n" +
                    "  |o o o|\n" +
                    "  | o o |\n" +
                    "  |____7|\n";
          

            case 8:
            return  "   _____ \n" +
                    "  |8    |\n" +
                    "  |o o o|\n" +
                    "  | o o |\n" +
                    "  |o o o|\n" +
                    "  |____8|\n";
            case 9:
            return  "   _____ \n" +
                    "  |9    |\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |____9|\n";

            case 10:
            return  "   _____ \n" +
                    "  |10  o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |___10|\n";
            case 11:
            return  "   _____\n" +
                    "  |J  ww|\n"+ 
                    "  | o {)|\n"+ 
                    "  |o o% |\n"+ 
                    "  | | % |\n"+ 
                    "  |__%%[|\n";
            case 12:
            return  "   _____\n" +
                    "  |Q  ww|\n"+ 
                    "  | o {(|\n"+ 
                    "  |o o%%|\n"+ 
                    "  | |%%%|\n"+ 
                    "  |_%%%O|\n";
            case 13:
            return  "   _____\n" +
                    "  |K  WW|\n"+ 
                    "  | o {)|\n"+ 
                    "  |o o%%|\n"+ 
                    "  | |%%%|\n"+ 
                    "  |_%%%>|\n";

             default: return "not possible";
        }
    }
    
     public static String faceDown() {
        return
        "   _____\n"+
        "  |     |\n"+ 
        "  |  J  |\n"+
        "  | JJJ |\n"+
        "  |  J  |\n"+
        "  |_____|\n";
    }
    
    public static String hitOrStay(){
        
        System.out.println("Would you like to hit or stay?");
        String response = scan.nextLine();
        
        while (!(response.equalsIgnoreCase("hit") || response.equalsIgnoreCase("stay"))) {
            System.out.println("Please write hit or stay");
            response = scan.nextLine();
        }
        return response;
    }

}

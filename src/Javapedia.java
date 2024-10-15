import java.util.Scanner;

public class Javapedia {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println("\n**********Javapedia**********");
        System.out.println("How many historical figures will you register?");
        int figures = scan.nextInt();
        String [][] histFigures = new String[figures][3];
        scan.nextLine(); 
        
        insertData(histFigures);
       
        System.out.println("These are the values you stored:"); 
        print2DArray(histFigures);

        System.out.print("\nWho do you want information on? ");  
        String name = scan.nextLine();
        
        searchNameAndPrint(name, histFigures);
     
        scan.close();
    }
    public static void insertData(String [][] histFigures){
         for (int i = 0; i < histFigures.length; i++) {
            System.out.println("\n\tFigure " + (i+1));
            System.out.print("\t - Name: ");
            histFigures[i][0] = scan.nextLine();
            System.out.print("\t - Date of birth: ");
            histFigures[i][1] = scan.nextLine();
            System.out.print("\t - Occupation: ");
            histFigures[i][2] = scan.nextLine();
            System.out.print("\n");
        }
    }
    public static void searchNameAndPrint(String name, String [][] histFigures){
        for(int i = 0; i<histFigures.length;i++){
            if (histFigures[i][0].equals(name)) {
                System.out.println("\tName: " + histFigures[i][0]);
                System.out.println("\tDate of birth: " + histFigures[i][1]);
                System.out.println("\tOccupation: " + histFigures[i][2]);
            }
        }
    }

    public static void print2DArray(String [][] histFigures){
          for (int i = 0; i < histFigures.length; i++) {
            System.out.print("\t");
            for (int j = 0; j < histFigures[i].length; j++) {
                System.out.print(histFigures[i][j] + " "); 
            }
            System.out.print("\n");
        }
    }
}
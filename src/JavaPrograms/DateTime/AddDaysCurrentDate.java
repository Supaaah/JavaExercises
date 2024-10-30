import java.time.LocalDate;

public class AddDaysCurrentDate{
    
    public static void main(String [] args){
        LocalDate dateNow = LocalDate.now();    
        LocalDate futureDate = dateNow.plusDays(10);
        System.out.println("Date 10 days in the furture: " + futureDate);
    }
}

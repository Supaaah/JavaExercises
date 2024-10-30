import java.time.LocalDate;

public class AddMonthsCurrentDate{
    
    public static void main(String [] args){
        LocalDate dateNow = LocalDate.now();    
        LocalDate futureDate = dateNow.plusMonths(10);
        System.out.println("Date 10 months in the furture: " + futureDate);
    }
}

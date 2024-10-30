import java.time.LocalDate;

public class MinusDaysCurrentDate{
    
    public static void main(String [] args){
        LocalDate dateNow = LocalDate.now();    
        LocalDate pastDate = dateNow.minusDays(10);
        System.out.println("Date 10 days in the past: " + pastDate);
    }
}

package JavaPrograms.DateTime;
import java.time.LocalDate;
import java.time.Period;

public class DifferenceBetweenTwoDates {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2024,10,1);
        LocalDate dateNow = LocalDate.now();
        Period difference = Period.between(date, dateNow);
        System.out.println(difference.getDays());
    }
}


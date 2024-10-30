import java.time.LocalDate;

public class ParseDateComponents {
    public static void main(String[] args) {
        
        LocalDate dateToday = LocalDate.now();
        int year = dateToday.getYear();
        int month = dateToday.getMonthValue();
        int day = dateToday.getDayOfMonth();
        System.out.println("Date today: " + dateToday);
        System.out.println("\nYear: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
    }
}

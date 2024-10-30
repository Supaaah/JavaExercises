import java.time.LocalDate;

public class ParseDateComponentsDateToString {
    public static void main(String[] args) {
        String dateToday = "2024-10-30";
        
        LocalDate date = LocalDate.parse(dateToday);
        int year = date.getYear();
        int month = date.getMonthValue();
        int day = date.getDayOfMonth();
        
        System.out.println("Parse String Date: " + dateToday);
        System.out.println("\nYear: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
    }
}

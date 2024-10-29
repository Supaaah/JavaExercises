package JavaPrograms.DateTime;

import java.time.LocalDate;

public class TenDaysBeforeAfter {
    public static void main(String[] args) {
        LocalDate dateToday = LocalDate.now();
        LocalDate before10Days = dateToday.minusDays(10);
        LocalDate after10Days = dateToday.plusDays(10);
        System.out.println("Date Today: "+dateToday);
        System.out.println("Date 10 days before: "+ before10Days);
        System.out.println("Date 10 days after: "+ after10Days);
    }
}

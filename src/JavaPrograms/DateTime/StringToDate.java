package JavaPrograms.DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StringToDate {
    public static void main(String[] args) {
        String dateString = "2024-10-29";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse(dateString, formatter);
        System.out.println(date);
    }
}

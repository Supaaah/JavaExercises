package JavaPrograms.DateTime;

import java.time.LocalDate;
import java.time.LocalTime;

public class CurrentDateWithoutViceVersa {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();

        System.out.println("Current Date: " + currentDate);
        System.out.println("Current Time: " + currentTime);
    }
}

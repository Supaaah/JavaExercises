package JavaPrograms.DateTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PrintLocalDateAndTime {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(now.format(formatter));
    }
}


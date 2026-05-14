import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;
public class Time_Date {
    public static void main(String[] args) {

        LocalDate today =  LocalDate.now();
        System.out.println("Today: " + today);

        LocalTime time = LocalTime.now();
        System.out.println("Current Time: " + time);

        LocalDateTime now = LocalDateTime.now();
        System.err.println("Current Date and Time: "+now);

        
    }
}



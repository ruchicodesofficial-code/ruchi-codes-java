package java8features;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo {
    public static void main(String[] args) {
        //Current Date
        LocalDate date = LocalDate.now();
        System.out.println("Current date: "+date);
        //Current time
        LocalTime time = LocalTime.now();
        System.out.println("Current time: "+time);
        //Current Date and time
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("current date & time: "+localDateTime);
        //Custom date
        LocalDate customDate = LocalDate.of(2000,10,23);
        System.out.println(customDate);
        //period
        Period p = Period.between(customDate,date);
        System.out.println("Difference: "+
                p.getYears()+"Years "+
                p.getMonths()+ "Months "+
                p.getDays()+"Days");
        //Date Formatting
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = localDateTime.format(formatter);
        System.out.println("Formatted date time: "+formattedDate);
    }
}

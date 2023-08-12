package day22staticblocksconstructorsdatetime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeReview {

    public static void main(String[] args) {

        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("HH:mm:ss a");
        System.out.println(dtf.format(LocalTime.now()));


    }
}

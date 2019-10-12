package java_time;

import java.time.*;

public class TimeTest {

    public static void main(String[] args) {

        ZonedDateTime nowSeoule = ZonedDateTime.now();
        System.out.println("now seoul               : " + nowSeoule);

        ZonedDateTime nowNewYork = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("now New York            : " + nowNewYork);

        ZonedDateTime time1 = ZonedDateTime.of(2019, 10, 12, 15, 30, 55, 0, ZoneId.of("Asia/Seoul"));
        ZonedDateTime time2 = Year.of(2019).atMonth(10).atDay(12).atTime(15, 30, 55).atZone(ZoneId.of("Asia/Seoul"));
        System.out.println("time1                   : " + time1);
        System.out.println("time2                   : " + time2);
        System.out.println("time1, time2 equal?     : " + (time1.equals(time2)));

        System.out.println("\n````````````````````````````````````````````````````````");

        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.of(18, 30, 40);
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        LocalDateTime localDateTime2 = LocalDateTime.of (2019, 10, 10, 10, 10, 10, 0);
        LocalDateTime localDateTime3 =Year.of(2019).atMonth(10).atDay(10).atTime(10, 10, 10);
        System.out.println("localDate       : " + localDate);
        System.out.println("localTime       : " + localTime);
        System.out.println("localDateTime   : " + localDateTime);
        System.out.println("localDateTime2  : " + localDateTime2);
        System.out.println("localDateTime3  : " + localDateTime3);

        System.out.println("\n````````````````````````````````````````````````````````");

        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, ZoneId.of("Asia/Seoul"));
        System.out.println("zonedDateTime : " + zonedDateTime);


        System.out.println("\n````````````````````````````````````````````````````````");

        localDateTime = LocalDateTime.of (2019, 10, 10, 10, 10, 10, 0);
        System.out.println("localDateTime           : " + localDateTime);
        localDateTime = localDateTime.minusDays(30);
        System.out.println("localDateTime - 30day   : " + localDateTime);
        localDateTime = localDateTime.plusHours(3);
        System.out.println("localDateTime + 3hours  : " + localDateTime);


    }
}

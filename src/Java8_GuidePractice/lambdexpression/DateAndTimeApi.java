package Java8_GuidePractice.lambdexpression;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class DateAndTimeApi {

    public static void main(String[] args) {

        // OLD API (Calendar - mutable)
        Calendar currentDay = Calendar.getInstance();
        System.out.println("cal: " + currentDay.getTime());

        currentDay.add(Calendar.DAY_OF_MONTH, 6);
        System.out.println("cal after: " + currentDay.getTime());

        // NEW API (LocalDate - immutable)
        LocalDate today = LocalDate.now();
        System.out.println("today: " + today);

        LocalDate futureDate = today.plusDays(6);
        System.out.println("future (today unchanged): " + today);
        System.out.println("future date: " + futureDate);

        // Time
        LocalTime time = LocalTime.now();
        System.out.println("current time: " + time);

        //Date Formatting
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatDate = today.format(formatter);

        System.out.println("not formatted today: " + today);
        System.out.println("formatted date: " + formatDate);

        //  Time Formatting
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedTime = time.format(timeFormatter);

        System.out.println("formatted time: " + formattedTime);

        // Note: Immutable → original object doesn't change

        //ZonedTime:
        //different time evrywhere
        //timezone decided ->
        ZonedDateTime ZonedTime=ZonedDateTime.now();
        System.out.println("ZonedTime :"+ZonedTime);//2026-03-21T17:54:40.394435700+05:30[Asia/Calcutta]

//specific zone time
        ZonedDateTime NYC_Time=ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("NYC_Time :"+NYC_Time);

        ZonedDateTime LA_Time=ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println("LA_Time :"+LA_Time);

        ZonedDateTime UTC=ZonedDateTime.now(ZoneId.of("UTC"));
        System.out.println("UTC:"+ UTC);

        //instant to find zero meridian
        //UTC and instant both time are same
        //shcedule meeting for 4 different time zone implement this
        //local time ->suppose new york
        //apply zone id and apply formatter to schedule different time zone meeting
        //But our time zone is +5:30 then why it is -5:30 in this map ?
        //it's based on reverse logic , instead of ahead of utc , how much behind is utc
        //ok got it.. it returns utc time by subtracting 5:30

        Instant instant=Instant.now();
        System.out.println("instant: "+instant);

        //schedule meeting at different time zone:
//        time and date provided


        LocalDate lastDayOf20Century= LocalDate.of(1999,12,29);
        System.out.println("lastdayof20century:"+ lastDayOf20Century);
        LocalDateTime meetingTime=LocalDateTime.of(2026,03,27,9,30);
        System.out.println("meeting time: "+meetingTime);

        ZoneId zoneId=ZoneId.of("America/New_York");
        ZonedDateTime zonemeetingTime=ZonedDateTime.of(meetingTime,zoneId);
        System.out.println(" zonemeetingTime: "+zonemeetingTime);

//invitation to india wale
        //indian zone

        ZonedDateTime IndianMeetingTime=zonemeetingTime.withZoneSameInstant(ZoneId.of("Asia/Kolkata"));
        System.out.println("indian time: "+ IndianMeetingTime);

//india independence day
        LocalDate indeencependentDay=LocalDate.of(1974,8,15);
        System.out.println("independent:"+ indeencependentDay);

    }
}


//time-zone-map-standard-time-international-date-line.jpg (2000×1200)
//earth map
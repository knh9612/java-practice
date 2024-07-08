package time.test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

// 서울의 회의 시간은 2024년 1월 1일 오전 9시다. 이떄 런던, 뉴욕의 회의 시간을 구해라.
// 실행 결과를 참고하자.
public class TestZone {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2024, 1, 1);
        LocalTime localTime = LocalTime.of(9, 0);
        ZoneId zoneId = ZoneId.of("Asia/Seoul");

        ZonedDateTime seoulTime = ZonedDateTime.of(localDate, localTime, zoneId);

        ZonedDateTime londonTime = seoulTime.withZoneSameInstant(ZoneId.of("Europe/London"));
        ZonedDateTime nyTime = seoulTime.withZoneSameInstant(ZoneId.of("America/New_York"));

        System.out.println("서울의 회의 시간: " + seoulTime);
        System.out.println("런던의 회의 시간: " + londonTime);
        System.out.println("뉴욕의 회의 시간: " + nyTime);
    }
}

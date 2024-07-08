package time.test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

// 2024년 1월 1일 부터 2주 간격으로 5번 반복하여 날짜를 출력하는 코드를 작성하세요.
public class TestLoopPlus {

    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2024, 1, 1);
        for (int i = 0; i < 5; i++) {
            LocalDate nextDate = startDate.plus(2 * i, ChronoUnit.WEEKS);
            LocalDate nextDate2 = startDate.plusWeeks(2 * i); // 위 코드와 같음
            System.out.println("날짜 " + (i+1) + ": " + nextDate);
        }

    }
}

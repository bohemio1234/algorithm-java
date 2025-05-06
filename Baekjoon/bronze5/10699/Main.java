import java.time.LocalDate;
import java.time.ZoneId; // ZoneId 클래스도 임포트해야 함!

public class Main {
    public static void main(String[] args) {
        // 1. 서울 시간대(ZoneId)를 지정한다.
        ZoneId seoulZone = ZoneId.of("Asia/Seoul");

        // 2. 지정한 시간대의 '현재 날짜'를 가져온다.
        LocalDate todayInSeoul = LocalDate.now(seoulZone);

        // 3. 출력한다. (LocalDate는 기본적으로 YYYY-MM-DD 형식으로 출력됨)
        System.out.println(todayInSeoul);

        // 참고로 지금 시간 (2025-05-06 JST) 기준이면 서울도 2025-05-06 이겠지.
    }
}
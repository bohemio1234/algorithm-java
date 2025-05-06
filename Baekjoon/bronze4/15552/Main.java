import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //I
        
        StringBuilder sb = new StringBuilder(); // StringBuilder 생성
        //여기에다가 내용 차곡차곡 쌓는다.
        
        StringTokenizer st;
        //단어쪼개기도구준비 (공백 기준으로 쪼갬)

        int t = Integer.parseInt(br.readLine());
        //테스트케이스읽기

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            // 계산 결과를 StringBuilder에 추가 (개행문자 '\n' 포함)
            sb.append(a + b).append('\n');
        }
        br.close(); // 입력은 끝났으니 닫고

        // 모든 결과를 모은 StringBuilder 내용을 한 번에 출력! (print 사용 추천)
        System.out.print(sb.toString());
        //stringbuilder에 쌓인 모든 내용을 하나의 거대한 string으로.
    }
}
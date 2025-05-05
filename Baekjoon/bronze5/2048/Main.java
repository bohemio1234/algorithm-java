// Problem: https://www.acmicpc.net/problem/2438
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        // 바깥 루프: 1번째 줄부터 n번째 줄까지
        for (int i = 1; i <= n; i++) {
            // 안쪽 루프: 현재 줄 번호(i)만큼 별을 찍음
            for (int j = 1; j <= i; j++) {
                System.out.print("*"); // print 사용! 줄 바꾸지 않음!
            }
            // 한 줄의 별 찍기가 끝나면 다음 줄로 넘어감
            System.out.println(); // println() 으로 줄바꿈만 실행!
        }

        scanner.close();
    }
}
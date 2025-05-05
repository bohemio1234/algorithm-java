//https://www.acmicpc.net/problem/10807

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. 정수의 개수 N 읽기
        int n = scanner.nextInt();



        // 2. 크기가 N인 배열 선언
        int[] numbers = new int[n]; // 변수명 소문자 시작, int[] 스타일 사용

        // 3. N개의 정수를 읽어 배열에 저장
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // 4. 찾으려는 정수 v 읽기
        int v = scanner.nextInt();

        // 5. v의 개수를 셀 변수 초기화
        int count = 0;

        // 6. 배열을 처음부터 끝까지 확인하며 v와 같은지 검사
        // (향상된 for문 사용도 가능: for (int num : numbers) { ... })
        for (int i = 0; i < n; i++) {
            if (numbers[i] == v) {
                count++; // 같으면 count 증가
            }
        }

        // 7. 최종 개수 출력
        System.out.println(count);

        // 8. 스캐너 닫기
        scanner.close();
    }
}
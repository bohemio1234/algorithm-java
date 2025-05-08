import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. 행렬 크기 N, M 입력 받기
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        // 2. 행렬 A, B 생성 (N x M 크기)
        int[][] matrixA = new int[n][m];
        int[][] matrixB = new int[n][m];

        // 3. 행렬 A 입력 받기 (중첩 for문 사용)
        for (int i = 0; i < n; i++) { // 행 반복 (0부터 n-1까지)
            for (int j = 0; j < m; j++) { // 열 반복 (0부터 m-1까지)
                matrixA[i][j] = scanner.nextInt();
            }
        }

        // 4. 행렬 B 입력 받기 (중첩 for문 사용)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrixB[i][j] = scanner.nextInt();
            }
        }

        scanner.close(); // 입력 끝났으니 스캐너 닫기

        // 5. 행렬 덧셈 결과 계산 및 출력 (중첩 for문 사용)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // 같은 위치 (i, j)의 원소끼리 더한 결과를 바로 출력
                System.out.print(matrixA[i][j] + matrixB[i][j]);

                // 현재 열이 마지막 열이 아니면 공백 출력
                if (j < m - 1) {
                    System.out.print(" ");
                }
            }
            // 한 행 출력이 끝나면 줄바꿈
            System.out.println();
        }
    }
}
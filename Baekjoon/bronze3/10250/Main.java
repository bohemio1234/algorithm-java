import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) { // 0부터 t-1까지 반복 (더 일반적)
            int h = scanner.nextInt(); // 호텔 층 수
            int w = scanner.nextInt(); // 각 층의 방 수 (이 문제에서는 계산에 직접 쓰이진 않음)
            int n = scanner.nextInt(); // 몇 번째 손님

            int floor, roomNum;

            if (n % h == 0) { // N이 H의 배수이면
                floor = h;           // 꼭대기층
                roomNum = n / h;     // N/H 호실
            } else { // N이 H의 배수가 아니면
                floor = n % h;       // N%H 층
                roomNum = (n / h) + 1; // (N/H + 1) 호실
            }

            // 방 번호 계산: 층 * 100 + 호실
            // 호실 번호가 10보다 작으면 YY0X 형태가 되도록 floor * 100
            // (예: 4층 2호 -> 402, 12층 3호 -> 1203)
            System.out.println(floor * 100 + roomNum);
        }
        scanner.close();
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int k = 0; k < t; k++) {
            int h = scanner.nextInt(); // 층 수
            int w = scanner.nextInt(); // 방 수 (계산에는 불필요)
            int n = scanner.nextInt(); // N번째 손님

            int floor = (n - 1) % h + 1;
            int room = (n - 1) / h + 1;

            System.out.println(floor * 100 + room);
        }
        scanner.close();
    }
}
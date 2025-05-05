//https://www.acmicpc.net/problem/2753

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        // 윤년 조건: (4의 배수 && 100의 배수 아님) OR (400의 배수)
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("1"); // 윤년이면 1
        } else {
            System.out.println("0"); // 아니면 0
        }

        scanner.close();
    }
}
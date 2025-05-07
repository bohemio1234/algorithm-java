import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        // 결과를 담을 변수 선언
        double score = 0.0;

        switch (grade) {
            case "A+": score = 4.3; break; // 값을 변수에 할당하고 break!
            case "A0": score = 4.0; break;
            case "A-": score = 3.7; break;
            case "B+": score = 3.3; break;
            case "B0": score = 3.0; break;
            case "B-": score = 2.7; break;
            case "C+": score = 2.3; break;
            case "C0": score = 2.0; break;
            case "C-": score = 1.7; break;
            case "D+": score = 1.3; break;
            case "D0": score = 1.0; break;
            case "D-": score = 0.7; break;
            case "F":  score = 0.0; break;


        }

        // switch 문 바깥에서 한 번만 출력
        System.out.println(score);
    }
}
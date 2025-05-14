import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        int multiplyResult = a * b * c;
        
        //곱한결과를 문자열로 변환.
        String resultString = String.valueOf(multiplyResult);
        
        //각 숫자 저장할 배열
        int[] digitCounts = new int[10];
        
        for (int i = 0 ; i < resultString.length(); i++){
            char digitChar = resultString.charAt(i);
            int digit = digitChar - '0';
            digitCounts[digit]++;
        }
        
                for (int i = 0; i < 10; i++) {
            System.out.println(digitCounts[i]);
        }
    }
}
        
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. 문장 전체를 한 줄로 읽는다.
        String line = scanner.nextLine();
        scanner.close();

        // 2. StringTokenizer 객체를 생성한다.
        //    입력받은 line을 기본 구분자(공백, 탭, 줄바꿈 등)로 쪼갤 준비를 한다.
        //    StringTokenizer는 앞/뒤 공백이나 연속된 공백을 알아서 무시하고 단어만 잘라준다.
        StringTokenizer st = new StringTokenizer(line);

        // 3. countTokens() 메소드로 쪼개진 단어(토큰)의 개수를 센다.
        int wordCount = st.countTokens();

        // 4. 단어 개수 출력
        System.out.println(wordCount);
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        scanner.close();

        // 1. 문자열 양쪽 끝의 공백을 제거한다. (예: "  hello world  " -> "hello world")
        String trimmedLine = line.trim();

        // 2. 만약 trim 후 문자열이 비어있다면 단어는 0개다.
        if (trimmedLine.isEmpty()) {
            System.out.println(0);
        } else {
            // 3. 공백(" ")을 기준으로 문자열을 쪼개서 문자열 배열로 만든다.
            //    (문제에서 "단어는 공백 한 개로 구분되며, 공백이 연속해서 나오는 경우는 없다"고 했으므로
            //    단순 " "로 쪼개도 괜찮다. 더 일반적인 경우는 "\\s+"로 하나 이상의 공백을 처리한다.)
            String[] words = trimmedLine.split(" ");
            // 4. 쪼개진 배열의 길이가 단어의 개수다.
            System.out.println(words.length);
        }
    }
}
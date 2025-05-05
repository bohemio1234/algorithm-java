import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Read number of test cases T
        int t = scanner.nextInt();

        // 2. Loop T times
        for (int i = 0; i < t; i++) {
            // 3. Read the input string S
            String s = scanner.next();

            // 4. Get the first character (index 0)
            char firstChar = s.charAt(0);

            // 5. Get the last character (index length - 1)
            char lastChar = s.charAt(s.length() - 1);

            // 6. Print first and last char concatenated
            // Method A: Print chars directly
            System.out.print(firstChar);
            System.out.println(lastChar);
            // Method B: Build a string (slightly less direct but also works)
            // System.out.println("" + firstChar + lastChar);
            // Method C: Use StringBuilder
            // StringBuilder sb = new StringBuilder();
            // sb.append(firstChar);
            // sb.append(lastChar);
            // System.out.println(sb.toString());
        }

        scanner.close();
    }
}
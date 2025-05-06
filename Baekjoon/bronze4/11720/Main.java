import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String numberString = scanner.next();
        scanner.close();
        
        int sum = 0;
        
        for(int i = 0; i < n; i++){
            char digitChar = numberString.charAt(i);
            int digit = Character.getNumericValue(digitChar);
            sum += digit;
            
        }
        
        System.out.println(sum);
    }
}
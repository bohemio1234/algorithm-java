import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        scanner.close();
        
        System.out.println(a+b-c);
        //int->String
        String StrA = String.valueOf(a);
        String StrB = String.valueOf(b);
        
        //A+B
        String StrAB = StrA + StrB;
        
        //AB를 int로
        int numAB = Integer.parseInt(StrAB);
        
        System.out.println(numAB - c);
        
    }
}
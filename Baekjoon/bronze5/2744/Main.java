//https://www.acmicpc.net/problem/2744
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        scanner.close();
        
        StringBuilder result = new StringBuilder();
        
        for(int i=0; i < word.length(); i++){
            char c = word.charAt(i);
                
            if(Character.isUpperCase(c)){
                result.append(Character.toLowerCase(c));
            }
            else if(Character.isLowerCase(c)){
                result.append(Character.toUpperCase(c));
            }
        }
        
        System.out.println(result);
    }
}
       
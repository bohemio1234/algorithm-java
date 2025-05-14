import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[8];
        for(int i = 0 ; i < numbers.length; i++){
          numbers[i] = scanner.nextInt();   
        }
        scanner.close();
        
        boolean isAscending = true;
        boolean isDescending = true;
        
        for (int i = 0 ; i < 8 ; i++){
            if(numbers[i] != i+1) {
                isAscending = false;
            }
            if (numbers[i] != 8 - i) {
                isDescending = false;
            }
        }
        
        if (isAscending) {
            System.out.println("ascending");
        } else if (isDescending) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
    }
}
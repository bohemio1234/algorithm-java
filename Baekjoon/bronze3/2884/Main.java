import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt();
        int m = scanner.nextInt();
        
        scanner.close();
        
        int newTime = (h * 60 + m) - 45;
            
    if(h==0 && m<45){
        System.out.print(23);
        System.out.print(" ");
        System.out.print(m + 15);
     }
        else{       
        System.out.print(newTime / 60);
        System.out.print(" ");
        System.out.print(newTime % 60);
        }
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt();
        int m = scanner.nextInt();

        scanner.close();


        int totalMinutes = 60 * h + m;

        int newTotalMinutes = totalMinutes - 45;

        if(newTotalMinutes < 0){
            newTotalMinutes += 24 * 60;
        }

        int newH = newTotalMinutes / 60;
        int newM = newTotalMinutes % 60;

        System.out.print(newH + " " + newM);

    }
}


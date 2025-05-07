import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        List<Integer> studentList = new ArrayList<Integer>();

        for(int i = 1; i <= 30; i++){
            studentList.add(i);
        }

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<Integer>();

        for(int i = 1; i <= 28; i++){
            int sss = scanner.nextInt();
            numbers.add(sss);
        }

        scanner.close();

        studentList.removeAll(numbers);

        int min = Collections.min(studentList);
        int max = Collections.max(studentList);

        System.out.println(min);
        System.out.println(max);
    }
}
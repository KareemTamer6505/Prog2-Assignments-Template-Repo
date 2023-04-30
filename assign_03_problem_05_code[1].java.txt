//kareem tamer hany 
//20216505
import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of test cases: ");
        int t = scanner.nextInt();

        while (t-- > 0) {
            System.out.print("Enter X and Y: ");
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            int sum = 0;

            for (int i = x + 1; i < y; i++) {
                if (i % 2 != 0) {
                    sum += i;
                }
            }

            System.out.println("Sum of all odd numbers between " + x + " and " + y + " (excluding X and Y): " + sum);
        }
    }
}

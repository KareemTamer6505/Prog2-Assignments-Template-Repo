//kareem tamer hany 
//20216505
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter X and Y: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        int sum = 0;
        int count = 0;

        while (count < y) {
            if (x % 2 != 0) {
                sum += x;
                count++;
            }
            x++;
        }

        System.out.println("Sum of the consecutive " + y + " odd numbers starting from " + (x - y) + " " + sum);
    }
}



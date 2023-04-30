//kareem tamer hany
//20216505
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows  ");
        int numRows = scanner.nextInt();

        for (int i = 1; i <= numRows; i++) {
            // print spaces before asterisks
            for (int j = 1; j <= numRows - i; j++) {
                System.out.print(" ");
            }
            // print asterisks
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}

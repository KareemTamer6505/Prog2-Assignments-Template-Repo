//kareem tamer hany 
//20216505
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Pum");
            } else if (i % 3 == 0) {
                System.out.println("Pum");
            } else if (i % 5 == 0) {
                System.out.println("Pum");
            } else {
                System.out.println(i);
            }
        }
    }
}

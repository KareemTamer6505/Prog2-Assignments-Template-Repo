//kareem tamer hany
//20216505
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number");
        int numTerms = scanner.nextInt();

        int firstTerm = 0;
        int secondTerm = 1;

        System.out.print("Fibonacci sequence: " + firstTerm);

        if (numTerms > 1) {
            System.out.print(" " + secondTerm);
        }

        for (int i = 3; i <= numTerms; i++) {
            int nextTerm = firstTerm + secondTerm;
            System.out.print(" " + nextTerm);

            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

        System.out.println();
    }
}

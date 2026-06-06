//Package for day 10 Assignment
package Day10;

//import Scanner for user input
import java.util.Scanner;

//Define class
public class P37_starPyaramid {
    // Main Function
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter the order : ");
        int n = num.nextInt();
        int i, j, k;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();

        }
        num.close();
    }

}

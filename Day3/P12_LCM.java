//package for assignment on day 3
package Day3;

//Import scanner for user input
import java.util.Scanner;

//define a class
public class P12_LCM {
    // function for GCD
    static int GCD(int a, int b) {
        int c;

        while (b != 0) {
            c = b;
            b = a % b;
            a = c;
        }

        return a;
    }

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter both numbers : ");
        int n1 = num.nextInt();
        int n2 = num.nextInt();
        int result, n;
        // GCD function calling
        n = GCD(n1, n2);
        // LCM formula (product of both number divided by GCD )
        result = (n1 * n2) / n;
        // Printing the LCM
        System.out.println(" LCM is " + result);
        num.close();
    }

}

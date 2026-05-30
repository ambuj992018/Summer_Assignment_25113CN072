//package for assignment of day 3
package Day3;

//import scanner for user input
import java.util.Scanner;

//define class
public class P11_GCD {

    // Function for calculating GCD
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
        int result;
        result = GCD(n1, n2);
        System.out.println("GCD of " + n1 + " and " + n2 + " is " + result);
        num.close();
    }

}

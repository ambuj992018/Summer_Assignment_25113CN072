//PACKAGE FOR DAY11 ASSIGNMENT
package Day11;

//IMPORT SCANNER FOR USER INPUT
import java.util.Scanner;

//DEFINE CLASS
public class P44_factorialFunction {
    // USER DEFINED FUNCTION
    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    // MAIN FUNCTION
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        System.out.print("Enter a number  : ");
        int n = num.nextInt();
        int f = factorial(n);
        System.out.print("Factorial of " + n + " is : " + f);
        num.close();
    }

}

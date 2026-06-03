//package for assignment of day 6
package Day7;

//Import Scanner for user input 
import java.util.Scanner;

//define class
public class P25_factorial_Recursive {
    static int R_Factorial(int a) {
        if (a == 0 || a == 1)
            return 1; // BASE CASE
        else
            return a * R_Factorial(a - 1); // RECURSIVE CASE
    }

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = num.nextInt();
        int F;
        F = R_Factorial(n);
        System.out.print("Factorial of " + n + " is " + F);

        num.close();
    }
}
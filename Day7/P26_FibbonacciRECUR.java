//package for day 7 assignment
package Day7;

//import Scanner for user input 
import java.util.Scanner;

//define class
public class P26_FibbonacciRECUR {
    // Recursive function
    static int fibbo(int a) {
        if (a == 0)
            return 0; // base case
        if (a == 1)
            return 1; // base case

        return fibbo(a - 1) + fibbo(a - 2); // recursive case

    }

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter number of terms :");
        int n = num.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print(fibbo(i) + "\t");
        }
        num.close();
    }
}

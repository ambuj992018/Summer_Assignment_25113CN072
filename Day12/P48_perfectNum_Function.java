//Package for Day 12 Assignment
package Day12;

//import Scanner for user input 
import java.util.Scanner;

//define class
public class P48_perfectNum_Function {
    // user defined function
    static void perfect(int n) {
        int i, sum = 0;
        for (i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (sum == n)
            System.out.print(n + " is a Perfect Number . ");
        else
            System.out.print(n + " is not a Perfect number .");

    }

    // Main function
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = num.nextInt();

        perfect(n);

        num.close();

    }

}

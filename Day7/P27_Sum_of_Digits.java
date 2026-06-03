//Package for day 7 assignment
package Day7;

//import scanner for user input 
import java.util.Scanner;

//Define class
public class P27_Sum_of_Digits {
    // Recursuive function
    static int sum(int a) {
        if (a == 0)
            return 0; // base case
        return (a % 10 + sum(a / 10)); // Recursive case
    }

    // main function
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = num.nextInt();
        int S;
        S = sum(n);
        System.out.print("Sum of digits is " + S);
        num.close();
    }
}
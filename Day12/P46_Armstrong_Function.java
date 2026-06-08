//Package for assignment of day 12
package Day12;

//import scanner for user input
import java.util.Scanner;
//import math for user to operate mathematical operations 
import java.lang.Math;

//define class
public class P46_Armstrong_Function {
    // user defined function to count number of digits
    static int count(int n) {
        int c = 0;
        while (n > 0) {
            c++;
            n = n / 10;
        }
        return c;
    }

    // User defined function for Armstrong test
    static void Arm_Test(int n) {
        int p, n1, sumA = 0;
        n1 = n;
        // calling function
        p = count(n);
        while (n > 0) {
            sumA += Math.pow((n % 10), p);
            n = n / 10;
        }
        n = n1;
        if (sumA == n) {
            System.out.print(n + " ia an Armstrong number .\n");
        } else {
            System.out.print(n + " is not an Armstrong number .\n");
        }
    }

    // main function
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = num.nextInt();
        Arm_Test(n);
        num.close();

    }

}

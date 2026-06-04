//package for day 8 assignment
package Day8;

//import scanner for user input 
import java.util.Scanner;

//Define class
public class P29_halfPyaramid {
    // Main Function
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter the rows :");
        int i, j;
        int n = num.nextInt();

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        num.close();

    }

}

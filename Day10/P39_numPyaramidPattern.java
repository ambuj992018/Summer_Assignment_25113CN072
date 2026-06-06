//package for day 10 assignment
package Day10;

//Import scanner for user input 
import java.util.Scanner;

//define class
public class P39_numPyaramidPattern {
    // Main function
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter the order : ");
        int n = num.nextInt();
        int i, j, k;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (k = i - 1; k >= 1; k--) {
                System.out.print(k);
            }
            System.out.println();
        }
        num.close();
    }
}
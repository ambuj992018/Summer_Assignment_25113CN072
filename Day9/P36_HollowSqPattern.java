//Package for day 9 Assignment
package Day9;

//Import Scanner fpr user input
import java.util.Scanner;

//Define class
public class P36_HollowSqPattern {
    // Main Function
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int n = num.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || j == 1 || i == n || j == n) {
                    System.out.print("* ");
                } else
                    System.out.print("  ");
            }
            System.out.println();
        }
        num.close();
    }

}

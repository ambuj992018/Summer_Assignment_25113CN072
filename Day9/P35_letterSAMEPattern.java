//Package for Day 9 Assignment
package Day9;

//Import Scanner for user input
import java.util.Scanner;

//Define class
public class P35_letterSAMEPattern {
    // M ain Function
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int n = num.nextInt();

        for (char i = 1; i <= n; i++) {
            char C = (char) ('A' + i - 1);
            for (int j = 1; j <= i; j++) {
                System.out.print(C + " ");
            }
            System.out.println();
        }
        num.close();
    }

}

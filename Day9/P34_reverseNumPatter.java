//Package for day 9 Assignment
package Day9;

//Import Scanner for user input
import java.util.Scanner;

//Define class
public class P34_reverseNumPatter {
    // Main Function
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int n = num.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        num.close();
    }
}

//Package for day 5 projects
package Day5;

//Import Scanner for user input
import java.util.Scanner;

//define class
public class P19_FactorPrint {
    // main function
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = num.nextInt();
        int i;
        for (i = 1; i <= n; i++) {
            if (n % i == 0)

                System.out.print(i + "\t");

        }

        num.close();
    }

}

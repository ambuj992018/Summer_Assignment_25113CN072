//PACKAGE FOR ASSIGNMENT OF DAY 11
package Day11;

//IMPORT SCANNER FOR USER INPUT
import java.util.Scanner;

//DEFINE CLASS
public class P43_function_Prime {
    // USER DEFINED FUNCTION
    static int prime(int n) {
        int count = 0;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                count++;
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        System.out.print("Enter a number  : ");
        int n = num.nextInt();
        int result = prime(n);
        if (result == 0) {
            System.out.print(n + " is a Prime number");
        } else {
            System.out.print(n + " is not a prime number ");
        }
        num.close();
    }
}

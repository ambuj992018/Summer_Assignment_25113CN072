//PACKAGE FOR DAY 7 ASSIGNMENT
package Day7;

//IMPORT SCANNER FOR USER INPUT
import java.util.Scanner;

//DEFINE CLASS
public class P28_RevRecursive {

    // USER DEFINED FUNCTION
    static int reverse(int a, int rev) {
        if (a == 0)
            return rev;

        return reverse(a / 10, rev * 10 + a % 10);
    }

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = num.nextInt();
        int rev = 0;
        System.out.print(reverse(n, rev) + " is the reverse of " + n);
        num.close();
    }

}

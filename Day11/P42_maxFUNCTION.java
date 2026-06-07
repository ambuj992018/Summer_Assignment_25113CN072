//PACKAGE FOR DAY 11 ASSIGNMENT
package Day11;

//IMPORT SCANNER FOR USER INPUT
import java.util.Scanner;

//DEFINR CLASS
public class P42_maxFUNCTION {
    // USER DEFINED FUNCTION
    static int maxNum(int a, int b) {
        return (a > b) ? a : b;
    }

    // MAIN FUNCTION
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter both the numbers : ");
        int n1 = num.nextInt();
        int n2 = num.nextInt();
        int M;
        M = maxNum(n1, n2);
        System.out.print(M + " is maximum.");
        num.close();
    }
}

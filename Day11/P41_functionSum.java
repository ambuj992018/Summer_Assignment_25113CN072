//PACKAGE FOR DAY 11 ASSIGNMENT
package Day11;

//IMPORT SCANNER FOR USER INPUT 
import java.util.Scanner;

//DEFINE CLASS
public class P41_functionSum {
    // USER DEFINED FUNCTION
    static int sum(int a, int b) {
        int c;
        c = a + b;
        return c;
    }

    // MAIN FUNCTION
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter both the numbers : ");
        int n1 = num.nextInt();
        int n2 = num.nextInt();
        int S;
        S = sum(n1, n2);
        System.out.print(S);
        num.close();
    }

}

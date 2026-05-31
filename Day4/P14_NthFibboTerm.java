//package for assignment of Day 3
package Day4;

//import scanner for user input
import java.util.Scanner;

//define class
public class P14_NthFibboTerm {
    // user defined function for fibbonacci series
    static void Fibbo(int a) {
        int i, n1 = 0, n2 = 1, n3;
        for (i = 0; i < a; i++) {
            if (i == a - 1) {
                System.out.print(n1 + "\t");
            }
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
    }

    // main function
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter the number of terms in series : ");
        int n = num.nextInt();
        Fibbo(n);
        num.close();
    }

}

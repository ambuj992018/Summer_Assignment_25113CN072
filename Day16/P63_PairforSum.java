//PACKAGE FOR DAY 16 ASSIGNMENT
package Day16;

//IMPORT SCANNER FOR USER INPUT
import java.util.Scanner;

//DEFINE CLASS
public class P63_PairforSum {
    // MAIN FUNCTION
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter the size of an Array : ");
        int n = num.nextInt();
        int[] a = new int[n];
        // loop to input elements of an array
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = num.nextInt();
        }
        // TAGET ENTRY
        System.out.print("Enter the target : ");
        int X = num.nextInt();

        // EXCUTION FOR PROBLEM
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] + a[j] == X) {
                    System.out.print(a[i] + "," + a[j] + "\n");
                }

            }
        }
        num.close();
    }

}

//PACKAGE FOR DAY 15 ASSIGNMENT
package Day15;

//IMPORT SCANNER FOR USER INPUT
import java.util.Scanner;

//DEFINE CLASS
public class P60_ZeroesTOEND {
    // MAIN FUNCTION
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int n = num.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = num.nextInt();
        }

        int j = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] != 0) {
                a[j] = a[i];
                j++;
            }
        }
        while (j < n) {
            a[j] = 0;
            j++;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        num.close();
    }

}

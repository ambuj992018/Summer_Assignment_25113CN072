//PACKAGE FOR DAY 15 ASSIGNMENT 
package Day15;

//IMPORT SCANNER FOR USER INPUT
import java.util.Scanner;

//DEFINE CLASS
public class P58_rotateArray_Left {

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
        // logic to rotate array left by 1 position
        int U = a[0];
        for (int j = 0; j < n - 1; j++) {
            a[j] = a[j + 1];

        }
        a[n - 1] = U;
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "\t");
        }

        num.close();

    }

}

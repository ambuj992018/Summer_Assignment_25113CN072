//Package for Day 14 Assignment
package Day14;

//Import Scanner for user Input 
import java.util.Scanner;

//Define Class
public class P56_duplicatesin_array {
    // Main Function
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = num.nextInt();

        int[] a = new int[n];
        System.out.print("Enter the elements of array : ");
        int i, m;
        // LOOP TO ENTER ELEMENTS OF AN ARRAY
        for (i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = num.nextInt();
        }
        System.out.println("DUPLICATE ELEMENTS ARE : ");
        for (i = 0; i < n; i++) {
            for (m = i + 1; m < n; m++) {
                if (a[i] == a[m])
                    System.out.print(a[i] + "\t");
                break;
            }
        }

        num.close();
    }
}
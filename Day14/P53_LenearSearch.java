//PACKAGE FOR DAY 14 ASSIGNMENT
package Day14;

//IMPORT SCANNER FOR USER INPUT 
import java.util.Scanner;

//DEFINE CLASS 
public class P53_LenearSearch {

    // main function
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = num.nextInt();

        int[] a = new int[n];
        System.out.print("Enter the elements of array : ");
        int i, key, loc = -1;
        // LOOP TO ENTER ELEMENTS OF AN ARRAY
        for (i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = num.nextInt();
        }

        System.out.print("Enter the Search element : ");
        key = num.nextInt();

        for (i = 0; i < n; i++) {
            if (a[i] == key) {
                loc = i;

                if (loc != -1) {
                    System.out.print("element " + key + " is found at index value " + i + " .\n");
                    break;
                }
            }
        }

        if (loc == -1)
            System.out.print("Not found.\n");

        num.close();
    }

}

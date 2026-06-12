//PACKAGE FOR DAY 16 ASSIGNMENT
package Day16;

//IMPORT SCANNER FOR USER INPUT 
import java.util.Scanner;

//DEFINE CLASS
public class P62_MaxFreqelement {

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

        // Execution loop
        int freq = 0;
        int E = a[0];
        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    count++;
                }

            }

            if (count > freq) {
                freq = count;
                E = a[i];
            }
        }

        System.out.print(E + " is an element of maximum frequency \nIt occured " + (freq) + " times . ");

        num.close();
    }

}

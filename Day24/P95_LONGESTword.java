//PACKAGE FOR DAY 24 ASSIGNMENT
package Day24;

//IMPORT SCANNER FOR USER INPUT
import java.util.Scanner;

//DEFINE CLASS
public class P95_LONGESTword {
    // MAIN FUNCTION
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = Sc.nextLine();
        char[] a = str.toCharArray();

        int max = 0, p = 0;

        String longSt = "", presentSt = "";

        for (int i = 0; i <= a.length; i++) {
            if (i < a.length && a[i] != ' ') {
                presentSt += a[i];
                p++;
            } else {
                if (p > max) {
                    max = p;
                    longSt = presentSt;
                }
                presentSt = "";
                p = 0;

            }
        }
        System.out.print("Longest word is " + longSt + "\nIt is of Length " + max);

        Sc.close();
    }

}

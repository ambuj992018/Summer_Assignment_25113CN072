//PACKAGE FOR DAY 23 ASSIGNMENT
package Day23;

//IMPORT SCANNER FOR USER INPUT
import java.util.Scanner;

//DEFINE CLASS
public class P91_ANAGRAMtestString {
    // MAIN FUNCTION
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the first String : ");
        String str1 = Sc.nextLine();
        System.out.print("Enter the second String : ");
        String str2 = Sc.nextLine();
        // TO STORE STRING AS ARRAY OF CHARACTERS
        char[] a = str1.toCharArray();
        char[] b = str2.toCharArray();
        int errorCount = 0;

        if (a.length == b.length) {
            for (int i = 0; i < a.length; i++) {
                int counta = 0;
                int countb = 0;

                for (int j = i + 1; j < a.length; j++) {
                    if (a[i] >= 'A' && a[i] <= 'Z') {
                        if (a[i] == a[j] || a[i] == (a[j] - 32)) {
                            counta++;
                        }
                    }
                    if (a[i] >= 'a' && a[i] <= 'z') {
                        if (a[i] == a[j] || a[i] == (a[j] + 32)) {
                            counta++;
                        }
                    }

                    if (b[i] >= 'A' && b[i] <= 'Z') {
                        if (b[i] == b[j] || b[i] == (b[j] - 32)) {
                            countb++;
                        }
                    }
                    if (b[i] >= 'a' && b[i] <= 'z') {
                        if (b[i] == b[j] || b[i] == (b[j] + 32)) {
                            countb++;
                        }
                    }

                }
                if (counta != countb) {
                    errorCount++;
                }

            }

            if (errorCount == 0) {
                System.out.print("It is an ANAGRAM .");

            } else {
                System.out.print("It is not an ANAGRAM .");
            }

        }

        else {
            System.out.print("It is not an ANAGRAM .");
        }

        Sc.close();

    }

}
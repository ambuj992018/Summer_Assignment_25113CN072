//PACKAGE FOR DAY 25 ASIGNMENT
package Day25;

//IMPORT SCANNER FOR USER INPUT
import java.util.Scanner;

//DEFINE CLASS
public class P100SortWordsbyLength {

    // MAIN FUNCTION
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter number of words : ");
        int n = Sc.nextInt();
        String[] word = new String[n];

        System.out.println("Enter words : ");
        for (int i = 0; i < n; i++) {
            word[i] = Sc.nextLine();

        }

        // logic for sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (word[j].length() > word[j + 1].length()) {
                    String temp = word[j];
                    word[j] = word[j + 1];
                    word[j + 1] = temp;

                }
            }
        }
        System.out.println("sorted words : ");

        for (int i = 0; i < n; i++) {
            System.out.println(word[i]);
        }

        Sc.close();
    }

}

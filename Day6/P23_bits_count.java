//Package for day 6 assignment 
package Day6;

//Import scanner for use input 
import java.util.Scanner;

//define class
public class P23_bits_count {
    // main function
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = input.nextInt();
        int r;
        int count = 0;
        int n1 = n;
        // NOTE !
        // set bits are those binary digits which has value one (1)
        while (n > 0) {
            r = n % 2;
            if (r == 1) {
                count++;
            }
            n = n / 2;

        }
        n = n1;
        System.out.print("Set bit of " + n1 + " is : " + count);
        input.close();
    }
}
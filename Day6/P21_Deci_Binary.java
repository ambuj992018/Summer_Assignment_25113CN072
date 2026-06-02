//Package for day 6 assignment
package Day6;

//Import scanner for user input 
import java.util.Scanner;

//define class
public class P21_Deci_Binary {
    // main function
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number in decimal form : ");
        int n = input.nextInt();
        int r; // remainder
        String bin = "";
        // logic and working code
        if (n == 0) {
            bin = "0";
        }
        while (n > 0) {
            r = n % 2;
            bin = r + bin;
            n = n / 2;
        }
        System.out.print(bin + "\t");
        input.close();
    }
}

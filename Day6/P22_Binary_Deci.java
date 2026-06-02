//Package for day 6 assignment
package Day6;

//import scanner for user input
import java.util.Scanner;
//import maths for mathematical operations 
import java.lang.Math;

// define class
public class P22_Binary_Deci {
    // main function
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number in Binary  form : ");
        int n = input.nextInt();
        int deci = 0;

        int i = 0;
        while (n > 0) {
            int r = n % 10;
            deci = (((int) Math.pow(2, i) * r) + deci);// logic for conversion
            n = n / 10;// vale of n updated
            i++;// update i
        }
        System.out.print("Decimal value is : " + deci);
        input.close();
    }
}
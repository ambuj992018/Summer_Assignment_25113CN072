package Day1;

import java.util.*;

public class P4_digit_Count {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = input.nextInt();
        int count = 0;

        while (n > 0) {
            n = n / 10;
            count++;
        }
        System.out.print("Digit is " + count);

        input.close();
    }
}
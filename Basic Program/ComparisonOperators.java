/* use comparison operator to find out whether a given number is 
   greater than the user enter number or not. */

import java.util.*;

   public class ComparisonOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        int num = sc.nextInt();

        System.out.println(num > 10);
    }
}

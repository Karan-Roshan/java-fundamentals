// sum of three number taking from the user

import java.util.*;

public class Sum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num1 : ");
        int num1 = sc.nextInt();

        System.out.print("Enter num2 : ");
        int num2 = sc.nextInt();

        System.out.print("Enter num3 : ");
        int num3 = sc.nextInt();

        int sum = num1 + num2 + num3 ;
        System.out.print("sum : ");
        System.out.println(sum);
    }
}

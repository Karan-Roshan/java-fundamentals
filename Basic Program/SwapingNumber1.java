// Swaping two number using third variable

import java.util.Scanner;

public class SwapingNumber1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        int c;

        c = a;
        a = b;
        b = c;

        System.out.println("After Swapping: a =  " + a + "  b = " + b);

    }
}

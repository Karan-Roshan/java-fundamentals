import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a = ");
        int a = sc.nextInt();

        System.out.print("b = ");
        int b = sc.nextInt();

        System.out.println("Sum = " + (a+b));
        System.out.println("Sub = " + (a-b));
        System.out.println("Mul = " + (a*b));
        System.out.println("Div = "+ (a/b));
    }
}

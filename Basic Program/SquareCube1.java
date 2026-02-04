// square of the number
import java.util.Scanner;

public class SquareCube1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int square = n*n ;
        int cube = n*n*n;

        System.out.println("Square : "+ square);
        System.out.println("Cube : " +cube);
    }
}

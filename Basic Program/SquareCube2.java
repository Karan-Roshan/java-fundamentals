import java.util.*;
import java.lang.Math;

public class SquareCube2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        double n = sc.nextDouble();

        double square = Math.pow(n, 2);
        double cube = Math.pow(n, 3);
        
        System.out.println("Sqare: " + square);
        System.out.println("Cube: " + cube);
    }
}

import java.util.*;
import java.lang.Math;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        double n = sc.nextDouble();

        double square_root = Math.sqrt(n);;
        
        System.out.println("Sqare Root: " + square_root);
    }
}
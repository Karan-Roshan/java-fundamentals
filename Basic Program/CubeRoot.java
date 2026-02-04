import java.util.*;
import java.lang.Math;

public class CubeRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        double n = sc.nextDouble();

        double cube_root = Math.sqrt(n);
        
        System.out.println("Cube Root: " + cube_root);
    }
}
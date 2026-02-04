import java.util.Scanner;

public class VolumeOfBox {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.print("Enter height: ");
        // int h = sc.nextInt();

        // System.out.print("Enter breadth: ");
        // int b = sc.nextInt();

        // System.out.print("Enter length: ");
        // int l = sc.nextInt();

        int l = 4;
        int b = 5;
        int h = 2;

        int volume = l*b*h;
        System.out.println("Volume of the Box = "+volume);

    }
}

// find the area of the rectangle

import java.util.*;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length : ");
        float l = sc.nextFloat();

        System.out.print("Enter breadth : ");
        float b = sc.nextFloat();

        float area = l * b;
        System.out.println("Area of rectangle : " + area);
    }
}

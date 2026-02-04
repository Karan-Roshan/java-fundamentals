//find the simple interest

import java.util.*;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter principal : ");
        float p = sc.nextFloat();

        System.out.print("Enter Rate of Interest : ");
        float r = sc.nextFloat();

        System.out.print("Enter Time : ");
        float t = sc.nextFloat();

        float SI = (p * r * t) / 100;
        System.out.println("Simple Interest : " + SI);

    }
}

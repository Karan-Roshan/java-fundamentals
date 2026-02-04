// check my number is zero or not using Switch case

import java.util.Scanner;

public class NumIsZeroOrNot2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        switch (num) {
            case 0:
                System.out.println("Number is Zero");
                break;
        
            default:
            System.out.println("Number is not Zero");
                break;
        }
    }
}

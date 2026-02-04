// taking two number from the user and perform sum and average

import java.util.Scanner;

public class SumAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        float num1 = sc.nextFloat();

        System.out.print("Enter number 2: ");
        float num2 = sc.nextFloat();

        float sum = num1+num2;
        float average = sum / 2;

        System.out.println("Sum : "+ sum);
        System.out.println("Average : " + average);
    }
}

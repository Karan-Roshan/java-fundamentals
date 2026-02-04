// enter marks of three subjects and calculate percentage

import java.util.Scanner;

public class Percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st Subject marks: ");
        float marks1 = sc.nextFloat();

        System.out.print("Enter 2nd Subject marks: ");
        float marks2 = sc.nextFloat();

        System.out.print("Enter 3rd Subject marks: ");
        float marks3 = sc.nextFloat();

        float per = (marks1+marks2+marks3)*100 / 300;
        System.out.println("Percentage : " + per);
    }
}

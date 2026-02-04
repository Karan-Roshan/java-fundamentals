// find the whether a year is a leap year or not

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Year : "); //Enter year above the 1000
        int year = sc.nextInt();

        if(year % 4 == 0) {
            System.out.println("Leap Year");
        }
        else {
            System.out.println("Not a Leap Year");
        }
    }
}

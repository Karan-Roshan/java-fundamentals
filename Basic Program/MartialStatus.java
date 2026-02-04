/*    Person Marital Status
Gender	  Martial Status   Titles
 Male	   Married	         Mr.
	     Unmarried         	Mr.
Female  	Married	        Mrs.
	      Unmarried	        Ms.*/

import java.util.Scanner;

public class MartialStatus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Choose Gender (1 for Male, 2 for Female): ");
        int gender = sc.nextInt();

        System.out.print("Choose Marital Status (3 for Unmarried, 4 for Married): ");
        int marriage = sc.nextInt();

        if (gender == 1) {
            if (marriage == 3) {
                System.out.println("Title : Mr.");
            } else {
                System.out.println("Title : Mr.");
            }
        } else {
            if (marriage == 3) {
                System.out.println("Title : Ms.");
            } else {
                System.out.println("Title : Mrs.");
            }
        }

    }

}

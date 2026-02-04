// reaad string taking from the user

import java.util.*;

public class StringFromUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Write anything :");

        // String x = sc.next();  //sc.next print the first word of the sentense
        // System.out.println("x = " + x);

        String y = sc.nextLine();   //sc.nextLine print ll the sentense
        System.out.println("y = " + y);
    }
}

// To detect whether a number entered by a user is integer or not

import java.util.*;

public class IntDetect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        System.out.println(sc.hasNextInt());
    }
}

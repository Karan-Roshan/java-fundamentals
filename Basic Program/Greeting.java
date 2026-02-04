// Asks the user to enter his or her name and greet them

import java.util.*;

public class Greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String name = sc.nextLine();

        System.out.print("Hello " + name + ", have a good day.");
        System.out.print(name);
    }
}

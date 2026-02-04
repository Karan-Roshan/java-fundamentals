// Calculate percentage of a student of five subject

import java.util.*;

public class CalculatePercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sub1 marks : ");
        int mark1 = sc.nextInt();

        System.out.print("Enter sub2 marks : ");
        int mark2 = sc.nextInt();

        System.out.print("Enter sub3 marks : ");
        int mark3 = sc.nextInt();

        System.out.print("Enter sub4 marks : ");
        int mark4 = sc.nextInt();

        System.out.print("Enter sub5 marks : ");
        int mark5 = sc.nextInt();

        int total = mark1 + mark2 + mark3 + mark4 +mark5;
        System.out.print("Marks Obtained : ");
        System.out.println(total);

        float percentage = (total * 100)/500;
        System.out.print("Pentage : ");
        System.out.println(percentage);
        
    }
}

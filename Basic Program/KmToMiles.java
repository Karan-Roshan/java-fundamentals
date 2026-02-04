// convert kilometer to miles
// km = miles * 1.6

import java.util.Scanner;

public class KmToMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Kilometer : ");
        float km = sc.nextInt();
 
        float miles = (km*10) / 16 ;
        System.out.println(km + " kilometers = " + miles + " miles");
    }
}

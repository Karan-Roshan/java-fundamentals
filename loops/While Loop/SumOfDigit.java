import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        int sum = 0;
        int n = number;

        // Loop to extract digits and sum them
        while (n != 0) {
            int digit = n % 10;
            sum += digit;
            n /= 10;
        }

        System.out.println("Sum of the digits of " + number + " is: " + sum);
    }
}


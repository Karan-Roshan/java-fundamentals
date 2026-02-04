import java.util.Scanner;

public class EligibeForDrive {
    public static void main(String[] args) {
        // Define variables
        int age;
        boolean hasLicense;

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their age
        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        // Prompt the user to enter whether they have a driver's license
        System.out.print("Do you have a driver's license? (true/false): ");
        hasLicense = scanner.nextBoolean();

        // Check if the user is eligible to drive based on age and license status
        if (age >= 18) {
            if (hasLicense) {
                System.out.println("You are eligible to drive.");
            } else {
                System.out.println("You are old enough to drive, but you don't have a license.");
            }
        } else {
            System.out.println("You are not old enough to drive.");
        }

        // Close the scanner
        scanner.close();
    }
}

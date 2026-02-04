import java.util.Scanner;

public class EligibleForVotingOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age of the Person: ");
        int age = sc.nextInt();

        if(age>=18) {
            System.out.println("Eligible for Voting");
        }
        else {
            System.out.println("Not eligible for Voting");
        }
    }
}

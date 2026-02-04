import java.util.Scanner;

public class RestraurantMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;
        int sum = 0;

        do {
            System.out.println("Menu");
            System.out.println("1. Pizza          Rs. 80");
            System.out.println("2. Burger         Rs. 90");
            System.out.println("3. Fried Rice     Rs. 50");
            System.out.println("4. Chilli Panner  Rs. 100");
            System.out.println("5. Ice-Cream      Rs. 90");
            System.out.println("6. Exit");

            System.out.print("Enter Your Choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    sum += 80;
                    System.out.println("You6 ordered Pizza.");
                    System.out.println(" ");
                    break;

                case 2:
                    sum += 90;
                    System.out.println("You ordered Burger.");
                    System.out.println(" ");
                    break;

                case 3:
                    sum += 50;
                    System.out.println("You ordered Fried Rice.");
                    System.out.println(" ");
                    break;

                case 4:
                    sum += 100;
                    System.out.println("You ordered Chilli Paneer.");
                    System.out.println(" ");
                    break;

                case 5:
                    sum += 90;
                    System.out.println("You ordered Ice-Cream.");
                    System.out.println(" ");
                    break;

                case 6:
                    System.out.println("Thank you for visiting our Restaurant.");
                    System.out.println("I hope you enjoyed.");
                    System.out.println(" ");
                    break;

                default:
                    System.out.println("Invalid choice! Please select from the menu.");
                    break;
            }
        } while (choice != 6);
        if (choice == 6) {
            System.out.println("Your Total Amount: " + sum);
        }
        sc.close();

    }
}

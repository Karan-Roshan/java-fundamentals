public class ConutinueStatement {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };

        for (int number : numbers) {
            if (number == 3) {
                System.out.println("Skipping number 3.");
                continue; // continue statement
            }
            System.out.println("Processing number: " + number);
        }
    }
}

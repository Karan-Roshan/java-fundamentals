public class BreakingStatement {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        for (int number : numbers) {
            if (number == 3) {
                System.out.println("Number 3 found! Exiting loop.");
                break; // break statement
            }
            System.out.println("Checking number: " + number);
        }
    }
}

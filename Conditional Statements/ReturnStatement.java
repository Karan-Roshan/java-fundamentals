public class ReturnStatement  {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        int result = findNumber(numbers, 3);
        System.out.println("Result: " + result);
    }

    public static int findNumber(int[] array, int target) {
        for (int number : array) {
            if (number == target) {
                return number; // return statement inside the loop
            }
            System.out.println("Checking number: " + number);
        }
        System.out.println("Target not found!");
        return -1; // return statement outside the loop
    }
}

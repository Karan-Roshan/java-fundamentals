
public class IncrementDecrement {
    public static void main(String[] args) {
        // Increment examples
        int x = 5;

        // Postfix increment (x++)
        int result1 = x++;
        System.out.println("Postfix Increment: x = " + x + ", result = " + result1);

        // Reset x
        x = 5;

        // Prefix increment (++x)
        int result2 = ++x;
        System.out.println("Prefix Increment: x = " + x + ", result = " + result2);

        // Decrement examples
        int y = 10;

        // Postfix decrement (y--)
        int result3 = y--;
        System.out.println("Postfix Decrement: y = " + y + ", result = " + result3);

        // Reset y
        y = 10;

        // Prefix decrement (--y)
        int result4 = --y;
        System.out.println("Prefix Decrement: y = " + y + ", result = " + result4);
    }
}

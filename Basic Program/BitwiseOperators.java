public class BitwiseOperators {
    public static void main(String[] args) {
        int a = 9;
        int b = 10;

        System.out.println("a = " + Integer.toBinaryString(a));
        System.out.println("b = " + Integer.toBinaryString(b));

        // Bitwise AND
        int And = a & b;
        System.out.println("a & b = " + And);

        // Bitwise OR
        int Or = a | b;
        System.out.println("a | b = " + Or);

        // Bitwise XOR
        int Xor = a ^ b;
        System.out.println("a ^ b = " + Xor); // same mein 0, difference mein 1

    }
}

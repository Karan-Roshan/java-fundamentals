public class ShiftOperation {
    public static void main(String[] args) {
        int a=4,b=99;

        System.out.println("A = "+Integer.toBinaryString(a));
        System.out.println("B = "+Integer.toBinaryString(b));
        System.out.println("2 Times Left Shift = "+(a<<2));
        System.out.println("2 Times Right Shift = "+(b>>2));
        System.out.println("2 Times Unsigned Right Shift = "+(b>>>2));
 
    }
}

// parameterise constructor

public class Main3 {
    int num1;
    int num2;

    Main3(int a, int b) {
        num1 = a;
        num2 = b;
    }
    public static void main(String[] args) {
        Main1 ob = new Main1();
        System.out.println("Object num1 " + ob.num1);
        System.out.println("Object num2 " + ob.num2);
    }
}

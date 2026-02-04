import java.util.Scanner;

public class LargestAmongThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter a: ");
    int a = sc.nextInt();

    System.out.print("Enter b: ");
    int b = sc.nextInt();

    System.out.print("Enter c: ");
    int c = sc.nextInt();

    if(a>b && a>c) {
        System.out.println("a is largest");
    }
    else if(b>a && b>c) {
        System.out.println("b is largest");
    }
    else if(c>a && c>b) {
        System.out.println("c is largest");
    }
    else if(a==b && a>c) {
        System.out.println("a & b are equal and larger than c");
    }
    else if(b==c && b>a) {
        System.out.println("b & c are equal and larger than a");
    }
    else if(c==a && c>b) {
        System.out.println("c & a are equal and larger than b");
    }
    else  {
        System.out.println("All are equal");
    }
    }
}

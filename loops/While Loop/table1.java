import java.util.Scanner;

public class table1 {
    public static void main(String[] args) {
        int i = 1;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        while(i<=10) {
            System.out.println(num+" * "+i+" = "+num*i);
            i++;
        }
    }
}

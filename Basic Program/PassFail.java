import java.util.Scanner;

public class PassFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first subject mark : ");
        int mark1 = sc.nextInt();

        System.out.print("Enter second subject mark : ");
        int mark2 = sc.nextInt();

        System.out.print("Enter third subject mark : ");
        int mark3 = sc.nextInt();

        System.out.println("Total marks : 300");

        int total = mark1 + mark2 + mark3;
        System.out.println("Total marks obtained : " + total);

        int avg = total  / 3;
        System.out.println("Average marks : "+ avg);
        
        if (avg>=40 && mark1>=33 && mark2>=33 && mark3>=33) {
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }
    }
}

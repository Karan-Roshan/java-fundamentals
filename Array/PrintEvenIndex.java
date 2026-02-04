import java.util.Scanner;

public class PrintEvenIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Enter size of an array: ");
        n = sc.nextInt();

        int arr[]= new int [n];

        System.out.print("Enter element: ");

        for(int i=0; i<n; i++) {
            arr[i]=sc.nextInt();
        }

        for (int i=0; i<n; i++) {
            if(i%2==0) {
                System.out.println(i+" index = "+arr[i]);
            }
            else {
                continue;
            }
        }
    }
}

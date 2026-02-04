import java.util.Arrays;
import java.util.Scanner;

public class ShortArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Enter the size of an array: ");
        n = sc.nextInt();

        int arr[] = new int[n];

        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.print("Sorted Array: ");
        for (int i = 0; i < n; i++) {

            System.out.print(arr[i]+ " ");

        }
    }

}

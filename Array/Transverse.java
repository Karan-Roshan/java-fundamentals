// Traversal of array

import java.util.Scanner;

public class Transverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Enter the size of an Array: ");
        n = sc.nextInt();

        int arr[] = new int[n];

        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The travesal of Array: ");
        System.out.print("arr[" + n + "] = ");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+", ");
        }

    }
}

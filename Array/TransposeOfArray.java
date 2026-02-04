import java.util.Scanner;

public class TransposeOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[][] = new int[3][3];
        System.out.println("Enter the elements array:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        System.out.println("The Transpose elements: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[j][i]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

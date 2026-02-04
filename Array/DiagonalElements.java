import java.util.Scanner;

public class DiagonalElements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[][]= new int[3][3];

        System.out.println("Enter the elements array:");

        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("The diagonal elements: ");
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                if(i==j) {
                    System.out.print(arr[i][j]);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

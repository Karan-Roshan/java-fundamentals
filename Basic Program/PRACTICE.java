import java.util.*;

class PRACTICE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of element: ");
        int n= sc.nextInt();
        
        int arr[] = new int[n];
        int sum=0;
        System.out.print("Enter element: ");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Transverse of array: ");
        for(int i=0; i<n; i++) {
            System.out.print(arr[i]+", ");
        }
        System.out.println(" ");
        for(int i=0; i<n; i++) {
            sum+=arr[i];
        }
        System.out.println("Sum = "+ sum);
    }
}
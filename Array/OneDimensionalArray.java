public class OneDimensionalArray {
    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] myArray = {1, 2, 3, 4, 5};

        // Access all elements of the array
        System.out.print("myArray[5] = ");
        for(int i=0; i<5; i++) {
            System.out.print(myArray[i]+", ");
        }
       System.out.println(" ");
       System.out.println(" ");

        // Perform basic operations
        // Adding elements
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum += myArray[i];
        }
        System.out.println("Sum of elements: " + sum);
        System.out.println(" ");


        // Modifying an element
        myArray[2] = 10; // Modifying the third element
        System.out.println("Modified third element: " + myArray[2]);
        System.out.println(" ");


        // Deleting an element (by shifting elements)
        int[] newArray = new int[myArray.length - 1];
        int deleteIndex = 2; // Index of the element to delete
        for (int i = 0, j = 0; i < myArray.length; i++) {
            if (i != deleteIndex) {
                newArray[j] = myArray[i];
                j++;
            }
        }

        myArray = newArray; // Update the original array reference
        System.out.print("Array after deleting third element:");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(" "+myArray[i]);
        }
    }
}

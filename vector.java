import java.util.Arrays;

public class vector {

    // Method to calculate the scalar product of two vectors
    public static int scalarProduct(int[] v1, int[] v2) {
        int scalar = 0;

        // Loop through each element of the vectors
        for (int i = 0; i < v1.length; ++i) {
            scalar += v1[i] * v2[i]; // Multiply corresponding elements and add to scalar
        };

        return scalar; // Return the scalar product
    }

    // Method to sort a vector using bubble sort algorithm
    public static void sort(int[] v1) {
        int a;
        boolean swap = true;
        int counter = 0;

        // Continue sorting until no swaps are made
        while (swap) {
            swap = false;
            // Loop through the vector
            for (int i = 0; i < v1.length - 1 - counter; ++i) {
                // Swap elements if they are in the wrong order
                if (v1[i] > v1[i + 1]) {
                    a = v1[i];
                    v1[i] = v1[i + 1];
                    v1[i + 1] = a;
                    swap = true;
                }
            }
            counter++; // Increment counter to reduce the range of comparison
        }
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        int[] v1 = {1, 2, 3, 34, 56, 54, 5, 0}; // Initialize vector v1
        int[] v2 = {4, 5, 6, 7}; // Initialize vector v2
        System.out.println(Arrays.toString(v1)); // Print original vector v1
        sort(v1); // Sort vector v1
        System.out.println(Arrays.toString(v1)); // Print sorted vector v1

        // Uncomment the following line to print the scalar product of v1 and v2
        // System.out.println("Skalarprodukt="+scalarProduct(v1, v2));
    }
}

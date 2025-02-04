
import java.util.Arrays;

public class vector {

    public static int scalarProduct(int[] v1, int[] v2) {
        int scalar = 0;

        for (int i = 0; i < v1.length; ++i) {
            scalar += v1[i] * v2[i];
        };

        return scalar;
    }

    public static void sort(int[] v1) {

        int a;
        boolean swap = true;
        int counter = 0;
        while (swap) {
            swap = false;
            for (int i = 0; i < v1.length - 1 - counter; ++i) {

                if (v1[i] > v1[i + 1]) {
                    a = v1[i];
                    v1[i] = v1[i + 1];
                    v1[i + 1] = a;
                    swap = true;
                }
                
            }
            counter++;
        }
    
    }


    public static void main(String[] args) {
        int[] v1 = {1, 2, 3, 34, 56, 54, 5, 0};
        int[] v2 = {4, 5, 6, 7};
        System.out.println(Arrays.toString(v1));
        sort(v1);
        System.out.println(Arrays.toString(v1));

        // System.out.println("Skalarprodukt="+scalarProduct(v1, v2));
    }
}

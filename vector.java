import java.util.Arrays;

public class vector {

    // Methode zur Berechnung des Skalarprodukts zweier Vektoren
    public static int scalarProduct(int[] v1, int[] v2) {
        int scalar = 0;

        // Schleife durch jedes Element der Vektoren
        for (int i = 0; i < v1.length; ++i) {
            scalar += v1[i] * v2[i]; // Multipliziere entsprechende Elemente und addiere zum Skalar
        };

        return scalar; // Rückgabe des Skalarprodukts
    }

    // Methode zum Sortieren eines Vektors mit dem Bubble-Sort-Algorithmus
    public static void sort(int[] v1) {
        int a;
        boolean swap = true;
        int counter = 0;

        // Sortieren fortsetzen, bis keine Vertauschungen mehr vorgenommen werden
        while (swap) {
            swap = false;
            // Schleife durch den Vektor
            for (int i = 0; i < v1.length - 1 - counter; ++i) {
                // Elemente vertauschen, wenn sie in der falschen Reihenfolge sind
                if (v1[i] > v1[i + 1]) {
                    a = v1[i];
                    v1[i] = v1[i + 1];
                    v1[i + 1] = a;
                    swap = true;
                }
            }
            counter++; // Zähler erhöhen, um den Vergleichsbereich zu reduzieren
        }
    }

    // Einführung java.util.Arrays.sort
    public static int[] sort2(int[] v1){
        int[] v3 = Arrays.copyOf(v1, v1.length);
        Arrays.sort(v3);
        return v3;
    }

    // Hauptmethode zum Testen der Funktionalität
    public static void main(String[] args) {
        int[] v1 = {1, 2, 3, 34, 56, 54, 5, 0}; // Initialisierung des Vektors v1
        int[] v2 = {4, 5, 6, 7}; // Initialisierung des Vektors v2
        System.out.println(Arrays.toString(v1)); // Originalen Vektor v1 ausgeben
        sort(v1); // Vektor v1 sortieren
        System.out.println(Arrays.toString(v1)); // Sortierten Vektor v1 ausgeben

        // Die folgende Zeile auskommentieren, um das Skalarprodukt von v1 und v2 auszugeben
        // System.out.println("Skalarprodukt="+scalarProduct(v1, v2));
    }
}

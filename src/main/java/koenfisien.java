/**
 * Kelas untuk mengubah bilangan biner menjadi array koefisien.
 */
public class koenfisien {
    static int[] getKoefisien(String biner) {
        int n = biner.length();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[n - 1 - i] = Character.getNumericValue(biner.charAt(i));
        }
        return a;
    }
}

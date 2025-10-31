/**
 * Kelas yang menangani proses perhitungan konversi menggunakan metode Horner.
 */
public class perhitungan {
    static int prosesHorner(int[] a) {
        int n = a.length - 1;
        int b = a[n];
        System.out.println("\nb_" + n + " = a_" + n + " = " + b);

        for (int i = n - 1; i >= 0; i--) {
            int prev = b;
            b = a[i] + MainRefactored.BETA * b;
            System.out.println("b_" + i + " = a_" + i + " + β * b_" + (i + 1) + " = "
                    + a[i] + " + " + MainRefactored.BETA + " * " + prev + " = " + b);
        }
        return b;
    }
}

/**
 * Kelas untuk menampilkan koefisien dan proses konversi.
 */
public class tampilanKoefisien {
    static void tampilkanKoefisien(int[] a) {
        System.out.println("\n--- Proses Konversi Biner ke Desimal (Metode Horner) ---");
        System.out.println("Basis (β) = " + MainRefactored.BETA);
        StringBuilder sb = new StringBuilder();
        for (int i = a.length - 1; i >= 0; i--) {
            sb.append("a_").append(i).append(" = ").append(a[i]);
            if (i > 0) sb.append(", ");
        }
        System.out.println(sb);
    }
}

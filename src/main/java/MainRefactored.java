import java.util.Scanner;
/**
 * Kelas utama program konversi bilangan biner ke desimal menggunakan metode Horner.
 * Program ini terdiri dari beberapa kelas terpisah untuk modularitas (refactoring),
 * meliputi input, pengambilan koefisien, tampilan proses, perhitungan, hasil, dan pengulangan.
 *
 * <p>Program akan terus berjalan hingga pengguna memilih untuk berhenti.</p>
 */

public class MainRefactored {
    /** Basis (β) bilangan biner, yaitu 2. */
    public static final int BETA = 2;
    /** Scanner global untuk input pengguna. */
    public static final Scanner scanner = new Scanner(System.in);

    /**
     * Metode utama program.
     * Mengatur alur kerja dari input, perhitungan hingga output hasil konversi.
     *
     * @param args argumen baris perintah (tidak digunakan)
     */
    public static void main(String[] args) {
        while (true) {
            String biner = inputBiner.inputBiner();
            int[] koefisien = koenfisien.getKoefisien(biner);
            tampilanKoefisien.tampilkanKoefisien(koefisien);

            int hasil = perhitungan.prosesHorner(koefisien);
            hasilAhir.tampilkanHasil(biner, hasil);

            if (!pengulangan.lanjutkan()) break;
        }
        System.out.println("Program selesai. Terima kasih!");
    }

}

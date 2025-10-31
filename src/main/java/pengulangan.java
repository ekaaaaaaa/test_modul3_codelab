/**
 * Kelas untuk menangani proses pengulangan program berdasarkan input pengguna.
 */
public class pengulangan {
    /**
     * Menanyakan kepada pengguna apakah ingin melakukan konversi lagi.
     *
     * @return true jika pengguna menjawab 'y' atau 'Y', false jika tidak
     */
    static boolean lanjutkan() {
        System.out.print("\nMau konversi lagi? (y/n): ");
        String jawaban = MainRefactored.scanner.nextLine();
        return jawaban.equalsIgnoreCase("y");
    }
}

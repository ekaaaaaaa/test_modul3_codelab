/**
 * Kelas untuk menangani proses pengulangan program berdasarkan input pengguna.
 */
public class pengulangan {
    static boolean lanjutkan() {
        System.out.print("\nMau konversi lagi? (y/n): ");
        String jawaban = MainRefactored.scanner.nextLine();
        return jawaban.equalsIgnoreCase("y");
    }
}

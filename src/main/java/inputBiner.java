/**
 * Kelas untuk menangani input bilangan biner dari pengguna.
 */
public class inputBiner {
    /**
     * Meminta pengguna untuk memasukkan bilangan biner.
     *
     * @return string bilangan biner yang dimasukkan pengguna
     */
    static String inputBiner() {
        System.out.print("Masukkan bilangan biner: ");
        return MainRefactored.scanner.nextLine();
    }
}

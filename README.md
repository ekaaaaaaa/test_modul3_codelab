# 🧮 Program Konversi Biner ke Desimal (Metode Horner)

Program ini dibuat untuk mengonversi bilangan **biner** menjadi **desimal** menggunakan **metode Horner**.  
Struktur program telah di-*refactor* menjadi beberapa kelas untuk memisahkan tanggung jawab (modularitas).

---

## 📂 Struktur Kelas

| Kelas | Deskripsi |
|-------|------------|
| `MainRefactored` | Kelas utama yang mengatur alur program. |
| `inputBiner` | Mengambil input bilangan biner dari pengguna. |
| `koenfisien` | Mengubah bilangan biner menjadi array koefisien. |
| `tampilanKoefisien` | Menampilkan koefisien dan informasi dasar konversi. |
| `perhitungan` | Melakukan konversi menggunakan metode Horner. |
| `hasilAhir` | Menampilkan hasil akhir konversi. |
| `pengulangan` | Mengatur logika pengulangan program berdasarkan input pengguna. |

---

## ⚙️ Cara Kerja Program

1. Pengguna diminta untuk memasukkan bilangan biner.
2. Program memecah biner menjadi koefisien `a₀`, `a₁`, `a₂`, dst.
3. Proses konversi dilakukan menggunakan **metode Horner**:
   ```
   b_n = a_n
   b_i = a_i + β * b_(i+1)
   ```
   dengan β = 2.
4. Program menampilkan hasil konversi ke desimal.
5. Pengguna dapat memilih untuk melanjutkan atau keluar dari program.

---

## 🧩 Contoh Output

```
Masukkan bilangan biner: 1011

--- Proses Konversi Biner ke Desimal (Metode Horner) ---
Basis (β) = 2
a_3 = 1, a_2 = 0, a_1 = 1, a_0 = 1

b_3 = a_3 = 1
b_2 = a_2 + β * b_3 = 0 + 2 * 1 = 2
b_1 = a_1 + β * b_2 = 1 + 2 * 2 = 5
b_0 = a_0 + β * b_1 = 1 + 2 * 5 = 11

Maka bilangan desimal dari (1011)₂ adalah (11)₁₀

Mau konversi lagi? (y/n): n
Program selesai. Terima kasih!
```

---

## 🧠 Konsep yang Digunakan

- **Refactoring**: Pemisahan logika program ke dalam kelas terpisah.
- **Metode Horner**: Teknik efisien untuk menghitung nilai polinomial, diterapkan pada konversi biner.
- **JavaDoc**: Digunakan untuk mendokumentasikan setiap kelas dan method.
- **Scanner Input**: Untuk mengambil input dari pengguna.
- **Looping & Control Flow**: Untuk mengatur pengulangan program.

---

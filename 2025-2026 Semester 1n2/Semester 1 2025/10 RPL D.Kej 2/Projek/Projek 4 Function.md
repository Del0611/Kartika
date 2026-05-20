### 1. Fungsi Void untuk Cetak Informasi (Sederhana)

Fungsi berjenis `void` tidak mengembalikan nilai. Fungsi ini sangat cocok digunakan untuk membungkus baris kode yang tugasnya hanya menampilkan teks atau format laporan agar kode di `main` terlihat lebih rapi.

```java
public class ProgramSalam {

    // Membuat fungsi void bernama 'cetakHeader'
    static void cetakHeader(String namaToko) {
        System.out.println("==================================");
        System.out.println("      SISTEM KASIR " + namaToko.toUpperCase());
        System.out.println("==================================");
    }

    public static void main(String[] args) {
        // Memanggil fungsi dengan mengirimkan argumen/parameter teks
        cetakHeader("Toko Jaya Komputer");
        System.out.println("Status Sistem: Siap Melayani Pelanggan.");
    }
}

```

---

### 2. Fungsi Non-Void untuk Perhitungan Matematika

Fungsi ini memiliki tipe data kembalian (`int`) dan wajib menggunakan kata kunci `return`. Fungsi menerima dua parameter input, mengalikan nilainya, lalu melempar hasilnya kembali ke baris kode yang memanggilnya.

```java
public class HitungMateri {

    // Fungsi non-void untuk menghitung luas persegi panjang
    static int hitungLuas(int panjang, int lebar) {
        int hasilLuas = panjang * lebar;
        return hasilLuas; // Mengembalikan nilai integer
    }

    public static void main(String[] args) {
        int p = 15;
        int l = 6;

        // Memanggil fungsi dan menyimpan hasil kembaliannya ke dalam variabel 'luas'
        int luas = hitungLuas(p, l);

        System.out.println("Dimensi Ruangan: " + p + " m x " + l + " m");
        System.out.println("Total Luas     : " + luas + " meter persegi");
    }
}

```

---

### 3. Fungsi dengan Logika Kondisi (Cek Status)

Fungsi tidak hanya berisi perhitungan matematika biasa, tetapi juga bisa disisipi struktur kondisi (`if-else`). Fungsi ini menerima satu parameter angka, memeriksa nilainya, lalu mengembalikan teks (`String`) yang sesuai.

```java
public class CekKelulusanFungsi {

    // Fungsi mengembalikan String berdasarkan evaluasi kondisi nilai
    static String evaluasiNilai(int nilaiUjian) {
        int kkm = 75;
        if (nilaiUjian >= kkm) {
            return "LULUS";
        } else {
            return "REMEDIAL";
        }
    }

    public static void main(String[] args) {
        String namaSiswa = "Rian";
        int skor = 73;

        // Memanggil fungsi di dalam perintah cetak
        System.out.println("Siswa bernama " + namaSiswa + " dinyatakan: " + evaluasiNilai(skor));
    }
}

```

---

### 4. Fungsi untuk Konversi Suhu (Double / Pecahan)

Program ini menggunakan fungsi untuk mengubah skala suhu dari Celsius ke Fahrenheit. Kasus ini menunjukkan bagaimana fungsi menangani tipe data pecahan (`double`) agar hasil pembagian dan perkaliannya tetap akurat.

```java
public class KonversiSuhu {

    // Fungsi mengonversi suhu Celsius ke Fahrenheit
    static double celsiusToFahrenheit(double celcius) {
        // Rumus: (C * 9/5) + 32
        return (celcius * 9.0 / 5.0) + 32.0;
    }

    public static void main(String[] args) {
        double suhuSekarang = 30.0;
        
        // Memanggil fungsi konversi
        double fahrenheit = celsiusToFahrenheit(suhuSekarang);

        System.out.println("Suhu Ruangan Saat Ini:");
        System.out.println("-> " + suhuSekarang + " °C");
        System.out.println("-> " + fahrenheit + " °F");
    }
}

```

---

### 5. Fungsi dengan Perulangan (Hitung Faktorial)

Fungsi juga bisa menampung proses perulangan di dalamnya. Program ini menghitung nilai faktorial dari sebuah angka (misalnya $4! = 4 \times 3 \times 2 \times 1$).

```java
public class HitungFaktorial {

    // Fungsi non-void yang mengombinasikan perulangan di dalamnya
    static int hitungFaktorial(int angka) {
        int hasil = 1;
        
        // Loop berjalan mundur dari angka input hingga angka 1
        for (int i = angka; i > 0; i--) {
            hasil *= i; // Akumulasi perkalian
        }
        
        return hasil;
    }

    public static void main(String[] args) {
        int bilangan = 5;
        
        // Memanggil fungsi faktorial
        int totalFaktorial = hitungFaktorial(bilangan);

        System.out.println("Faktorial dari " + bilangan + " (" + bilangan + "!) adalah: " + totalFaktorial);
    }
}

```

---

> **Tips Singkat:**
> Keuntungan utama menggunakan fungsi adalah **Reusability** (kode bisa digunakan berulang kali). Jika kamu butuh menghitung luas persegi panjang 10 kali dengan angka yang berbeda-beda, kamu tidak perlu menulis ulang rumus perkaliannya 10 kali; cukup panggil fungsi `hitungLuas()` sebanyak 10 kali dengan argumen yang berbeda.

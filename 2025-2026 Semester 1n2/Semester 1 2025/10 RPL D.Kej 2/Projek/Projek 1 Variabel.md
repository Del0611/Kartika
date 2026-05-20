### 1. Program Data Diri (Menampilkan Variabel Dasar)

Program ini menggunakan beberapa tipe data standar seperti `String` (teks), `int` (angka bulat), `double` (angka pecahan), dan `boolean` (true/false) untuk menyimpan data seseorang.

```java
public class DataDiri {
    public static void main(String[] args) {
        // Deklarasi dan inisialisasi variabel
        String nama = "Budi Santoso";
        int umur = 20;
        double tinggiBadan = 175.5;
        boolean isMahasiswa = true;

        // Menampilkan nilai variabel ke layar
        System.out.println("--- Data Diri ---");
        System.out.println("Nama           : " + nama);
        System.out.println("Umur           : " + umur + " tahun");
        System.out.println("Tinggi Badan   : " + tinggiBadan + " cm");
        System.out.println("Status Kuliah  : " + (isMahasiswa ? "Aktif" : "Tidak Aktif"));
    }
}

```

---

### 2. Program Hitung Luas Persegi Panjang (Manipulasi Variabel)

Program ini menunjukkan bagaimana kita bisa menggunakan variabel untuk menyimpan nilai, lalu menggunakan variabel tersebut dalam sebuah operasi matematika (perkalian).

```java
public class HitungLuas {
    public static void main(String[] args) {
        // Variabel untuk menyimpan dimensi
        int panjang = 12;
        int lebar = 7;
        
        // Variabel untuk menyimpan hasil perhitungan
        int luas = panjang * lebar;

        // Menampilkan hasil
        System.out.println("Panjang persegi panjang : " + panjang + " cm");
        System.out.println("Lebar persegi panjang   : " + lebar + " cm");
        System.out.println("Luasnya adalah          : " + luas + " cm²");
    }
}

```

---

### 3. Program Kasir Sederhana (Variabel untuk Perhitungan)

Program ini mensimulasikan total belanjaan di toko. Di sini kita menggunakan variabel untuk harga barang, jumlah yang dibeli, total harga, hingga diskon yang didapat.

```java
public class KasirSederhana {
    public static void main(String[] args) {
        // Input data barang
        String namaBarang = "Sepatu Running";
        double hargaSatuan = 250000;
        int jumlahBeli = 2;
        double persenDiskon = 0.10; // Diskon 10%

        // Menghitung total awal dan potongan harga
        double totalAwal = hargaSatuan * jumlahBeli;
        double potonganDiskon = totalAwal * persenDiskon;
        double totalBayar = totalAwal - potonganDiskon;

        // Cetak struk belanja
        System.out.println("======== NOTA BELANJA ========");
        System.out.println("Barang       : " + namaBarang);
        System.out.println("Harga Satuan : Rp " + hargaSatuan);
        System.out.println("Jumlah Beli  : " + jumlahBeli);
        System.out.println("------------------------------");
        System.out.println("Total Awal   : Rp " + totalAwal);
        System.out.println("Diskon (10%) : Rp " + potonganDiskon);
        System.out.println("------------------------------");
        System.out.println("Total Bayar  : Rp " + totalBayar);
        System.out.println("==============================");
    }
}

```

---

> **Tips Singkat:**
> Di Java, kamu harus selalu menentukan **tipe data** variabel sebelum memberi nama (misalnya: `int` untuk angka, `String` untuk teks). Jangan lupa juga bahwa Java itu *case-sensitive*, artinya variabel `Nama` dan `nama` dianggap dua hal yang berbeda.

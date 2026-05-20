Berikut adalah 5 contoh program Java yang menggunakan berbagai variasi perulangan (*looping*). Contoh-contoh di bawah mencakup penggunaan `for`, `while`, `do-while`, hingga perulangan bersarang (*nested loop*) untuk menyelesaikan berbagai variasi kasus.

---

### 1. Menghitung Total Jumlah Angka (`for` loop)

Program ini menggunakan perulangan `for` untuk menjumlahkan deret angka dari 1 sampai 5 (yaitu $1 + 2 + 3 + 4 + 5$). Variabel penampung digunakan untuk menyimpan hasil penjumlahan secara akumulatif.

```java
public class HitungTotal {
    public static void main(String[] args) {
        int total = 0;
        int batas = 5;

        // Loop berjalan dari 1 sampai 5
        for (int i = 1; i <= batas; i++) {
            total += i; // Sama dengan: total = total + i
            System.out.println("Langkah ke-" + i + ": total menjadi " + total);
        }

        System.out.println("--------------------------------");
        System.out.println("Hasil penjumlahan 1 hingga " + batas + " adalah: " + total);
    }
}

```

---

### 2. Mencari Kelipatan Angka (`while` loop)

Program ini menggunakan `while` untuk mencari dan menampilkan bilangan kelipatan 5 yang nilainya di bawah 30. Kondisi dicek di awal sebelum mengeksekusi blok kode.

```java
public class KelipatanLima {
    public static void main(String[] args) {
        int angka = 5;
        int batas Maksimal = 30;

        System.out.println("Daftar kelipatan 5 di bawah " + batasMaksimal + ":");

        // Loop terus berjalan selama nilai 'angka' kurang dari 30
        while (angka < batasMaksimal) {
            System.out.println("-> " + angka);
            angka += 5; // Nilai ditambah 5 di setiap iterasi
        }
    }
}

```

---

### 3. Validasi Autentikasi Pengguna (`do-while` loop)

Program ini mensimulasikan sistem percobaan login. Karakteristik `do-while` memastikan kode verifikasi dijalankan minimal satu kali, dan akan terus mengulang selama status login gagal dan jatah percobaan masih ada.

```java
public class PercobaanLogin {
    public static void main(String[] args) {
        int percobaan = 1;
        int maksimalPercobaan = 3;
        boolean loginSukses = false; // Simulasi input salah

        System.out.println("=== SISTEM LOGIN ===");

        do {
            System.out.println("Mencoba login... (Percobaan ke-" + percobaan + ")");
            
            // Di sini biasanya ada proses input password. 
            // Kita simulasikan login baru berhasil pada percobaan ke-3.
            if (percobaan == 3) {
                loginSukses = true;
            }

            if (loginSukses) {
                System.out.println("Login Berhasil! Selamat Datang.");
                break; // Menghentikan perulangan secara paksa karena sudah sukses
            } else {
                System.out.println("Login Gagal. Periksa kembali data Anda.");
            }

            percobaan++;
            System.out.println("-------------------------------------");

        } while (percobaan <= maksimalPercobaan);

        if (!loginSukses) {
            System.out.println("Akun Anda diblokir sementara karena 3x salah.");
        }
    }
}

```

---

### 4. Menampilkan Isi Array / Daftar Data (`for-each` loop)

Java memiliki variasi perulangan `for` khusus bernama *Enhanced for* atau *for-each*. Loop ini sangat efisien dan rapi jika digunakan untuk membaca seluruh isi dari sebuah Array (kumpulan data) tanpa perlu memikirkan indeks angka.

```java
public class DaftarBahasa {
    public static void main(String[] args) {
        // Membuat array berisi daftar bahasa pemrograman
        String[] kumpulanBahasa = {"Java", "PHP", "Python", "Dart", "JavaScript"};

        System.out.println("Daftar materi bahasa pemrograman hari ini:");
        System.out.println("==========================================");

        // Perulangan mengambil satu per satu isi array secara otomatis
        for (String bahasa : kumpulanBahasa) {
            System.out.println("- " + bahasa);
        }
        
        System.out.println("==========================================");
    }
}

```

---

### 5. Membuat Pola Karakter Bintang (`nested` loop)

Perulangan bersarang (*nested loop*) adalah struktur di mana ada perulangan di dalam perulangan lainnya. Contoh klasik penggunaannya adalah untuk membuat pola bentuk geometri atau tabel matriks dua dimensi.

```java
public class PolaBintang {
    public static void main(String[] args) {
        int tinggiTinggi = 4;

        System.out.println("Mencetak pola segitiga siku-siku:");
        System.out.println("---------------------------------");

        // Loop luar (mengatur baris)
        for (int baris = 1; baris <= tinggiTinggi; baris++) {
            
            // Loop dalam (mengatur jumlah bintang per baris)
            for (int bintang = 1; bintang <= baris; bintang++) {
                System.out.print("* "); // Menggunakan print (tanpa ln) agar sejajar ke samping
            }
            
            System.out.println(); // Pindah ke baris baru setelah loop dalam selesai
        }
    }
}

```

---

> **Tips Analogi:**
> * `for` itu seperti **lari estafet yang jalurnya sudah jelas**: Kamu tahu harus lari berapa putaran dari awal sampai selesai.
> * `while` itu seperti **menyetir mobil saat hujan**: Kamu menyalakan *wiper* selama hujan masih turun. Jika hujan reda (kondisi `false`), *wiper* berhenti.
> * `do-while` itu seperti **mencicipi makanan**: Kamu makan dulu satu suap di awal, baru memutuskan apakah mau lanjut makan lagi atau tidak berdasarkan rasanya.
> 
>

### 1. Cek Kelayakan Kredit Rumah (KPR)

Program ini menghitung sisa gaji setelah dikurangi cicilan, lalu menggunakan operator penghubung untuk mengecek apakah seseorang layak mengambil KPR berdasarkan sisa gaji **DAN** status badannya (apakah punya utang lain).

```java
public class KelayakanKPR {
    public static void main(String[] args) {
        double gajiBulanan = 8500000;
        double cicilanKPR = 2500000;
        boolean punyaUtangLain = false; // true jika punya utang lain

        // Operator Matematika: Pengurangan
        double sisaGaji = gajiBulanan - cicilanKPR;
        double batasSisaMinimal = 5000000;

        // Operator Penghubung: Perbandingan (>=) dan Logika DAN (&&) serta TIDAK (!)
        // Layak jika sisa gaji >= 5 juta DAN tidak punya utang lain
        boolean layakKPR = (sisaGaji >= batasSisaMinimal) && (!punyaUtangLain);

        System.out.println("Gaji Bulanan   : Rp " + gajiBulanan);
        System.out.println("Cicilan KPR    : Rp " + cicilanKPR);
        System.out.println("Sisa Gaji Anda : Rp " + sisaGaji);
        System.out.println("---------------------------------");

        if (layakKPR) {
            System.out.println("Status Permohonan: DISETUJUI ✅");
        } else {
            System.out.println("Status Permohonan: DITOLAK ❌");
        }
    }
}

```

---

### 2. Validasi Kupon Diskon Belanja

Program ini menghitung total belanja setelah dipotong diskon konvensional. Kemudian, program menggunakan operator logika ATAU (`||`) untuk menentukan apakah pelanggan berhak mendapatkan *cashback* tambahan berdasarkan total belanja akhir **ATAU** status keanggotaan mereka.

```java
public class PromoBelanja {
    public static void main(String[] args) {
        double totalBelanjaAwal = 350000;
        double diskonToko = 50000;
        boolean isMemberVIP = false;

        // Operator Matematika: Pengurangan
        double totalAkhir = totalBelanjaAwal - diskonToko;

        // Operator Penghubung: Perbandingan (>) dan Logika ATAU (||)
        // Dapat cashback jika total belanja akhir di atas 250.000 ATAU dia member VIP
        boolean dapatCashbackTambahan = (totalAkhir > 250000) || isMemberVIP;

        System.out.println("Total Belanja Awal : Rp " + totalBelanjaAwal);
        System.out.println("Potongan Diskon    : Rp " + diskonToko);
        System.out.println("Total Bayar Akhir  : Rp " + totalAkhir);
        System.out.println("---------------------------------");

        if (dapatCashbackTambahan) {
            System.out.println("Selamat! Anda mendapatkan voucher cashback tambahan Rp 20.000!");
        } else {
            System.out.println("Maaf, Anda belum memenuhi syarat untuk cashback tambahan.");
        }
    }
}

```

---

### 3. Sistem Klasifikasi Nilai Siswa (Ujian & Absensi)

Program ini menghitung nilai rata-rata dari dua ujian, lalu menentukan kelulusan berdasarkan aturan yang ketat: Nilai rata-rata harus memenuhi standar **DAN** persentase kehadiran tidak boleh kurang dari batas minimal.

```java
public class KelulusanAkademik {
    public static void main(String[] args) {
        double nilaiUjian1 = 80;
        double nilaiUjian2 = 75;
        
        int totalPertemuan = 16;
        int jumlahHadir = 11;

        // Operator Matematika: Penjumlahan, Pembagian, dan Perkalian
        double rataNilai = (nilaiUjian1 + nilaiUjian2) / 2;
        double persentaseKehadiran = ((double) jumlahHadir / totalPertemuan) * 100;

        // Operator Penghubung: Perbandingan (>=) dan Logika DAN (&&)
        // Lulus jika rata-rata >= 75 DAN kehadiran >= 75%
        boolean statusLulus = (rataNilai >= 75.0) && (persentaseKehadiran >= 75.0);

        System.out.println("Rata-rata Nilai Ujian : " + rataNilai);
        System.out.println("Persentase Kehadiran  : " + persentaseKehadiran + "%");
        System.out.println("---------------------------------");

        if (statusLulus) {
            System.out.println("Hasil Akhir: LULUS MATAKULIAH");
        } else {
            System.out.println("Hasil Akhir: TIDAK LULUS (Silakan hubungi dosen pengampu)");
        }
    }
}

```

---

> **Tips Singkat:**
> Pada Program ke-3, perhatikan bagian `((double) jumlahHadir / totalPertemuan)`. Di Java, jika angka bulat (`int`) dibagi dengan angka bulat, hasilnya akan ikut dibulatkan ke bawah (misal $11 / 16 = 0$). Proses mengubah salah satunya menjadi `double` disebut dengan **Type Casting**, agar hasil pembagiannya tetap berupa angka pecahan yang akurat ($0.6875$ atau $68.75\%$).

### 1. Cek Kelayakan Kredit Rumah (KPR)

Perhatikan bagaimana sintaksis `&& (!punyaUtangLain)` di Java bertransformasi menjadi `and not punya_utang_lain` yang jauh lebih bersih di Python.

```python
gaji_bulanan = 8500000
cicilan_kpr = 2500000
punya_utang_lain = False  # Nilai boolean di Python diawali huruf kapital

# Operator Matematika: Pengurangan
sisa_gaji = gaji_bulanan - cicilan_kpr
batas_sisa_minimal = 5000000

# Operator Penghubung: Perbandingan (>=) dan Logika DAN (and) serta TIDAK (not)
# Layak jika sisa gaji >= 5 juta DAN tidak punya utang lain
layak_kpr = (sisa_gaji >= batas_sisa_minimal) and not punya_utang_lain

print(f"Gaji Bulanan   : Rp {gaji_bulanan}")
print(f"Cicilan KPR    : Rp {cicilan_kpr}")
print(f"Sisa Gaji Anda : Rp {sisa_gaji}")
print("---------------------------------")

if layak_kpr:
    print("Status Permohonan: DISETUJUI ✅")
else:
    print("Status Permohonan: DITOLAK ❌")

```

---

### 2. Validasi Kupon Diskon Belanja

Di sini, operator logika ATAU (`||`) digantikan dengan kata kunci `or`.

```python
total_belanja_awal = 350000
diskon_toko = 50000
is_member_vip = False

# Operator Matematika: Pengurangan
total_akhir = total_belanja_awal - diskon_toko

# Operator Penghubung: Perbandingan (>) dan Logika ATAU (or)
# Dapat cashback jika total belanja akhir di atas 250.000 ATAU dia member VIP
dapat_cashback_tambahan = (total_akhir > 250000) or is_member_vip

print(f"Total Belanja Awal : Rp {total_belanja_awal}")
print(f"Potongan Diskon    : Rp {diskon_toko}")
print(f"Total Bayar Akhir  : Rp {total_akhir}")
print("---------------------------------")

if dapat_cashback_tambahan:
    print("Selamat! Anda mendapatkan voucher cashback tambahan Rp 20.000!")
else:
    print("Maaf, Anda belum memenuhi syarat untuk cashback tambahan.")

```

---

### 3. Sistem Klasifikasi Nilai Siswa (Ujian & Absensi)

Kabar baik untuk program ketiga: Python secara default menggunakan **True Division** untuk operator `/`. Artinya, pembagian antar-angka bulat otomatis menghasilkan angka pecahan (*float*). Kita tidak perlu lagi melakukan *type casting* `(double)` seperti di Java!

```python
nilai_ujian1 = 80
nilai_ujian2 = 75

total_pertemuan = 16
jumlah_hadir = 11

# Operator Matematika: Penjumlahan, Pembagian, dan Perkalian
# Di Python, pembagian otomatis menghasilkan pecahan, tidak perlu type casting
rata_nilai = (nilai_ujian1 + nilai_ujian2) / 2
persentase_kehadiran = (jumlah_hadir / total_pertemuan) * 100

# Operator Penghubung: Perbandingan (>=) dan Logika DAN (and)
status_lulus = (rata_nilai >= 75.0) and (persentase_kehadiran >= 75.0)

print(f"Rata-rata Nilai Ujian : {rata_nilai}")
print(f"Persentase Kehadiran  : {persentase_kehadiran}%")
print("---------------------------------")

if status_lulus:
    print("Hasil Akhir: LULUS MATAKULIAH")
else:
    print("Hasil Akhir: TIDAK LULUS (Silakan hubungi dosen pengampu)")

```

---

> **Tips Singkat:**
> Selain pembagian otomatis (`/`), Python juga menyediakan operator `//` (Floor Division) jika kamu sengaja ingin hasil pembagiannya berupa angka bulat yang dibulatkan ke bawah (misalnya: `11 // 16` hasilnya `0`).

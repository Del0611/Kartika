### 1. Program Data Diri (Menampilkan Variabel Dasar)

Di Python, tipe data teks otomatis menjadi `str`, angka pecahan menjadi `float`, dan nilai boolean ditulis dengan huruf kapital di awal (`True` / `False`). Kita bisa menggunakan *f-string* (`f"..."`) untuk menyisipkan variabel ke dalam teks dengan rapi.

```python
# Deklarasi dan inisialisasi variabel (tanpa menentukan tipe data)
nama = "Budi Santoso"
umur = 20
tinggi_badan = 175.5  # Python menggunakan snake_case untuk nama variabel
is_mahasiswa = True

# Menampilkan nilai variabel ke layar
print("--- Data Diri ---")
print(f"Nama           : {nama}")
print(f"Umur           : {umur} tahun")
print(f"Tinggi Badan   : {tinggi_badan} cm")

# Menggunakan operator ternary khas Python untuk cek status kuliah
status_kuliah = "Aktif" if is_mahasiswa else "Tidak Aktif"
print(f"Status Kuliah  : {status_kuliah}")

```

---

### 2. Program Hitung Luas Persegi Panjang (Manipulasi Variabel)

Sintaksis perhitungan matematika di Python hampir sama persis dengan Java. Perbedaannya, proses penggabungan teks saat cetak menjadi jauh lebih mudah dengan *f-string*.

```python
# Variabel untuk menyimpan dimensi
panjang = 12
lebar = 7

# Variabel untuk menyimpan hasil perhitungan
luas = panjang * lebar

# Menampilkan hasil
print(f"Panjang persegi panjang : {panjang} cm")
print(f"Lebar persegi panjang   : {lebar} cm")
print(f"Luasnya adalah          : {luas} cm²")

```

---

### 3. Program Kasir Sederhana (Variabel untuk Perhitungan)

Perhitungan diskon dan total belanjaan menjadi lebih bersih tanpa ada *boilerplate code* (kode pembungkus) khas Java.

```python
# Input data barang
nama_barang = "Sepatu Running"
harga_satuan = 250000
jumlah_beli = 2
persen_diskon = 0.10  # Diskon 10%

# Menghitung total awal dan potongan harga
total_awal = harga_satuan * jumlah_beli
potongan_diskon = total_awal * persen_diskon
total_bayar = total_awal - potongan_diskon

# Cetak struk belanja
print("======== NOTA BELANJA ========")
print(f"Barang       : {nama_barang}")
print(f"Harga Satuan : Rp {harga_satuan}")
print(f"Jumlah Beli  : {jumlah_beli}")
print("------------------------------")
print(f"Total Awal   : Rp {total_awal}")
print(f"Diskon (10%) : Rp {potongan_diskon}")
print("------------------------------")
print(f"Total Bayar  : Rp {total_bayar}")
print("==============================")

```

---

> **Tips Singkat:**
> Berbeda dengan Java yang mendeteksi akhir baris menggunakan titik koma (`;`), Python mendeteksi akhir baris secara otomatis lewat **ganti baris baru**. Selain itu, meskipun Python tidak mewajibkan kamu menulis tipe data, Python tetap *case-sensitive* (variabel `Nama` dan `nama` tetap dianggap berbeda).

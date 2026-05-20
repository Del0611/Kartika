### 1. Menghitung Total Jumlah Angka (`for` loop)

Di Python, perulangan `for` angka menggunakan fungsi `range(start, stop)`. Perlu diingat bahwa batas `stop` pada `range()` sifatnya *eksklusif* (tidak inklusif), jadi jika ingin menghitung sampai 5, kita harus menulis batasnya hingga `batas + 1` (yaitu 6).

```python
total = 0
batas = 5

# range(1, 6) menghasilkan deret angka 1, 2, 3, 4, 5
for i in range(1, batas + 1):
    total += i
    print(f"Langkah ke-{i}: total menjadi {total}")

print("--------------------------------")
print(f"Hasil penjumlahan 1 hingga {batas} adalah: {total}")

```

---

### 2. Mencari Kelipatan Angka (`while` loop)

Struktur `while` di Python hampir sama persis dengan Java, hanya saja kita menghilangkan tanda kurung pada kondisi dan mengganti kurung kurawal dengan titik dua (`:`) serta indentasi.

```python
angka = 5
batas_maksimal = 30  # Menggunakan snake_case sesuai standar PEP 8

print(f"Daftar kelipatan 5 di bawah {batas_maksimal}:")

# Loop terus berjalan selama nilai 'angka' kurang dari 30
while angka < batas_maksimal:
    print(f"-> {angka}")
    angka += 5  # Nilai ditambah 5 di setiap iterasi

```

---

### 3. Validasi Autentikasi Pengguna (`do-while` loop)

Karena Python tidak memiliki struktur `do-while` bawaan, trik standar yang digunakan para *programmer* Python adalah menggunakan **`while True:`** (perulangan tanpa henti) lalu menaruh evaluasi kondisi di bagian bawah blok kode menggunakan `if` dan `break`.

```python
percobaan = 1
maksimal_percobaan = 3
login_sukses = False

print("=== SISTEM LOGIN ===")

# Pola perulangan untuk menyiasati tidak adanya do-while di Python
while True:
    print(f"Mencoba login... (Percobaan ke-{percobaan})")
    
    # Simulasi login sukses pada percobaan ke-3
    if percobaan == 3:
        login_sukses = True

    if login_sukses:
        print("Login Berhasil! Selamat Datang.")
        break  # Keluar paksa dari loop while True
    else:
        print("Login Gagal. Periksa kembali data Anda.")

    percobaan += 1
    print("-------------------------------------")

    # Cek kondisi akhir di bawah untuk menghentikan loop jika jatah habis
    if percobaan > maksimal_percobaan:
        break

if not login_sukses:
    print("Akun Anda diblokir sementara karena 3x salah.")

```

---

### 4. Menampilkan Isi Array / Daftar Data (`for-each` loop)

Di Python, Array disebut dengan **List**. Kabar baiknya, perulangan `for` standar di Python secara otomatis bekerja seperti *for-each* di Java saat membaca sebuah List. Sintaksisnya menjadi sangat ringkas dan bersih.

```python
# Membuat list berisi daftar bahasa pemrograman
kumpulan_bahasa = ["Java", "PHP", "Python", "Dart", "JavaScript"]

print("Daftar materi bahasa pemrograman hari ini:")
print("==========================================")

# Perulangan mengambil satu per satu isi list secara otomatis
for bahasa in kumpulan_bahasa:
    print(f"- {bahasa}")
    
print("==========================================")

```

---

### 5. Membuat Pola Karakter Bintang (`nested` loop)

Untuk mencetak karakter ke samping tanpa membuat baris baru (seperti `System.out.print` di Java), kita menggunakan parameter **`end=" "`** di dalam fungsi `print()` Python.

```python
tinggi_tinggi = 4

print("Mencetak pola segitiga siku-siku:")
print("---------------------------------")

# Loop luar (mengatur baris)
for baris in range(1, tinggi_tinggi + 1):
    
    # Loop dalam (mengatur jumlah bintang per baris)
    for bintang in range(1, baris + 1):
        # end=" " mencegah print otomatis ganti baris, melainkan memberi spasi ke samping
        print("* ", end="") 
        
    print() # Menjalankan print kosong untuk membuat baris baru setelah loop dalam selesai

```

---

> **Tips Singkat Tambahan:**
> Ketika memprogram dengan Python, pastikan tingkat **indentasi** (jarak spasi/tab dari kiri) kamu konsisten. Python memanfaatkan indentasi untuk menentukan baris kode mana yang masuk di dalam struktur perulangan (`for`/`while`) atau struktur kondisi (`if`). Satu spasi yang tidak konsisten bisa menyebabkan `IndentationError`.

# MATERI JARINGAN KOMPUTER: SUBNETTING



Materi TKJ / SMK

Teori dan Praktik



## A. Pengertian Subnetting

Subnetting adalah teknik membagi sebuah jaringan komputer yang besar menjadi beberapa jaringan kecil (subnet).

Subnetting digunakan untuk mengatur pembagian alamat IP agar lebih terstruktur, menghemat penggunaan IP Address, dan mempermudah pengelolaan jaringan.

Contoh sederhana:

Sebuah sekolah memiliki jaringan dengan 100 komputer. Daripada semua komputer berada dalam satu jaringan, administrator dapat membaginya menjadi beberapa jaringan kecil:

- Lab Komputer: 25 komputer.
- Ruang Guru: 20 komputer.
- Tata Usaha: 15 komputer.
- Ruang Kelas: 40 komputer.

Dengan subnetting, setiap bagian dapat memiliki jaringan IP masing-masing.

## B. Tujuan Subnetting

1. Membagi jaringan besar menjadi jaringan kecil.
2. Menghemat penggunaan IP Address.
3. Mempermudah pengelolaan jaringan.
4. Mengurangi lalu lintas broadcast.
5. Meningkatkan efisiensi jaringan.
6. Mempermudah proses troubleshooting.

## C. Istilah Penting dalam Subnetting

Sebelum belajar menghitung subnetting, pahami beberapa istilah berikut.

| Istilah           | Pengertian                                         |
| ----------------- | -------------------------------------------------- |
| IP Address        | Alamat perangkat dalam jaringan                    |
| Subnet Mask       | Penentu bagian Network dan Host                    |
| Network ID        | Alamat identitas jaringan                          |
| Broadcast Address | Alamat untuk mengirim ke seluruh host dalam subnet |
| Host              | Perangkat yang terhubung ke jaringan               |
| Prefix            | Penulisan subnet mask menggunakan tanda `/`        |
| Gateway           | Alamat penghubung ke jaringan lain                 |

## D. Kelas IP Address

IP Address IPv4 dibagi menjadi beberapa kelas.

| Kelas | Rentang IP | Subnet Mask Default |
| ----- | ---------- | ------------------- |
| A     | 1–126      | 255.0.0.0           |
| B     | 128–191    | 255.255.0.0         |
| C     | 192–223    | 255.255.255.0       |
| D     | 224–239    | Multicast           |
| E     | 240–255    | Eksperimen          |

Contoh IP Address kelas C:

`192.168.1.10`

Subnet mask default:

`255.255.255.0`

Prefix:

`/24`

## E. Memahami Prefix dan Subnet Mask

Prefix adalah jumlah bit bernilai 1 dalam subnet mask.

Contoh:

| Prefix | Subnet Mask     |
| ------ | --------------- |
| /24    | 255.255.255.0   |
| /25    | 255.255.255.128 |
| /26    | 255.255.255.192 |
| /27    | 255.255.255.224 |
| /28    | 255.255.255.240 |
| /29    | 255.255.255.248 |
| /30    | 255.255.255.252 |

Semakin besar angka prefix, semakin kecil jumlah alamat IP yang tersedia untuk host.

## F. Rumus Dasar Subnetting

Ada beberapa rumus yang harus dipahami.

1\. Menghitung jumlah subnet

\\[ 2^n \\]

Keterangan:

\- n = jumlah bit yang dipinjam dari bagian host.

2\. Menghitung jumlah host

\\[ 2^h-2 \\]

Keterangan:

- h = jumlah bit yang tersisa untuk host.
- Dikurangi 2 karena satu alamat digunakan sebagai Network ID dan satu sebagai Broadcast Address.

3\. Menghitung blok subnet

\\[ 256 - \text{nilai subnet mask} \\]

Rumus ini digunakan pada oktet tempat subnetting dilakukan.

## G. Contoh Soal dan Pembahasan Subnetting

Contoh soal 1

Soal:

Diketahui IP Address:

`192.168.1.10/26`

Tentukan:

1. Subnet mask.
2. Jumlah subnet.
3. Jumlah host setiap subnet.
4. Network ID.
5. Broadcast Address.
6. Rentang IP yang dapat digunakan.

Jawaban dan pembahasan:

Langkah 1: Menentukan subnet mask.

Prefix `/26` berarti:

`255.255.255.192`

Langkah 2: Menghitung jumlah subnet.

IP kelas C memiliki prefix default `/24`.

Bit yang dipinjam:

\\[ 26-24=2 \\]

Jumlah subnet:

\\[ 2^2=4 \\]

Jadi, terdapat 4 subnet.

Langkah 3: Menghitung jumlah host.

Sisa bit host:

\\[ 32-26=6 \\]

Jumlah host:

\\[ 2^6-2=62 \\]

Jadi, setiap subnet memiliki 62 host yang dapat digunakan.

Langkah 4: Menghitung blok subnet.

\\[ 256-192=64 \\]

Jadi, kelipatan subnet adalah 64.

Langkah 5: Menentukan pembagian subnet.

| Subnet | Network ID    | Host Pertama | Host Terakhir | Broadcast |
| ------ | ------------- | ------------ | ------------- | --------- |
| 1      | 192.168.1.0   | .1           | .62           | .63       |
| 2      | 192.168.1.64  | .65          | .126          | .127      |
| 3      | 192.168.1.128 | .129         | .190          | .191      |
| 4      | 192.168.1.192 | .193         | .254          | .255      |

IP `192.168.1.10` berada pada subnet pertama.

Kesimpulan jawaban

- IP Address: 192.168.1.10/26
- Subnet Mask: 255.255.255.192
- Network ID: 192.168.1.0
- Broadcast: 192.168.1.63
- Host pertama: 192.168.1.1
- Host terakhir: 192.168.1.62
- Jumlah host: 62

## H. Contoh Soal 2

Soal:

Sebuah jaringan memiliki IP Address:

`192.168.10.0/27`

Tentukan jumlah subnet, jumlah host, subnet mask, dan blok subnet!

Pembahasan:

1. Subnet mask: `255.255.255.224`
2. Bit dipinjam: 27 - 24 = 3.
3. Jumlah subnet:

\\[ 2^3=8 \\]

4. Bit host: 32 - 27 = 5.
5. Jumlah host:

\\[ 2^5-2=30 \\]

6\. Blok subnet:

\\[ 256-224=32 \\]

Jadi, jaringan memiliki 8 subnet, dengan 30 host yang dapat digunakan pada setiap subnet.

# I. Latihan Soal Subnetting (10 Nomor)

Latihan Mandiri

Kerjakan soal berikut di buku catatan masing-masing. Tuliskan langkah perhitungannya, bukan hanya jawabannya.

1\. Jelaskan pengertian subnetting menggunakan bahasa sendiri!

2\. Apa tujuan dilakukannya subnetting dalam jaringan komputer? Sebutkan minimal 3 tujuan!

3\. Diketahui IP Address `192.168.1.10/24`. Tentukan subnet mask dari IP tersebut!

4\. Diketahui IP Address `192.168.1.0/26`. Tentukan:

- Subnet mask.
- Jumlah subnet.
- Jumlah host setiap subnet.

5\. Diketahui IP Address `192.168.10.0/27`. Tentukan:

- Network ID subnet pertama.
- Broadcast subnet pertama.
- Host pertama.
- Host terakhir.

6\. Diketahui IP Address `192.168.20.0/28`. Hitung berapa jumlah host yang dapat digunakan dalam satu subnet!

7\. Sebuah jaringan menggunakan subnet mask `255.255.255.192`. Tentukan prefix dan jumlah host yang dapat digunakan!

8\. Diketahui IP Address `192.168.5.100/26`. Tentukan:

- Network ID.
- Broadcast Address.
- Host pertama.
- Host terakhir.

9\. Sebuah laboratorium komputer memiliki 50 komputer. Administrator ingin membuat satu jaringan yang dapat menampung seluruh komputer tersebut. Prefix berapakah yang paling sesuai jika menggunakan jaringan IPv4 privat kelas C?

10\. Diketahui jaringan `192.168.100.0/24` akan dibagi menjadi 4 subnet yang sama besar. Tentukan:

- Prefix baru.
- Subnet mask baru.
- Jumlah host setiap subnet.
- Network ID keempat subnet.
- Broadcast masing-masing subnet.

## K. Kesimpulan

Subnetting merupakan salah satu materi dasar jaringan komputer yang wajib dipahami oleh siswa TKJ. Dengan memahami subnetting, siswa dapat membagi jaringan, menentukan Network ID, Broadcast Address, rentang IP Address, serta menghitung jumlah host dalam sebuah jaringan.

Tips belajar: Jangan langsung menghafal hasil subnetting. Pahami terlebih dahulu cara menghitung prefix, subnet mask, blok subnet, dan jumlah host.

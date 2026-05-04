import java.util.Scanner;

public class KasirSederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String namaBarang;
        int harga, jumlah;
        int total = 0;
        char lagi;

        do {
            System.out.println("=== KASIR SEDERHANA ===");

            System.out.print("Nama Barang : ");
            namaBarang = input.nextLine();

            System.out.print("Harga       : ");
            harga = input.nextInt();

            System.out.print("Jumlah      : ");
            jumlah = input.nextInt();

            int subtotal = harga * jumlah;
            total += subtotal;

            System.out.println("Subtotal    : " + subtotal);

            input.nextLine(); // membersihkan buffer

            System.out.print("Tambah barang lagi? (y/n): ");
            lagi = input.next().charAt(0);
            input.nextLine();

        } while (lagi == 'y' || lagi == 'Y');

        // Diskon
        double diskon = 0;
        if (total > 100000) {
            diskon = total * 0.1;
        }

        double totalBayar = total - diskon;

        System.out.println("\n=== PEMBAYARAN ===");
        System.out.println("Total Belanja : " + total);
        System.out.println("Diskon        : " + diskon);
        System.out.println("Total Bayar   : " + totalBayar);

        System.out.print("Uang Bayar    : ");
        double bayar = input.nextDouble();

        double kembalian = bayar - totalBayar;

        System.out.println("Kembalian     : " + kembalian);
        System.out.println("Terima kasih telah berbelanja!");

        input.close();
    }
}

import java.util.ArrayList;
import java.util.Scanner;

class Produk {
    private String namaProduk;
    private double harga;
    private int stok;

    public Produk(String namaProduk, double harga, int stok) {
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    public void kurangiStok(int jumlah) {
        stok -= jumlah;
    }
}

class Penjualan {
    private String namaProduk;
    private int quantity;
    private double hargaTotal;

    public Penjualan(String namaProduk, int quantity, double hargaTotal) {
        this.namaProduk = namaProduk;
        this.quantity = quantity;
        this.hargaTotal = hargaTotal;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getHargaTotal() {
        return hargaTotal;
    }
}

public class PemesananMakanan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Produk> daftarMenu = initializeMenu();

        // Tampilkan menu
        System.out.println("Menu Makanan:");
        for (Produk produk : daftarMenu) {
            System.out.println(produk.getNamaProduk() + " - Rp. " + produk.getHarga());
        }

        // Pesan menu
        ArrayList<Penjualan> pesanan = new ArrayList<>();
        String pesanLagi;

        do {
            System.out.print("\nMasukkan nama produk yang ingin dipesan: ");
            String namaProduk = scanner.nextLine();
            System.out.print("Masukkan jumlah yang ingin dipesan: ");
            int quantity = scanner.nextInt();
            scanner.nextLine(); // Membuang karakter newline

            Produk produkDipesan = cariProduk(daftarMenu, namaProduk);
            if (produkDipesan != null && produkDipesan.getStok() >= quantity) {
                double hargaTotal = produkDipesan.getHarga() * quantity;
                pesanan.add(new Penjualan(namaProduk, quantity, hargaTotal));
                produkDipesan.kurangiStok(quantity);
                System.out.println("Produk berhasil dipesan.");
            } else {
                System.out.println("Maaf, produk tidak tersedia atau stok tidak mencukupi.");
            }

            System.out.print("Apakah Anda ingin memesan lagi? (ya/tidak): ");
            pesanLagi = scanner.nextLine();
        } while (pesanLagi.equalsIgnoreCase("ya"));

        // Tampilkan pesanan dan total bayar
        System.out.println("\nPesanan Anda:");
        double totalBayar = 0;
        for (Penjualan pesananItem : pesanan) {
            System.out.println(pesananItem.getNamaProduk() + " - " + pesananItem.getQuantity() + " pcs - Rp. " + pesananItem.getHargaTotal());
            totalBayar += pesananItem.getHargaTotal();
        }
        System.out.println("Total Bayar: Rp. " + totalBayar);

        scanner.close();
    }

    private static ArrayList<Produk> initializeMenu() {
        ArrayList<Produk> daftarMenu = new ArrayList<>();
        daftarMenu.add(new Produk("Nasi Goreng", 15000, 20));
        daftarMenu.add(new Produk("Mie Goreng", 12000, 15));
        daftarMenu.add(new Produk("Ayam Goreng", 20000, 10));
        daftarMenu.add(new Produk("Sate Ayam", 25000, 8));
        // Tambahkan produk lain di sini sesuai kebutuhan

        return daftarMenu;
    }

    private static Produk cariProduk(ArrayList<Produk> daftarMenu, String namaProduk) {
        for (Produk produk : daftarMenu) {
            if (produk.getNamaProduk().equalsIgnoreCase(namaProduk)) {
                return produk;
            }
        }
        return null;
    }
}

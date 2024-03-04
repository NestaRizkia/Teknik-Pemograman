import java.util.ArrayList;
import java.util.Scanner;

public class Pemesanan {
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
            scanner.nextLine(); 

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
        daftarMenu.add(new Produk("Mie Goreng", 6000, 15));
        daftarMenu.add(new Produk("Ayam Goreng", 8000, 10));
        daftarMenu.add(new Produk("Sate Ayam", 15000, 8));
        daftarMenu.add(new Produk("Nasi Kuning", 8000, 12));
        daftarMenu.add(new Produk("Bakso", 10000, 20));
        daftarMenu.add(new Produk("Soto Ayam", 12000, 15));
        daftarMenu.add(new Produk("Ikan Bakar", 25000, 10));
        daftarMenu.add(new Produk("Capcay", 12000, 18));
        daftarMenu.add(new Produk("Gado-gado", 10000, 10));
        daftarMenu.add(new Produk("Tahu Goreng", 2000, 25));
        daftarMenu.add(new Produk("Sambal Goreng", 2000, 20));
        daftarMenu.add(new Produk("Pecel Lele", 14000, 15));
        daftarMenu.add(new Produk("Rendang", 15000, 10));
        daftarMenu.add(new Produk("Sop Ayam", 1000, 12));

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
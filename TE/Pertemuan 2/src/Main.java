import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Membaca input nama pembeli
        System.out.print("Masukkan nama pembeli: ");
        String namaPembeli = scanner.nextLine();

        // Membaca input alamat pembeli
        System.out.print("Masukkan alamat pembeli: ");
        String alamatPembeli = scanner.nextLine();

        // Membaca input jenis bunga
        System.out.print("Masukkan jenis bunga: ");
        String jenisBunga = scanner.nextLine();

        // Membaca input warna bunga
        System.out.print("Masukkan warna bunga: ");
        String warnaBunga = scanner.nextLine();

        // Membaca input banyak bunga yang dibeli
        System.out.println("Masukan jumlah bunga yang dibeli : ");
        Integer banyakbunga = scanner.nextInt();

        // Membuat objek Bunga
        Bunga bunga = new Bunga(jenisBunga, warnaBunga, banyakbunga);

        // Membuat objek Pembeli
        Pembeli pembeli = new Pembeli(namaPembeli, alamatPembeli, bunga);

        // Menampilkan informasi pembeli dan bunganya
        pembeli.infoPembeli();

        scanner.close();
    }
}

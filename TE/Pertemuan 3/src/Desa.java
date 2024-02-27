import java.util.Scanner;

public class Desa {
    public static void main(String[] args) {
        // Membuat data warga desa
        WargaDesa[] warga = createData();

        // Meminta input dari pengguna
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama warga yang ingin dicari: ");
        String searchName = scanner.nextLine();

        // Mencari dan menampilkan data warga yang dicari
        for (WargaDesa w : warga) 
        {
             if (w.getNama().toLowerCase().contains(searchName.toLowerCase())) {
                 w.displayInfo();
                 break;
            }
            // Menampilkan pesan jika data tidak ditemukan
            else 
            {
                System.out.println("Data warga dengan nama " + searchName + " tidak ditemukan.");
                break;
            }
        }

        // Menampilkan pesan jika data tidak ditemukan

        scanner.close();
    }

    // Method untuk membuat data warga desa
    public static WargaDesa[] createData() {
        WargaDesa[] warga = new WargaDesa[10];
        warga[0] = new WargaDesa("Nesta Rizkia Saputra", 19, "Laki-laki", "Jln Marken 5 D2 no 16");
        warga[1] = new WargaDesa("Zaky Aliyashfi", 19, "Laki-Laki", "Jl. Sayuran");
        warga[2] = new WargaDesa("Fathan Khairun", 18, "Laki-laki", "Padalarang");
        warga[3] = new WargaDesa("Ahmad Fatan", 18, "Laki-laki", "Kost di Ciwaruga");
        warga[4] = new WargaDesa("Addrian Pratama", 19, "Laki-laki", "Jl. SetraDuta");
        warga[5] = new WargaDesa("Fanza Atsila", 18, "Laki-Laki", "Cimahi");
        warga[6] = new WargaDesa("Ais Laksana", 18, "Laki-laki", "Kost di Ciwaruga");
        warga[7] = new WargaDesa("Devi Febrianti", 18, "Perempuan", "Jl. Ujung Berung");
        warga[8] = new WargaDesa("Hasbi Assidiq", 20, "Laki-laki", "Jl. Ciwaruga");
        warga[9] = new WargaDesa("Astria", 19, "Perempuan", "Jl. Ciwaruga");

        return warga;
    }
}
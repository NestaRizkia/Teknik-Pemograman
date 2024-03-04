import java.util.Scanner;

public class Strings
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Membaca dua string dari input pengguna
        System.out.print("Masukkan string pertama: ");
        String stringPertama = scanner.nextLine();
        System.out.print("Masukkan string kedua: ");
        String stringKedua = scanner.nextLine();

        // 1. Menjumlahkan panjang dari string Pertama dan Kedua
        int jumlahPanjang = stringPertama.length() + stringKedua.length();
        System.out.println(jumlahPanjang);

        // 2. Menentukan apakah string Pertama leksikografis lebih besar dari string Kedua
        if (stringPertama.length() > (stringKedua.length()) ) {
            System.out.println("Ya");
        } else {
            System.out.println("Tidak");
        }

        // 3. Mengkapitalkan huruf pertama pada string Pertama dan Kedua, lalu mencetaknya dalam satu baris
        String kapitalPertama = kapitalkanHurufPertama(stringPertama);
        String kapitalKedua = kapitalkanHurufPertama(stringKedua);
        System.out.println(kapitalPertama + " " + kapitalKedua);

        scanner.close();
    }

    // Fungsi untuk mengkapitalkan huruf pertama dalam sebuah string
    public static String kapitalkanHurufPertama(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }
        return Character.toUpperCase(s.charAt(0)) + s.substring(1);
    }
}

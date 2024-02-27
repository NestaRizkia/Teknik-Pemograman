public class Pembeli 
{
    private String nama;
    private String alamat;
    private Bunga bunga;

    public Pembeli(String nama, String alamat, Bunga bunga) 
    {
        this.nama = nama;
        this.alamat = alamat;
        this.bunga = bunga;
    }

    // Getter dan setter untuk Nama Pembeli
    public String getNama() 
    {
        return nama;
    }

    // Getter dan setter untuk alamat dari pembeli
    public String getAlamat() 
    {
        return alamat;
    }

    // Getter dan setter untuk Bunga yang sudah dipilih
    public Bunga getBunga() 
    {
        return bunga;
    }

    // Method untuk menampilkan informasi pembeli dan bunga yang dibeli
    public void infoPembeli() 
    {
        System.out.println("Nama Pembeli: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Bunga: " + bunga.getJenisBunga() + " " + bunga.getWarna());
        System.out.println(" " + bunga.getBanyakBunga() + " tangkai " );
    }
}

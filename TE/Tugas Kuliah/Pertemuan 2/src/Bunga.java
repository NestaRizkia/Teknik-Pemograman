public class Bunga 
{
    private String jenisbunga;
    private String warna;
    private Integer banyakbunga;

    public Bunga(String jenisbunga, String warna, Integer banyakbunga) 
    {
        this.jenisbunga = jenisbunga;
        this.warna = warna;
        this.banyakbunga = banyakbunga;
    }

    // Getter dan setter untuk Jenis Bunga
    public String getJenisBunga() 
    {
        return jenisbunga;
    }

    // Getter dan setter untuk Warna Bunga
    public String getWarna() 
    {
        return warna;
    }

    // Getter dan setter untuk banyak bunga yang dibeli
    public Integer getBanyakBunga()
    {
        return banyakbunga;
    }
}

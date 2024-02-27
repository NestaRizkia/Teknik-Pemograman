// Kelas abstrak Warga
abstract class Warga 
{
    abstract void displayInfo();
}

class WargaDesa extends Warga
{
    private String nama;
    private int umur;
    private String gender;
    private String alamat;

    public WargaDesa(String nama, int umur, String gender, String alamat) 
    {
        this.nama = nama;
        this.umur = umur;
        this.gender = gender;
        this.alamat = alamat;
    }

    public String getNama() 
    {
        return nama;
    }

    @Override
    public void displayInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Gender: " + gender);
        System.out.println("Alamat: " + alamat);
    }
}


class Penjualan 
{
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

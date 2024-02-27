class MenuItem {
    private String nama;
    private double harga;
    private int stok;

    public MenuItem(String nama, double harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public String getNama() {
        return nama;
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

    public boolean isOutOfStock() {
        return stok == 0;
    }
}

// class MenuItem {
//     private String nama;
//     private double harga;
//     private int stok;

//     public MenuItem(String nama, double harga, int stok) {
//         this.nama = nama;
//         this.harga = harga;
//         this.stok = stok;
//     }

//     public String getNama() {
//         return nama;
//     }

//     public double getHarga() {
//         return harga;
//     }

//     public int getStok() {
//         return stok;
//     }

//     public boolean isOutOfStock() {
//         return stok == 0;
//     }
// }
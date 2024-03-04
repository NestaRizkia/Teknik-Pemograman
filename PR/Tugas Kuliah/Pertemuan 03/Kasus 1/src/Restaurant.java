public class Restaurant {
    private MenuItem[] daftarMenu;
    private int id;

    public Restaurant() {
        daftarMenu = new MenuItem[10];
        id = 0;
    }

    public void tambahMenuMakanan(String nama, double harga, int stok) {
        if (id < daftarMenu.length) {
            MenuItem item = new MenuItem(nama, harga, stok);
            daftarMenu[id] = item;
            id++;
        } else {
            System.out.println("Menu tidak ada.");
        }
    }
    public void PesanMenu(int idMenu, int jumlah) 
    {
        if (idMenu >= 0 && idMenu < id && daftarMenu[idMenu].getStok() >= jumlah) 
        {
            daftarMenu[idMenu].kurangiStok(jumlah);
            System.out.println("Pesanan Anda berhasil.");
        } else {
            System.out.println("Menu tidak tersedia atau stok tidak mencukupi.");
        }
    }

    public void tampilMenuMakanan() 
    {
        for (int i = 0; i < id; i++) 
        {
            if (!daftarMenu[i].isOutOfStock()) 
            {
            System.out.println(daftarMenu[i].getNama() + "[" + daftarMenu[i].getStok() + "]" + "\tRp. " + daftarMenu[i].getHarga());
            }
        }
    }
}

// public class Restaurant 
// {
//     private MenuItem[] daftarMenu;
//     private static byte id = 0;

//     public Restaurant() 
//     {
//         daftarMenu = new MenuItem[10];
//     }

//     public void tambahMenuMakanan(String nama, double harga, int stok) 
//     {
//         MenuItem item = new MenuItem(nama, harga, stok);
//         daftarMenu[id] = item;
//         id++;
//     }

//     public void tampilMenuMakanan() 
//     {
//         for (int i = 0; i < id; i++) 
//         {
//             if (!daftarMenu[i].isOutOfStock()) 
//             {
//                 System.out.println(daftarMenu[i].getNama() + "[" + daftarMenu[i].getStok() + "]" + "\tRp. " + daftarMenu[i].getHarga());
//             }
//         }
//     }
// }

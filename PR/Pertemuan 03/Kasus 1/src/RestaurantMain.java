public class RestaurantMain 
{
public static void main(String[] args) 
{
    Restaurant menu = new Restaurant();
    menu.tambahMenuMakanan("bala-bala", 1_000, 20);
    menu.tambahMenuMakanan("Gehu", 1_000, 100);
    menu.tambahMenuMakanan("Molen", 1_000, 20);

    menu.tampilMenuMakanan();

    // Contoh pemesanan
    menu.PesanMenu (3,10);
    menu.tampilMenuMakanan(); // Memperlihatkan stok yang berkurang setelah pemesanan
    }
}

//     public static void main(String[] args) 
//     {
//         Restaurant menu = new Restaurant();
//         menu.tambahMenuMakanan("bala-bala", 1_000, 20);
//         menu.tambahMenuMakanan("Gehu", 1_000, 0);
//         menu.tambahMenuMakanan("Molen", 1_000, 20);

//         menu.tampilMenuMakanan();
//     }
// }
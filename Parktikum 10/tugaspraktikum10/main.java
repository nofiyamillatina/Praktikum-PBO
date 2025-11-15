/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikum10;

/**
 *
 * @author lenovo
 */
public class main {
    public static void main(String[] args) {
        // Objek Elektronik
        Elektronik kulkas = new Elektronik();
        double hargaKulkas = 3000000;
        double pajakKulkas = kulkas.hitungPajak(hargaKulkas);
        System.out.println("--- Elektronik ---");
        System.out.println("Harga kulkas: Rp " + hargaKulkas);
        System.out.println("Pajak kulkas: Rp " + pajakKulkas);
        System.out.println("Total harga keseluruhan: Rp " + (hargaKulkas + pajakKulkas));
    
        // Objek Makanan
        Makanan Cake = new Makanan();
        double hargaCake = 50000;
        double pajakCake = Cake.hitungPajak(hargaCake);
        System.out.println("\n--- Makanan ---");
        System.out.println("Harga cake: Rp " + hargaCake);
        System.out.println("Pajak cake: Rp " + pajakCake);
        System.out.println("Total harga keseluruhan: Rp " + (hargaCake + pajakCake));
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPraktikum6;

/**
 *
 * @author lenovo
 */
import java.util.ArrayList;
import java.util.List;

class KeranjangBelanja {
    private ArrayList<Produk> daftarProduk = new ArrayList<>();
    
    // Menambahkan produk ke keranjang
    public void tambahProduk(Produk P) {
        daftarProduk.add(P);
    }
    
    // Menghitung harga total
    public double hitungTotal() {
        double total = 0;
        for (Produk P : daftarProduk) {
            total += P.getHargaSetelahDiskon();
        }
        
        return total;
    }
    
    // Menampilkan isi kerangjang
    public void tampilkanKeranjang() {
        System.out.println("--- Daftar Nama Produk ---");
        System.out.println();
        for (Produk P : daftarProduk) {
            System.out.println(
                P.getNama() +
                " Harga awal produk: " + P.getHarga());
            System.out.println(
                "Harga setelah diskon: " + P.getHargaSetelahDiskon());  
            System.out.println();
        }
    }
}


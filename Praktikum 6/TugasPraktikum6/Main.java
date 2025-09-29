/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPraktikum6;

/**
 *
 * @author lenovo
 */
public class Main {
    public static void main(String[] args) {
        // Memasukkan produk
        Produk buku = new Buku("Laut Bercerita", 120000);
        Produk elektronik = new Elektronik("Televisi", 3000000);
        Produk pakaian = new Pakaian("Jaket", 200000);
        
        // Membuat keranjang belanja
        KeranjangBelanja keranjang = new KeranjangBelanja();
        keranjang.tambahProduk(buku);
        keranjang.tambahProduk(elektronik);
        keranjang.tambahProduk(pakaian);
        
        // Menampilkan isi keranjang
        keranjang.tampilkanKeranjang();
        
        // Menghitung total
        System.out.println("Total harga setelah diskon: " + keranjang.hitungTotal());
    }
}

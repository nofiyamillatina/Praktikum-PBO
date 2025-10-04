/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemManajemenProdukdanPegawai;

/**
 *
 * @author lenovo
 */
public class MainProduk {
    public static void main(String[] args) {
        Produk produk1 = new Elektronik("Televisi", 3000000, 4);
        Produk produk2 = new Makanan("Taro", 3000, "2026-10-26");
        
        produk1.tampilkanInfo();
        System.out.println();
        produk2.tampilkanInfo();
    }
}

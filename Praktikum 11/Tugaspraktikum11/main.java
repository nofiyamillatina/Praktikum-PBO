/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugaspraktikum11;

/**
 *
 * @author acer
 */
public class main {
    public static void main(String[] Args) {
        Pengarang pengarang1 = new Pengarang("Tere Liye");
        Pengarang pengarang2 = new Pengarang("Laila Chudori");
        Pengarang pengarang3 = new Pengarang("Andrea Hirata");
        
        Buku buku1 = new Buku("Bumi", pengarang1);
        Buku buku2 = new Buku("Laut Bercerita", pengarang2);
        Buku buku3 = new Buku("Laskar Pelangi", pengarang3);
        
        Perpustakaan perpustakaan = new Perpustakaan(5);
        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);
        perpustakaan.tambahBuku(buku3);
        
        perpustakaan.infoPerpustakaan();
        
        perpustakaan = null;
    }
}


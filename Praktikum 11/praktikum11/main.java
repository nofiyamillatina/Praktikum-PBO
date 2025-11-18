/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum11;

/**
 *
 * @author acer
 */
public class main {
    public static void main(String[] Args) {
        Perpustakaan perpustakaan = new Perpustakaan();
        
        Buku buku1 = new Buku("Bumi");
        Buku buku2 = new Buku("Laut Bercerita");
        Buku buku3 = new Buku("Bumi Manusia");
        
        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);
        perpustakaan.tambahBuku(buku3);
        
        perpustakaan.infoPerpustakaan();
    }
}

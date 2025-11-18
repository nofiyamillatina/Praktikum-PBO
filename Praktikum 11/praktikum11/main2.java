/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum11;

/**
 *
 * @author acer
 */
public class main2 {
    public static void main(String[] args) {

        // Membuat anggota
        Anggota anggota1 = new Anggota("Raihan");
        Anggota anggota2 = new Anggota("Dika");
        Anggota anggota3 = new Anggota("Bagas");

        // Membuat klub dan menambahkan anggota
        Klub klub = new Klub("Klub Sepak Bola");
        klub.tambahAnggota(anggota1);
        klub.tambahAnggota(anggota2);
        klub.tambahAnggota(anggota3);

        // Menampilkan info klub
        klub.infoKlub();

        // Menghapus klub, tetapi anggota tetap ada (agregasi)
        klub = null;

        System.out.println("\nAnggota masih ada meskipun klub dihapus:");
        anggota1.infoAnggota();
        anggota2.infoAnggota();
        anggota3.infoAnggota();
    }
}


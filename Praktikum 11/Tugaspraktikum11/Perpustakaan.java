/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugaspraktikum11;
/**
 *
 * @author acer
 */
class Perpustakaan {
    private Buku[] daftarBuku; 
    private int jumlahBuku = 0;

    public Perpustakaan(int kapasitas) {
        daftarBuku = new Buku[kapasitas];
    }

    public void tambahBuku(Buku buku) {
        if (jumlahBuku < daftarBuku.length) {
            daftarBuku[jumlahBuku] = buku;
            jumlahBuku++;
        } else {
            System.out.println("Perpustakaan penuh!");
        }
    }

    public void infoPerpustakaan() {
        System.out.println("Daftar Buku di Perpustakaan:");
        for (int i = 0; i < jumlahBuku; i++) {
            daftarBuku[i].infoBuku();
            System.out.println("----------------------");
        }
    }
}


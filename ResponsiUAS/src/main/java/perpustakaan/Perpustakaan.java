/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaan;

/**
 *
 * @author lenovo
 */
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Perpustakaan implements Serializable {
    private List<Anggota> daftarAnggota;

    public Perpustakaan() {
        daftarAnggota = new ArrayList<>();
    }

    public void tambahAnggota(Anggota anggota) {
        daftarAnggota.add(anggota);
    }

    public void tampilAnggota() {
        for (Anggota a : daftarAnggota) {
            a.tampilInfo();
            System.out.println("----------------");
        }
    }
}

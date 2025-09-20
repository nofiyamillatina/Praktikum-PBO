/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPraktikum5;

/**
 *
 * @author lenovo
 */
public class Hewan {
    String nama;
    String jenis;
    
    public Hewan(String nama, String jenis) {
        this.nama = nama;
        this.jenis = jenis;
    }
    
    public void tampilkanInfo() {
        System.out.println("Nama hewan  : " + nama);
        System.out.println("Jenis hewan : " + jenis);
    }
}

// Kelas Turunan Kucing
class Kucing extends Hewan {
    String suara;
    
    public Kucing(String nama) {
        super(nama, "Kucing");
        this.suara = suara;
    }
    
    public void tampilkanInfoKucing() {
        System.out.println("Suara: " + suara);
    }
    
    public void suara() {
        System.out.println("Suara: Meoww Meoww....");
    }
    
    // Override tampilkan info
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        suara();
    }
}

// Kelas Turunan Anjing
class Anjing extends Hewan {
    public Anjing(String nama) {
        super(nama, "Anjing");
    }
    
    public void suara() {
        System.out.println("Suara: Gukk Guukk...");
    }
    
    //Override
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        suara();
    }
}

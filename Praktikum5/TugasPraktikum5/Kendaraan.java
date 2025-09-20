/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPraktikum5;

/**
 *
 * @author lenovo
 */
class Kendaraan {
    String nama;
    
    public Kendaraan(String nama) {
        this.nama = nama;
    }
    
    public void tampilkanInfo() {
        System.out.println("Nama kendaraan: " + nama);
    }
}

// Kelas Menengah KendaraanDarat
class KendaraanDarat extends Kendaraan {
    int jumlahRoda;
    
    public KendaraanDarat(String nama, int jumlahRoda) {
        super(nama);
        this.jumlahRoda = jumlahRoda;
    }
    
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("jumlah roda: " + jumlahRoda);
    }
}

// Kelas Turunan Mobil
class Mobil1 extends KendaraanDarat {
    int jumlahPintu;
    
    public Mobil1(String nama, int jumlahRoda, int jumlahPintu) {
        super(nama, jumlahRoda);
        this.jumlahPintu = jumlahPintu;
    }
    
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah pintu: " + jumlahPintu);
    }
}

// Kelas Turunan Motor
class SepedaMotor1 extends KendaraanDarat {
    String jenisMesin;
    
    public SepedaMotor1(String nama, int jumlahRoda, String jenisMesin) {
        super(nama, jumlahRoda);
        this.jenisMesin = jenisMesin;
    }
    
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis mesin: " + jenisMesin);
    }
}
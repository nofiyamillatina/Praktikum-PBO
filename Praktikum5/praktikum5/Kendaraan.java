/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author lenovo
 */
class Kendaraan {
    String nama;
    int kecepatan;
    String metode;
    
    public Kendaraan(String nama, int kecepatan) {
        this.nama = nama;
        this.kecepatan = kecepatan;
    }
    
    public void tampilkanInfo() {
        System.out.println("Nama Kendaraan: " + nama);
        System.out.println("Kecepatan: " + kecepatan + " km/jam");
    }
}

// Kelas Turunan Mobil
class Mobil extends Kendaraan {
    int jumlahPintu;
     
    public Mobil(String nama, int kecepatan, int jumlahPintu) {
        super(nama, kecepatan);
        this.jumlahPintu = jumlahPintu;
    }
    
    public void tampilkanInfoMobil() {
        System.out.println("Mobil dengan " + jumlahPintu + "pintu");
    }
    
    // Override method tampilkanInfo()
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah pintu " + jumlahPintu);
    }
}

// Kelas Turunan Sepeda Motor
class SepedaMotor extends Kendaraan {
    String jenisMesin;
    
    public SepedaMotor(String nama, int kecepatan, String jenisMesin) {
        super(nama, kecepatan);
        this.jenisMesin = jenisMesin;
    }
    
    // Override method TampilkanInfo()
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis mesin " + jenisMesin);
    }
}

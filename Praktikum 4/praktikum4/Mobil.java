/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author lenovo
 */
public class Mobil extends Kendaraan2 {
    private int jumlahPintu;    // Atribut tambahan khusus untuk mobil
    
    // Constructor
    public Mobil(String nama, int kecepatanMaks, String jenisMesin, int jumlahPintu) {
        super(nama, kecepatanMaks, jenisMesin);     // Memanggil constructor dari kelas induk
        this.jumlahPintu = jumlahPintu;
    }
    
    // Method untuk menampilkan informasi mobil
    public void tampilkanInfoMobil() {
        // Dapat mengakses kecepatanMaks karena protected
        System.out.println("Kecepatan Maksimum Mobil: " + kecepatanMaks + " km/h");
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }
    
    //  Method untuk menampilkan informasi lengkap (ditambahin)
    public void tampilkanInfoLengkap() {
        super.tampilkanInfoKendaraan2();
        System.out.println("Jumlah pintu mobil: " + jumlahPintu);
    }
}

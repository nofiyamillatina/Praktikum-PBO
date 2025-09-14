/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPraktikum4;

/**
 *
 * @author lenovo
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek pekerja
        Pekerja p1 = new Pekerja("Sarah", 22, "Dokter", 7000000);
        
        // Menampilkan info dengan toString()
        System.out.println("--- Informasi Pekerja ---");
        System.out.println(p1.toString());
        
        // Mengubah nama pekerja dengan setter
        p1.setNama("Ayu");
        System.out.println("--- Informasi Baru Pekerja ---");
        System.out.println(p1.toString());
    }
}

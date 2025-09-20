/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author lenovo
 */
// Main class
public class Main {
    public static void main(String[] args) {
        // Membuat Objek Mobil
        Mobil mobil = new Mobil("Toyota", 160, 4);
        System.out.println("--- Jenis Mobil ---");
        mobil.tampilkanInfo();
        mobil.tampilkanInfoMobil();
        
        System.out.println();
        
        // Membuat Objek Sepeda Motor
        SepedaMotor motor = new SepedaMotor("Beat", 100, "SOHC");
        System.out.println("--- Jenis Sepeda Motor ---");
        motor.tampilkanInfo();                
    }
}

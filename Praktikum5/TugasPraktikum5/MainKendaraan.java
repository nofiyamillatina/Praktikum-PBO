/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPraktikum5;

/**
 *
 * @author lenovo
 */
public class MainKendaraan {
    public static void main(String[] args) {
        Mobil1 mobil = new Mobil1 ("Toyota", 4, 4);
        System.out.println("--- Informasi Mobil ---");
        mobil.tampilkanInfo();
        
        System.out.println();
        
        SepedaMotor1 motor = new SepedaMotor1("Beat", 2, "SOHC");
        System.out.println("--- Informasi Motor ---");
        motor.tampilkanInfo();
    }
}

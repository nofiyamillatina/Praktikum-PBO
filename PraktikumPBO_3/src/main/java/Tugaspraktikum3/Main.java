/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugaspraktikum3;

/**
 *
 * @author lenovo
 */
public class Main {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Toyota", "Avanza", 2020, "Abu-abu");
        Mobil mobil2 = new Mobil("Honda", "Civic", 2022, "Putih");

        mobil1.displayInfo();
        mobil2.displayInfo();
        
        mobil1.startEngine();
        mobil2.startEngine();
        
        mobil1.ubahWarna("Hitam");
        mobil1.displayInfo();
    }
}

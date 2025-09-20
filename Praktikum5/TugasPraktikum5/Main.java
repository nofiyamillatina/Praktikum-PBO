/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPraktikum5;

/**
 *
 * @author lenovo
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek kucing
        Kucing kucing = new Kucing("Cici");
        System.out.println("--- Informasi Hewan Kucing ---");
        kucing.tampilkanInfo();
        
        System.out.println();
        
        // Membuat objek Anjing
        Anjing anjing = new Anjing("Ciko");
        System.out.println("--- Informasi Hewan Anjing ---");
        anjing.tampilkanInfo();
    }
}

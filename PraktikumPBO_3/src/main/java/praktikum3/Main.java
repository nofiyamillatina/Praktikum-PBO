/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

/**
 *
 * @author lenovo
 */
public class Main {
    public static void main(String[] args) {
        Hewan kucing = new Hewan("Milo", 1);
        kucing.suara();
        kucing.info();
        
        Hewan anjing = new Hewan("Chiki", 2);
        anjing.info();
        anjing.berlari();
    }
}

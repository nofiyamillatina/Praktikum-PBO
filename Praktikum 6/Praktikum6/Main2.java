/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum6;

/**
 *
 * @author lenovo
 */
public class Main2 {
 public static void main(String[] args) {
 Hewan hewan = new Kucing();
 hewan.bersuara(); 
 
 Kucing kucing = new Kucing();
 kucing.makan(" ikan"); 
 kucing.makan(" ikan", 2); 
 
 Anjing anjing = new Anjing();
 anjing.bersuara(); 
 anjing.makan(" daging", 3); 
 }
}

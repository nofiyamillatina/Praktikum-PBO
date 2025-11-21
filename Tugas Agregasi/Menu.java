/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPBOTeori;

/**
 *
 * @author lenovo
 */
class Menu {
    private String nama;
    private double harga;

    public Menu(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

   public void infoMenu() {
       System.out.println(" " + nama + "Rp " + harga);
   }
   
   public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }
}

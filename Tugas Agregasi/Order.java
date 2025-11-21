/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPBOTeori;

/**
 *
 * @author lenovo
 */
class Order {
    private Menu menu;    // agregasi
    private Chef chef;   // agregasi
    private int jumlah;

    public Order(Menu menu, Chef chef, int jumlah) {
        this.menu = menu;
        this.chef = chef;
        this.jumlah = jumlah;
    }

    public void infoOrder() {
        System.out.println("Order:");
        System.out.println("- Menu: " + menu.getNama());
        System.out.println("- Chef: " + chef.getNama());
        System.out.println("- Jumlah: " + jumlah);
    }
}

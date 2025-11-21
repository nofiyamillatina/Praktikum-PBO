/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPBOTeori;

/**
 *
 * @author lenovo
 */
public class main {
    public static void main(String[] args) {

        Restoran resto = new Restoran();

        // Komposisi 
        Menu menu1 = new Menu("Nasi Goreng", 25000);
        Menu menu2 = new Menu("Ayam Bakar", 30000);
        resto.tambahMenu(menu1);
        resto.tambahMenu(menu2);

        Chef chef1 = new Chef("Juna");
        Chef chef2 = new Chef("Anton");
        resto.tambahChef(chef1);
        resto.tambahChef(chef2);

        resto.infoRestoran();
        
        System.out.println(" \n--- Orderan Pelanggan ---");
        
        // Agregasi
        Order order1 = new Order(menu1, chef2, 3);
        order1.infoOrder();
    }    
}

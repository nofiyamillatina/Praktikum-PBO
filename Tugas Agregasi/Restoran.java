/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPBOTeori;

/**
 *
 * @author lenovo
 */
import java.util.ArrayList;
import java.util.List;

class Restoran {
    private List<Menu> daftarmenu;
    private List<Chef> daftarchef;

    public Restoran() {
        this.daftarmenu = new ArrayList<>();
        this.daftarchef = new ArrayList<>();
    }

    public void tambahMenu(Menu menu) {
        daftarmenu.add(menu);
    }

    public void tambahChef(Chef chef) {
        daftarchef.add(chef);
    }
    
    public void infoRestoran() {
        System.out.println("--- Daftar Menu Restoran ---");
        for (Menu menu : daftarmenu) {
            menu.infoMenu();
        }
        
        System.out.println("\n--- Daftar Chef ---");
        for (Chef chef : daftarchef) {
            chef.infoChef();
        }
    }
}


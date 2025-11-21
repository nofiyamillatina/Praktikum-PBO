/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPBOTeori;

/**
 *
 * @author lenovo
 */
class Chef {
    private String nama;

    public Chef(String nama) {
        this.nama = nama;
    }

    public void infoChef() {
        System.out.println("Pemasak: " + nama);
    }
    
    public String getNama() {
        return nama;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemManajemenProdukdanPegawai;

/**
 *
 * @author lenovo
 */
public class MainPegawai {
    public static void main(String[] args) {
        Pegawai pegawai1 = new PegawaiTetap("Fiya", 6000000, 1000000);
        Pegawai pegawai2 = new PegawaiKontrak("Caca", 3000000, 3);
        
        pegawai1.tampilkanInfo();
        System.out.println();
        pegawai2.tampilkanInfo();
    }
}


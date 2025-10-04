/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemManajemenProdukdanPegawai;

/**
 *
 * @author lenovo
 */
class Produk {
    private String namaProduk;
    private int harga;
    
    // Constructor
    public Produk (String namaProduk, int harga) {
        this.namaProduk = namaProduk;
        this.harga = harga;
    }
    
    // Method TampilkanInfo
    public void tampilkanInfo() {
        System.out.println("Nama Produk: " + namaProduk);
        System.out.println("Harga Produk: " + harga);
    }
    
    // Getter dan Setter untuk namaProduk
    public String getnamaProduk() {
        return namaProduk;
    }
    public void setnamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }
    
    // Getter dan Setter untuk harga
    public int getharga() {
        return harga;
    }
    public void setharga(int harga) {
        this.harga = harga;
    }
}


// Subclass Elektronik
class Elektronik extends Produk {
    public int garansi;     // Dalam tahun
    
    public Elektronik (String namaProduk, int harga, int garansi) {
        super(namaProduk, harga);
        this.garansi = garansi;
    }
    
    // Getter dan Setter untuk garansi
    public int getgaransi() {
        return garansi;
    }
    public void setgaransi(int garansi) {
        this.garansi = garansi;
    }
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Garansi: " + garansi + " tahun");
    }
}

//Subclass Makanan
class Makanan extends Produk {
    public String tanggalkadaluarsa;
    
    public Makanan (String namaProduk, int harga, String tanggalkadaluarsa) {
        super(namaProduk, harga);
        this.tanggalkadaluarsa = tanggalkadaluarsa;
    }
    
    // Getter dan Setter untuk kadaluarsa
    public String gettanggalkadaluarsa() {
        return tanggalkadaluarsa;
    }
    public void settanggalkadaluarsa(String tanggalkadaluarsa) {
        this.tanggalkadaluarsa = tanggalkadaluarsa;
    }
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Tanggal kadaluarsa: " + tanggalkadaluarsa);
    }
}
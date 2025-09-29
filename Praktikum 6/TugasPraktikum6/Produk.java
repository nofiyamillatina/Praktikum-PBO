/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPraktikum6;

/**
 *
 * @author lenovo
 */
public abstract class Produk {
    protected String nama;
    protected double harga;
    
    public Produk(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }
    
    // Method abstrak untuk menghitung diskon
    public abstract double hitungDiskon ();
    
    // Method untuk menghitung harga setelah diskon
    public double getHargaSetelahDiskon() {
        return harga - hitungDiskon();
    }
    
    public String getNama() {
        return nama;
    }
    public double getHarga() {
        return harga;
    }
}


// Subclass Buku
class Buku extends Produk {
    public Buku(String nama, double harga) {
        super(nama, harga);
    }
    
    @Override
    public double hitungDiskon() {
        return harga * 0.05;
    }
}

// Subclass Elektronik
class Elektronik extends Produk {
    public Elektronik(String nama, double harga) {
        super(nama, harga);
    }
    
    @Override
    public double hitungDiskon() {
        return harga * 0.25;
    }
}

// Subclass pakaian
class Pakaian extends Produk {
    public Pakaian(String nama, double harga) {
        super(nama, harga);
    }
    
    @Override
    public double hitungDiskon() {
        return harga * 0.15;
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemManajemenProdukdanPegawai;

/**
 *
 * @author lenovo
 */
class Pegawai {
    private String namaPegawai;
    private int gaji;
    
    public Pegawai(String namaPegawai, int gaji) {
        this.namaPegawai = namaPegawai;
        this.gaji = gaji;
    }
    
    // Method tampilkanInfo
    public void tampilkanInfo() {
        System.out.println("Nama Pegawai: " + namaPegawai);
        System.out.println("Jumlah Gaji: " + gaji);
    }
    
    // Getter dan Setter namaPegawai
    public String getnamaPegawai() {
        return namaPegawai;
    }
    public void setnamaPegawai(String namaPegawai) {
        this.namaPegawai = namaPegawai;
    }
    
    // Getter dan Setter untuk gaji
    public int getgaji () {
        return gaji;
    }
    public void setgaji(int gaji) {
        this.gaji =  gaji;
    }
}

// Subclass PegawaiTetap
class PegawaiTetap extends Pegawai {
    public int tunjangan;
    
    public PegawaiTetap(String namaPegawai, int gaji, int tunjangan) {
        super(namaPegawai, gaji);
        this.tunjangan = tunjangan;
    }
    
    // Getter dan Setter untuk tunjangan
    public int gettunjangan() {
        return tunjangan;
    }
    public void settunjangan(int tunjangan) {
        this.tunjangan = tunjangan;
    }
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah Tunjangan: " + tunjangan);
    }
}

// Subclass PegawaiKontrak 
class PegawaiKontrak extends Pegawai {
    public int lamaKontrak;     // Dalam bulan 
    
    public PegawaiKontrak(String namaPegawai, int gaji, int lamaKontrak) {
        super(namaPegawai, gaji);
        this.lamaKontrak = lamaKontrak;
    }
    
    // Getter dan Setter untuk lamaKontrak
    public int getlamaKontrak() {
        return lamaKontrak;
    }
    public void setlamaKontrak(int lamaKontrak) {
        this.lamaKontrak = lamaKontrak;
    }
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Lama Kontrak: " + lamaKontrak + " bulan");
    }
}
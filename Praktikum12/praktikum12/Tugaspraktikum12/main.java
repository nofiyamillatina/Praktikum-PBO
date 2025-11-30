/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugaspraktikum12;

/**
 *
 * @author lenovo
 */
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    static Scanner input = new Scanner(System.in);
    static final String FILE_TEXT = "buku.txt";
    static final String FILE_SER = "buku.ser";

    public static void main(String[] args) {
        int pilihan;

        do {
            System.out.println("\n=== MENU SISTEM MANAJEMEN BUKU ===");
            System.out.println("1. Tambah Buku (Simpan ke buku.txt)");
            System.out.println("2. Simpan Buku ke buku.ser (Serialisasi)");
            System.out.println("3. Tampilkan Buku dari buku.txt");
            System.out.println("4. Tampilkan Buku dari buku.ser");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine(); 

            switch (pilihan) {
                case 1:
                    tambahBukuTxt();
                    break;
                case 2:
                    simpanBukuSerialisasi();
                    break;
                case 3:
                    bacaBukuTxt();
                    break;
                case 4:
                    bacaBukuSerialisasi();
                    break;
                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Menu tidak valid!");
            }
        } while (pilihan != 0);
    }

    // 1. Tambah Buku ke File TXT
    static void tambahBukuTxt() {
        try (FileWriter fw = new FileWriter(FILE_TEXT, true);
             BufferedWriter bw = new BufferedWriter(fw)) {

            System.out.print("Judul: ");
            String judul = input.nextLine();
            System.out.print("Pengarang: ");
            String pengarang = input.nextLine();
            System.out.print("Tahun Terbit: ");
            int tahun = input.nextInt();
            input.nextLine();

            bw.write(judul + ";" + pengarang + ";" + tahun);
            bw.newLine();

            System.out.println("Buku berhasil disimpan ke buku.txt");

        } catch (IOException e) {
            System.out.println("Gagal menyimpan buku!");
        }
    }

    // 2. Simpan Objek Buku ke File SER
    static void simpanBukuSerialisasi() {
        ArrayList<Buku> daftarBuku = new ArrayList<>();

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_SER))) {
            daftarBuku = (ArrayList<Buku>) ois.readObject();
        } catch (Exception e) {
            // Jika file belum ada, biarkan kosong
        }

        System.out.print("Judul: ");
        String judul = input.nextLine();
        System.out.print("Pengarang: ");
        String pengarang = input.nextLine();
        System.out.print("Tahun Terbit: ");
        int tahun = input.nextInt();

        Buku buku = new Buku(judul, pengarang, tahun);
        daftarBuku.add(buku);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_SER))) {
            oos.writeObject(daftarBuku);
            System.out.println("Buku berhasil diserialisasi ke buku.ser");
        } catch (IOException e) {
            System.out.println("Gagal serialisasi!");
        }
    }

    // 3. Baca Buku dari TXT
    static void bacaBukuTxt() {
        System.out.println("\nDaftar Buku dari buku.txt:");

        try (BufferedReader br = new BufferedReader(new FileReader(FILE_TEXT))) {
            String baris;

            while ((baris = br.readLine()) != null) {
                String[] data = baris.split(";");
                System.out.println("Judul: " + data[0] +
                        ", Pengarang: " + data[1] +
                        ", Tahun: " + data[2]);
            }

        } catch (IOException e) {
            System.out.println("File tidak ditemukan atau kosong!");
        }
    }

    // 4. Baca Buku dari Serialisasi
    static void bacaBukuSerialisasi() {
        System.out.println("\nDaftar Buku dari buku.ser:");

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_SER))) {
            ArrayList<Buku> daftarBuku = (ArrayList<Buku>) ois.readObject();

            for (Buku b : daftarBuku) {
                System.out.println(b);
            }

        } catch (Exception e) {
            System.out.println("File serialisasi belum ada atau kosong!");
        }
    }
}


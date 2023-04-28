package com.MuhammadHusni.PBO.pertemuan3;

import java.util.Arrays;
public class Main_Unguided1 {
    public static void main(String[] args) {
        System.out.println("Nama   : Muhammad Husni");
        System.out.println("Nim    : 21102227");
        System.out.println();

        System.out.println("===== KOPERASI HUSNI =====");
        Unguided1 BukuTulis = new Unguided1("Buku Tulis", 2000, 20);
        Unguided1 Pensil = new Unguided1("Pensil", 3000, 10);

            BukuTulis.HargaSatuan = 5000;
            BukuTulis.JumlahBarang = 10;
            BukuTulis.TotalHarga = (BukuTulis.getHargaSatuan() * BukuTulis.getJumlahBarang());
            Pensil.HargaSatuan = 3000;
            Pensil.JumlahBarang = 20;
            Pensil.TotalHarga = (Pensil.getHargaSatuan() * Pensil.getJumlahBarang());

            BukuTulis.showInfo();
            Pensil.showInfo();
            System.out.println("=================================");
            System.out.println(("Total Harga Semua Barang : "
                    + (Pensil.getHargaSatuan() * Pensil.getJumlahBarang() +
                      (BukuTulis.getHargaSatuan() * BukuTulis.getJumlahBarang()))));
            System.out.println("=================================");
    }
}

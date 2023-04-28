package com.MuhammadHusni.PBO.pertemuan3;

public class Unguided2 {
    // Atribut
    int No_Buku;
    String judul_Buku;
    String pengarang;
    int Tahun_Terbit;
    int Harga;

    public int getNo_Buku() {
        return No_Buku;
    }

    public void setNo_Buku(int no_Buku) {
        No_Buku = no_Buku;
    }

    public String getJudul_Buku() {
        return judul_Buku;
    }

    public void setJudul_Buku(String judul_Buku) {
        this.judul_Buku = judul_Buku;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public int getTahun_Terbit() {
        return Tahun_Terbit;
    }

    public void setTahun_Terbit(int tahun_Terbit) {
        Tahun_Terbit = tahun_Terbit;
    }

    public int getHarga() {
        return Harga;
    }

    public void setHarga(int harga) {
        Harga = harga;
    }

    public void  showInfo() {
        System.out.println("No Buku      : " + No_Buku);
        System.out.println("Judul Buku   : " + judul_Buku);
        System.out.println("Pengarang    : " + pengarang);
        System.out.println("Tahun Terbit : " + Tahun_Terbit);
        System.out.println("Harga        : " + Harga);
        System.out.println();
    }
    public void beli (int beli) {
    }
    public void bayar (int bayar) {
    }
}

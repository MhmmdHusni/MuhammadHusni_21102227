package com.MuhammadHusni.PBO.pertemuan3;

public class SepedaMotor {
    //atribut
    private String merek;
    private String tipe;
    private int harga;

    //constructor
    public SepedaMotor() {}

    //Constructor ber parameter
    public SepedaMotor(String merek, String tipe, int harga) {
        this.merek = merek;
        this.tipe = tipe;
        this.harga = harga;
    }

    //method
    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    public void showInfo() {
        System.out.println("Merek : " + merek);
        System.out.println("tipe : " + tipe);
        System.out.println("Harga : " + harga);
        System.out.println();
    }
}


//
//    String merk;
//    String tipe;
//    int harga;
//
//
//    public SepedaMotor() {
//    }
//
//    public void showInfo() {
//        System.out.println("Merk : " + merk);
//        System.out.println("Tipe : " + tipe);
//        System.out.println("Harga : " + harga);
//        System.out.println();
//    }
//    //constructor
////    public SepedaMotor() {}
//
//    //Constructor ber parameter
//    public SepedaMotor(String merk, String tipe, int harga) {
//        this.merk = merk;
//        this.tipe = tipe;
//        this.harga = harga;
//    }
//}
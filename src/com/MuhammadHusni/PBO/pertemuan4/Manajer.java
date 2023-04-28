package com.MuhammadHusni.PBO.pertemuan4;

public class Manajer extends Pegawai{

    public void bonus(int bonus) {
        System.out.println("Pegawai dengan nama : " + nama + " Dengan NIP : " + nip + " Mendapatkan Bonus : " + bonus);
    }

    public void extrainfo(){
        System.out.println("Jabatan Pegawai Manager");
    }
    public void bonus(){
        System.out.println("Harap masukkan jumlah bonusnya.");
    }
}

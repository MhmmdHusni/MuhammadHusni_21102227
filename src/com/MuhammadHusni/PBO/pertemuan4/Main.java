package com.MuhammadHusni.PBO.pertemuan4;

public class Main {
    public static void main(String[] args) {
        Manajer Manajer = new Manajer();
        Pegawai Pegawai = new Pegawai();

        Manajer.nip = 181910024;
        Manajer.nama = "Basuki";

        Pegawai.nip = 191220032;
        Pegawai.nama = "Ahmad";

        Manajer.showInfo();
        Manajer.extrainfo();
        Manajer.bonus(10000);
        Manajer.bonus();

        Pegawai.showInfo();
        Pegawai.extraInfo();
    }
}

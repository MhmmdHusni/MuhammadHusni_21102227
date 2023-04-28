package com.MuhammadHusni.PBO.pertemuan3;

public class Main {
    public static void main(String[] args) {

        //Uji coba getter & setter
        SepedaMotor vespa = new SepedaMotor("Vespa", "Vespa matic", 40000000);

        // Sebelum perubahan
        System.out.println(
                "Motor Merek : " + vespa.getMerek() + "Dengan tipe ( before ) : " + vespa.getTipe()
        );

        // Melakukan proses perubahan tipe motor
        vespa.setTipe("Sprint");

        // Lihat hasil perubahan
        System.out.println(
                "Motor Merek : " + vespa.getMerek() + "Dengan tipe ( after ) : " + vespa.getTipe()
        );
        vespa.showInfo();
    }
}





//    // Pembuatan class
//    SepedaMotor suzuki = new SepedaMotor("Suzuki", "GSX 150R", 20000000);
//    SepedaMotor yamaha = new SepedaMotor("Yamaha", "YZF R15", 25000000);
//    SepedaMotor honda = new SepedaMotor("Honda", "CBR 150R", 23500000);
//
//// Menjalankan method showInfo
//        suzuki.showInfo();
//                yamaha.showInfo();
//                honda.showInfo();
//
////
//        // Pembuatan class
//        SepedaMotor suzuki = new SepedaMotor();
//        SepedaMotor yamaha = new SepedaMotor();
//        SepedaMotor honda = new SepedaMotor();
//
//        // Mengisi nilai atribut object suzuki
//        suzuki.merk = "Suzuki";
//        suzuki.tipe = "GSX 150R";
//        suzuki.harga = 20000000;
//
//        // Mengisi nilai atribut object yamaha
//        yamaha.merk = "Yamaha";
//        yamaha.tipe = "YZF R15";
//        yamaha.harga = 25000000;
//
//        // Mengisi nilai atribut object honda
//        honda.merk = "Honda";
//        honda.tipe = "CBR 150R";
//        honda.harga = 23500000;
//
//        // Menjalankan method showInfo
//        suzuki.showInfo();
//        yamaha.showInfo();
//        honda.showInfo();
//    }
//}






//
//        SepedaMotor vespa = new SepedaMotor("Vespa", "Vespa matic", 40000000);
//
//        // Sebelum perubahan
//        System.out.println(
//                "Motor Merek : " + vespa.getMerek() + "Dengan tipe ( before ) : " + vespa.getTipe()
//        );
//
//        // Melakukan proses perubahan tipe motor
//        vespa.setTipe("Sprint");
//
//        // Lihat hasil perubahan
//        System.out.println(
//                "Motor Merek : " + vespa.getMerek() + "Dengan tipe ( after ) : " + vespa.getTipe()
//        );

//        vespa.showInfo();
//    }
//}

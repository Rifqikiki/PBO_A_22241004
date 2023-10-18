package com.tutorial;

// class tanpa konstruktor
class polos {
    String datastring;
    int datainteger;
}

// class dengan konstruktor
class Mahasiswa {
    String nama;
    String nim;
    String prodi;

    // membuat konstruktor tanpa para meter
    // Mahasiswa() {
    //   system.out.println("ini adalah konstruktor");
    // }

    //  membuat konstruktor dengan para meter
    Mahasiswa (String inputnama, String inputnim, String inputprodi){
         nama = inputnama;
         nim = inputnim;
         prodi = inputprodi;

         System.out.println("Nama :" + nama);
         System.out.println("Nim :" + nim);
         System.out.println("Prodi :" + prodi);
    }
}

public class Main {
    public static void main (String args[]) {
        // instasiansi objek dari class polos
        polos pls = new polos();

        // isi ciri pada objek pls
        pls.datastring = "polos";
        pls.datainteger = 10;

        // cetak data 
        System.out.println("isi data string :" + pls.datastring);
        System.out.println("isi data integer :" + pls.datainteger);
    }

    Mahasiswa mhs1 = new Mahasiswa("ler", "888888", "PTI");
}
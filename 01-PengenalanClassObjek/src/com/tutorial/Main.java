package com.tutorial;

class mahasiswa {
    String Nama;
    String Nim;
    String prodi;
}

public class Main {
    public static void main(String[] args) {
        // pembuatan objek
        mahasiswa mhs1 = new mahasiswa();

        // objek mhs1 atribut
        mhs1.Nama = "udil";
        mhs1.Nim = "222222";
        mhs1.prodi = "anti judol";

        System.out.println("nama mahasiswa :" + mhs1.Nama);
        System.out.println("nim :" + mhs1.Nim);
        System.out.println("program studi :" + mhs1.prodi);

        // objek ke 2
        mahasiswa mhs2 = new mahasiswa();

        // objek atribut 2
        mhs2.Nama = "marsha ler";
        mhs2.Nim = "111111";
        mhs2.prodi = "promotor judol";

        System.out.println("nama mahasiswa :" + mhs2.Nama);
        System.out.println("nim :" + mhs2.Nim);
        System.out.println("program studi :" + mhs2.prodi);
    }
}

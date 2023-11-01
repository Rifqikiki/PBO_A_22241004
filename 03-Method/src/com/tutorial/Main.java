package com.tutorial;

class mahasiswa {
    // Data Member
    String nama;
    String nim;
    String prodi;

    // Consturktor dengan parameter
    mahasiswa(String nama, String nim, String prodi) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
    }

    // Method tanpa parameter dan tanpa return
    void show() {
        System.out.println("nama : " + this.nama);
        System.out.println("nim : " + this.nim);
        System.out.println("prodi : " + this.prodi);
    }

    // Method tanpa return dengan parameter
    void setnama(String nama) {
        this.nama = nama;
    }

    // Method dengan return tanpa parameter
    String getnama() {
        return this.nama;
    }

    // Method dengan return dan parameter
    String sayHi(String pesan) {
        return pesan + "Aku bisa menjadi" + this.nama;
    }
}

public class Main {
    public static void main(String[] args) {
        // Instasiasi objek
        mahasiswa mhs1 = new mahasiswa("alek", "30303030", "PTI");

        mhs1.show();
        mhs1.setnama("jamet");
        mhs1.show();
        System.out.println(mhs1.getnama());

        String pesan = mhs1.sayHi("hi");
        System.out.println(pesan);
    }

}

package com.tutorial;

class Pegawai {
    private String nama;
    private String jabatan;
    private double pajak = 0.1; // pajak 10%
    private double gajiPokok;
    private double gajiBersih;

    // Konstruktor
    public Pegawai(String nama, String jabatan, double gajiPokok) {
        this.nama = nama;
        this.jabatan = jabatan;
        this.gajiPokok = gajiPokok;
    }

    // setter

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public double hitungGajiBersih() {
        gajiBersih = gajiPokok - (gajiPokok * pajak);
        return gajiBersih;
    }

    public double getGajiBersih() {
        return gajiBersih;
    }
}

public class Main {
    public static void main(String[] args) {
        Pegawai pegawai = new Pegawai("Marselina", "Dosen", 3500000);

        double gajiBersih = pegawai.hitungGajiBersih();

        System.out.println("Nama: " + pegawai.getNama());
        System.out.println("Jabatan: " + pegawai.getJabatan());
        System.out.println("Gaji Bersih: Rp." + gajiBersih);
    }
}

package com.tutorial;

class pelanggan {
    private String nama;
    private boolean memilikimember;
    private double totalbelanja;
    private final double potonganbelanja;

    public pelanggan(String nama, boolean memilikimember, double totalbelanja) {
        this.nama = nama;
        this.memilikimember = memilikimember;
        this.totalbelanja = totalbelanja;
        this.potonganbelanja = hitungpotongan();
    }

    private double hitungpotongan() {
        if (memilikimember) {
            if (totalbelanja >= 100000 && totalbelanja < 499999) {
                return 0.05;
            } else if (totalbelanja >= 500000) {
                return 0.1;
            } else {
                return 0.03;
            }
        } else {
            if (totalbelanja >= 100000) {
                return 0.03;
            } else {
                return 0;
            }
        }
    }

    public void cetak() {
        double diskonrupiah = totalbelanja * potonganbelanja;
        double totalbelanjasetelahpotongan = totalbelanja - diskonrupiah;
        System.out.println("nama pelanggan" + nama);
        System.out.println("kepemilikan member" + (memilikimember ? "YA" : "TIDAK"));
        System.out.println("total belanja sebelum potongan: RP" + totalbelanja);
        System.out.println("Diskon (%): RP" + (potonganbelanja * 100));
        System.out.println("Diskon (dalam rupiah): RP" + diskonrupiah);
        System.out.println("total belanja setelah potongan: RP" + totalbelanjasetelahpotongan);
    }
}

public class Main {
    public static void main(String[] args) {
        pelanggan pelanggan1 = new pelanggan("setyo", false, 500000);
        pelanggan1.cetak();
        pelanggan pelanggan2 = new pelanggan("novanto", true, 500000);
        pelanggan2.cetak();
        pelanggan pelanggan3 = new pelanggan("sumi", false, 400000);
        pelanggan3.cetak();
        pelanggan pelanggan4 = new pelanggan("ati", true, 400000);
        pelanggan4.cetak();
    }
}

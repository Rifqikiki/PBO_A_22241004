package com.tutorial;

// superclass

class Bangundatar {
    public float hitungluas() {
        return 0.0f;
    }

    public float hitungkeliling() {
        return 0.0f;
    }
}

// subclass persegi
class persegi extends Bangundatar {
    private float sisi;

    public persegi(float sisi) {
        this.sisi = sisi;
    }

    @Override
    public float hitungluas() {
        return sisi * sisi;
    }

    @Override
    public float hitungkeliling() {
        return 4 * sisi;
    }

    public void display() {
        System.out.println("persegi dengan sisi" + sisi);
    }
}

// subclass lingkaran
class lingkaran extends Bangundatar {
    private float jarijari;
    private final float PI = 3.14f;

    /**
     * 
     */
    public lingkaran(float jarijari) {
        this.jarijari = jarijari;
    }

    @Override
    public float hitungluas() {
        return PI * jarijari * jarijari;
    }

    @Override
    public float hitungkeliling() {
        return 2 * PI * jarijari;
    }

    public void display() {
        System.out.println("lingkaran dengan jarijari" + jarijari);
    }

}

// subclass persegi panjang
class persegipanjang extends Bangundatar {
    private float panjang;
    private float lebar;

    public persegipanjang(float panjang, float lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public float hitungluas() {
        return panjang * lebar;
    }

    @Override
    public float hitungkeliling() {
        return 2 * (panjang + lebar);
    }

    public void display() {
        System.out.println("persegi panjang dengan panjang:" + panjang + "dan lebar:" + lebar);
    }
}

// subclass
class segitiga extends Bangundatar {
    private float alas;
    private float tinggi;
    private float sisi1;
    private float sisi2;
    private float sisi3;

    public segitiga(float alas, float tinggi, float sisi1, float sisi2, float sisi3) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
    }

    @Override
    public float hitungluas() {
        return 0.5f * alas * tinggi;
    }

    @Override
    public float hitungkeliling() {
        return sisi1 + sisi2 + sisi3;
    }

    public void display() {
        System.out.println("segitiga dengan alas:" + alas + ",tinggi:" + tinggi + ",dan panjang sisi-sisi:" + sisi1
                + "," + sisi2 + "," + sisi3);
    }
}

public class Main {
    public static void main(String[] args) {
        // persegi
        persegi persegi = new persegi(7.0f);
        persegi.display();
        System.out.println("luas persegi:" + persegi.hitungluas());
        System.out.println("keliling persegi:" + persegi.hitungkeliling());

        // lingkaran
        lingkaran lingkaran = new lingkaran(9.0f);
        lingkaran.display();
        System.out.println("luas lingkaran:" + lingkaran.hitungluas());
        System.out.println("keliling lingkaran:" + lingkaran.hitungkeliling());

        // persegi panjang
        persegipanjang persegipanjang = new persegipanjang(6.0f, 8.0f);
        persegipanjang.display();
        System.out.println("luas persegi panjang:" + persegipanjang.hitungluas());
        System.out.println("keliling persegi panjang:" + persegipanjang.hitungkeliling());

        // segitiga
        segitiga segitiga = new segitiga(2.0f, 4.0f, 6.0f, 8.0f, 5.0f);
        segitiga.display();
        System.out.println("luas segitiga:" + segitiga.hitungluas());
        System.out.println("keliling segitiga:" + segitiga.hitungkeliling());
    }
}

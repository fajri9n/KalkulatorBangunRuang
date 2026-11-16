package com.mycompany.kalkulatorbangunruang;

class Kubus {
    double sisi;

    Kubus(double sisi) {
        this.sisi = sisi;
    }

    double hitungVolume() {
        return Math.pow(sisi, 3);
    }

    double hitungLuasPermukaan() {
        return 6 * Math.pow(sisi, 2);
    }

    void tampilkanHasil() {
        System.out.printf("[Kubus]  Sisi: %.1f | Volume: %.2f | Luas Permukaan: %.2f\n",
                sisi, hitungVolume(), hitungLuasPermukaan());
    }
}

class Balok {
    double panjang, lebar, tinggi;

    Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    double hitungVolume() {
        return panjang * lebar * tinggi;
    }

    double hitungLuasPermukaan() {
        return 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
    }

    void tampilkanHasil() {
        System.out.printf("[Balok]  Ukuran: %.1fx%.1fx%.1f | Volume: %.2f | Luas Permukaan: %.2f\n",
                panjang, lebar, tinggi, hitungVolume(), hitungLuasPermukaan());
    }
}

class Tabung {
    double jariJari, tinggi;

    Tabung(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    double hitungVolume() {
        return Math.PI * Math.pow(jariJari, 2) * tinggi;
    }

    double hitungLuasPermukaan() {
        return 2 * Math.PI * jariJari * (jariJari + tinggi);
    }

    void tampilkanHasil() {
        System.out.printf("[Tabung] r: %.1f, t: %.1f | Volume: %.2f | Luas Permukaan: %.2f\n",
                jariJari, tinggi, hitungVolume(), hitungLuasPermukaan());
    }
}

class Bola {
    double jariJari;

    Bola(double jariJari) {
        this.jariJari = jariJari;
    }

    double hitungVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(jariJari, 3);
    }

    double hitungLuasPermukaan() {
        return 4 * Math.PI * Math.pow(jariJari, 2);
    }

    void tampilkanHasil() {
        System.out.printf("[Bola]   r: %.1f | Volume: %.2f | Luas Permukaan: %.2f\n",
                jariJari, hitungVolume(), hitungLuasPermukaan());
    }
}
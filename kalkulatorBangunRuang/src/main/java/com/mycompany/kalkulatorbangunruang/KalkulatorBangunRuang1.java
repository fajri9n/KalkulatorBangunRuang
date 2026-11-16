package com.mycompany.kalkulatorbangunruang;

import java.util.Scanner;

public class KalkulatorBangunRuang1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // TAHAP 1: KUBUS
        System.out.println("=== 1. KUBUS ===");
        System.out.print("Masukkan sisi: ");
        Kubus kubus1 = new Kubus(input.nextDouble());
        kubus1.tampilkanHasil();

        System.out.print("Tekan ENTER untuk lanjut ke Balok...");
        input.nextLine(); // Membersihkan sisa tombol Enter dari input angka
        input.nextLine(); // Menunggu user menekan Enter

        // TAHAP 2: BALOK
        System.out.println("\n=== 2. BALOK ===");
        System.out.print("Masukkan panjang: ");
        double p = input.nextDouble();
        System.out.print("Masukkan lebar: ");
        double l = input.nextDouble();
        System.out.print("Masukkan tinggi: ");
        double tBalok = input.nextDouble();
        Balok balok1 = new Balok(p, l, tBalok);
        balok1.tampilkanHasil();

        System.out.print("Tekan ENTER untuk lanjut ke Tabung...");
        input.nextLine();
        input.nextLine();

        // TAHAP 3: TABUNG
        System.out.println("\n=== 3. TABUNG ===");
        System.out.print("Masukkan jari-jari: ");
        double rTabung = input.nextDouble();
        System.out.print("Masukkan tinggi: ");
        double tTabung = input.nextDouble();
        Tabung tabung1 = new Tabung(rTabung, tTabung);
        tabung1.tampilkanHasil();

        System.out.print("Tekan ENTER untuk lanjut ke Bola...");
        input.nextLine();
        input.nextLine();

        // TAHAP 4: BOLA
        System.out.println("\n=== 4. BOLA ===");
        System.out.print("Masukkan jari-jari: ");
        Bola bola1 = new Bola(input.nextDouble());
        bola1.tampilkanHasil();

        System.out.println("Semua perhitungan selesai!");
        input.close();
    }
}
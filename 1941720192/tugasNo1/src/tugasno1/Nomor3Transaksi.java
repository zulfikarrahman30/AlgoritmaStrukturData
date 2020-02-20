/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasno1;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Nomor3Transaksi {
    static Scanner izul = new Scanner(System.in);

    public static void main(String[] args) {
        Nomor3Transaksi transaksi = new Nomor3Transaksi();
        int totalHarga = transaksi.hargaTotal();
        int bayar = transaksi.hitungDiskon(totalHarga);
        transaksi.hitungHargaBayar(bayar);
    }

    public String PS5;
    public int hargaSatuan = 50000;
    public int jumlah, total;

    public int hargaTotal() {
        System.out.print("Masukkan jumlah pembelian: ");
        jumlah = izul.nextInt();
        int total = jumlah * hargaSatuan;
        return total;
    }

    public int hitungDiskon(int total) {
        int bayar = 0;
        if (total > 100000) {
            System.out.println("Anda mendapatkan diskon 10 persen");
            bayar = total * 90 / 100;
        } else if (total > 50000) {
            System.out.println("Anda mendapatkan diskon sebesar 5%");
            bayar = total * 95 / 100;
        } else {
            System.out.println("Maaf, Anda tidak mendapatkan diskon");
        }
        return bayar;
    }

    public void hitungHargaBayar(int bayar) {
        System.out.println("Anda harus membayar uang sejumlah: " + bayar);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan2;

/**
 *
 * @author USER
 */
public class BarangMain {
    public static void main(String[] args) {
        barang b1 = new barang();
        b1.namaBarang = "Corsair 2 GB";
        b1.jenisBarang = "DDR";
        b1.hargaSatuan = 250000;
        b1.stok = 10;
        b1.tambahStok(1);
        b1.kurangiStok(3);
        b1.tampilBarang();
        int hargaTotal = b1.hitungHargatotal(4);
        System.out.println("Harga 4 buah = "+hargaTotal);
        
        barang b2 = new barang("Logitech","Wireless Mouse", 150000, 25);
        b2.tampilBarang();
        
        barang b3 = new barang("SteelSeries","Gamming mouse", 500000, 20);
        b3.tampilBarang();
    }
}

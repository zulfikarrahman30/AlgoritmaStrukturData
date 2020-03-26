
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class PendudukMain {
     public static void main(String[] args) {
        Scanner izul = new Scanner(System.in);
        Scanner fikar = new Scanner(System.in);
        
        System.out.println("Pencarian Data Penduduk Berdasarkan NIK Penduduk");
        System.out.println("===========================================================");
        System.out.print("Jumlah data : ");
        int jml = izul.nextInt();
        
        CariPenduduk pencarian = new CariPenduduk(jml);

        for (int i = 0; i < pencarian.jmlData; i++) {
            System.out.println("Penduduk ke-" + (i + 1));
            System.out.print("NIK : ");
            int nik = izul.nextInt();
            System.out.print("Nama : ");
            String nama = fikar.nextLine();
            System.out.print("Alamat : ");
            String alamat = fikar.nextLine();
            System.out.print("Jenis Kelamin : ");
            String jenisK = fikar.nextLine();
            System.out.println();
            
            Penduduk P = new Penduduk(nik, nama, alamat, jenisK);
            pencarian.tambah(P);
        }
        
        System.out.print("Masukkan NIK data penduduk yang dicari : ");
        int cari = izul.nextInt();
        System.out.println("===========================================================");
        int posisi = pencarian.FindSeqSearch(cari);
        pencarian.Tampilposisi(cari, posisi);
    }
}

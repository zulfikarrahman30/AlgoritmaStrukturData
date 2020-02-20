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
public class vidGamemain {
    public static void main(String[] args) {
        Scanner izul = new Scanner(System.in);
        Scanner fikar = new Scanner(System.in);
        vidGame b = new vidGame();
        
        System.out.println("Masukan ID : ");
        b.id = izul.nextInt();
        System.out.println("Masukan Nama : ");
        b.nama = fikar.nextLine();
        System.out.println("Masukan Nama game");
        b.game = fikar.nextLine();
        System.out.println("Masukan waktu peminjaman : ");
        b.lamaPinjam = fikar.nextInt();
        System.out.println("Masukan harga sewa : ");
        b.harga = izul.nextInt();
        System.out.println("=================================================");
        b.dataPeminjaman();
        b.jumlahTotal();
    }   
}

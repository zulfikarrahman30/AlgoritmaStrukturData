/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class NilaiAlgoritmaMain {

    public static void main(String[] args) {
        Scanner izul = new Scanner(System.in);
        Scanner fikar = new Scanner(System.in);
        int elemen;
        double total = 0;
        double ratarata;

        System.out.print("Masukkan jumlah elemen yang akan diinput : ");
        elemen = izul.nextInt();
        Tugas3 na = new Tugas3();
        Tugas3[] main = new Tugas3[elemen];

        for (int i = 0; i < elemen; i++) {
            main[i] = new Tugas3();
            System.out.print("Masukkan Nama Mahasiswa ke-" + (i + 1) + " : ");
            main[i].namaMhs = fikar.nextLine();
            System.out.print("Masukkan Nilai Tugas Mahasiswa \t: ");
            main[i].nilaiTugas = fikar.nextInt();
            System.out.print("Masukkan Nilai Kuis Mahasiswa \t: ");
            main[i].nilaiKuis = fikar.nextInt();
            System.out.print("Masukkan Nilai UTS Mahasiswa \t: ");
            main[i].nilaiUTS = fikar.nextInt();
            System.out.print("Masukkan Nilai UAS Mahasiswa \t: ");
            main[i].nilaiUAS = fikar.nextInt();
        }

        for (int i = 0; i < elemen; i++) {
            System.out.println("==============================================================");
            System.out.println("Mahasiswa dengan Nama \t: " + main[i].namaMhs);
            System.out.println("Memiliki Nilai Total  \t: " + main[i].hitungTotal());
            total = total + main[i].hitungTotal();
        }

        ratarata = total/elemen;
        System.out.println("==============================================================");
        System.out.println("==============================================================");
        System.out.println("Rata - rata seluruh Mahasiswa : " + ratarata);

    }// main
}// class

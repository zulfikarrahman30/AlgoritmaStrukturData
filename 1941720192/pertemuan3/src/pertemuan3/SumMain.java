/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan3;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class SumMain {
    public static void main(String[] args) {
        Scanner izul = new Scanner(System.in);
        System.out.println("================================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta, Misal 5.9)");
        System.out.print("Masukkan jumalah perusahan : ");
        int elm=izul.nextInt();
        
        for(int a = 0;a < elm;a++){
            System.out.println("================================================");
            System.out.println("Menghitung perusahaan ke-"+ (a+1));
            System.out.println("Masukan jumlah bulan : ");
            int bulan=izul.nextInt();
            
            Sum sm=new Sum(elm);
            System.out.println("================================================");
             for(int i=0;i<sm.elemen;i++){
            System.out.print("Masukkan untung bulan ke-"+(i+1)+"= ");
            sm.keuntungan[i]=izul.nextDouble();
        }
            
        System.out.println("================================================");
        System.out.println("Algoritma Brute Force");
        System.out.println("Total keuntungan perusahaan selama "+sm.elemen+" bulan adalah= "+sm.totalBF(sm.keuntungan));
        System.out.println("================================================");
        System.out.println("Algoritma Divide Conquer");
        System.out.println("Total keuntungan perusahaan selama "+sm.elemen+" bulan adalah= "+sm.totalDC(sm.keuntungan, 0, sm.elemen-1));
    }
    }
}

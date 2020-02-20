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
public class MainPangkat {

   
        public static void main(String[] args) {
        Scanner izul = new Scanner(System.in);
        System.out.println("================================================");
            System.out.println("pemilihan metode yang diingingkan");
            System.out.println("1.brute force\n2.Dvidie conquer");
            System.out.println("Masukan pilihan anda : ");
            int pilihan = izul.nextInt();
        System.out.println("================================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung: ");
        int elemen=izul.nextInt();
        
        Pertemuan3[] png=new Pertemuan3[elemen];
        
        for(int i=0;i<elemen;i++){
            png[i]=new Pertemuan3();
            System.out.print("Masukkan nilai yang akan dipangkatkan ke-"+(i+1)+": ");
            png[i].nilai=izul.nextInt();
            System.out.print("Masukkan nilai pemangkat ke-"+(i+1)+": ");
            png[i].pangkat=izul.nextInt();
        }
        
        System.out.println("================================================");
        System.out.println("Hasil pangkat dengan Brute Force");
        for(int i=0;i<elemen;i++){
            System.out.println("Nilai "+png[i].nilai+" pangkat "+png[i].pangkat+" adalah: "+png[i].pangkatBF(png[i].nilai,png[i].pangkat));
        }
        System.out.println("================================================");
        System.out.println("Hasil Pangkat dengan Divide and Conquer");
        for(int i=0;i<elemen;i++){
            System.out.println("Nilai "+png[i].nilai+" pangkat "+png[i].pangkat+" adalah: "+png[i].pangkatDC(png[i].nilai,png[i].pangkat));
        }
        System.out.println("================================================");
    }
}

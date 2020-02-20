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
public class kampus2 {

    public static void main(String[] args) {
        Scanner izul = new Scanner(System.in);
        System.out.print("Jumlah Mahasiswa: ");
        int jml = izul.nextInt();
        kampus e[] = new kampus[jml];

        for (int a = 0; a < e.length; a++) {
            System.out.print("Mhs " + (a + 1));
            e[a] = new kampus();
            System.out.print("Nilai 1: ");
            e[a].nilai1 = izul.nextInt();
            System.out.print("Nilai 2: ");
            e[a].nilai2 = izul.nextInt();
        }
        System.out.println();
        for (int a = 0; a < e.length; a++) {
            System.out.println("Mhs " + (a + 1));
            System.out.println("Nilai 1: " + e[a].nilai1);
            System.out.println("Nilai 2: " + e[a].nilai2);

        }
        System.out.println();
        for (int a = 0; a < e.length; a++) {
            System.out.println("Nilai Terbaik Mhs " + (a + 1) + " : " + e[a].nilaiTerbaik());

        }
    }
}

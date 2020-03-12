/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum4;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class minMaxMain {

    public int nilaiArray;

    public static void max_min(int[] arr, int indeks_awal, int indeks_akhir, Maxmin hasil) {
        minMax[] ppArray = new minMax[5];
        ppArray[0] = new minMax();
        Scanner andy = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            ppArray[i] = new minMax();
            System.out.println("Nilai array indeks ke-" + i);
            System.out.println("Masukkan nilai: ");
            ppArray[i].nilaiArray = andy.nextInt();
        }
        int min = ppArray[0].nilaiArray;
        int max = ppArray[0].nilaiArray;
        for (int i = 0; i < 5; i++) {
            if (ppArray[i].nilaiArray < min) {
                min = ppArray[i].nilaiArray;
            } else if (ppArray[i].nilaiArray > max) {
                max = ppArray[i].nilaiArray;
            }
        }
        System.out.println("Brute Force");
        System.out.println("Nilai Minimal : " + min);
        System.out.println("Nilai Maksimal : " + max);

        int indeks_tengah;
        Maxmin hasil1 = new Maxmin();
        Maxmin hasil2 = new Maxmin();

        if (indeks_awal == indeks_akhir) {
            hasil.minimum = hasil.maximum = arr[indeks_awal];
        } else if (indeks_akhir - indeks_awal == 1) {
            if (arr[indeks_awal] > arr[indeks_akhir]) {
                hasil.minimum = arr[indeks_akhir];
                hasil.maximum = arr[indeks_awal];
            } else {
                hasil.minimum = arr[indeks_awal];
                hasil.maximum = arr[indeks_akhir];
            }
        } else {
            indeks_tengah = (indeks_awal + indeks_akhir) / 2;
            max_min(arr, indeks_awal, indeks_tengah, hasil1);
            max_min(arr, indeks_tengah + 1, indeks_akhir, hasil2);

            hasil.minimum = (hasil1.minimum < hasil2.minimum) ? hasil2.minimum : hasil2.minimum;
            hasil.maximum = (hasil1.maximum > hasil2.maximum) ? hasil2.maximum : hasil2.maximum;
        }

    }

}

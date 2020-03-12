
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
public class soal1Main {
    public static void main(String[] args) {
        Scanner izul = new Scanner(System.in);                          // O(1)
        quiz1 main1 = new quiz1();                                      // O(1)
        soalNo2 main2 = new soalNo2();                                  // O(1)

        System.out.println("Masukan nama : ");                          // O(1)
       main1.nama = izul.nextLine();                                    // O(1)
       
       main1.menghitungChar(main1.nama);                                // O(1)
       main2.perbandinganBF(main1.nama);                                // O(1)
       main2.perbandinganDC(main1.nama,0,main1.nama.length()-1);        // O(1)
       
        System.out.println("****************************");             // O(1)
        System.out.println("Brute Force");                              // O(1)
        System.out.println("Abjad terkecil : "+ main2.small);           // O(1)
        System.out.println("Abjad terbesar : "+ main2.big);             // O(1)
        
        System.out.println("****************************");             // O(1)
        System.out.println("Divide and Conquer");                       // O(1)
        System.out.println("Abjad terkecil : "+ main2.getSmall());      // O(1)
        System.out.println("Abjad terbesar : "+ main2.getBig());        // O(1)
    }
}

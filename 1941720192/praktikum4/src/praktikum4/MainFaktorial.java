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
public class MainFaktorial {
    public static void main(String[] args) {
        long Start,end;
        Scanner izul = new Scanner(System.in);
        System.out.println("==================================");
        System.out.println("Masukan jumlah elemen yang ingin dihitung : ");
        int elemen  = izul.nextInt();
        
        Faktorial fk[] = new Faktorial[elemen];
        for(int a=0;a<elemen;a++){
            fk[a]= new Faktorial();
            System.out.println("Masukan Nilai data ke "+(a+1)+" : ");
            fk[a].nilai = izul.nextInt();
            
        }
        Start = System.nanoTime();
        System.out.println("==================================");
        System.out.println("Hasil faktorial dengan brute force");
        for(int a = 0;a<elemen;a++){
            System.out.println("Faktorial dari nilai "+fk[a].nilai+"adalah "+fk[a].faktorialBf(fk[a].nilai));
            
        }
        end = System.nanoTime();
        System.out.println("waktu yang diperlukan selama proses : "+ ((end - Start)/1000000.0)+ " milisecond");
        
        Start = System.nanoTime();
        System.out.println("==================================");
        System.out.println("Hasil faktorial dengan Divide and conquer");
        for(int a = 0;a<elemen;a++){
            System.out.println("Faktorial dari nilai "+fk[a].nilai+"adalah "+fk[a].faktorialDC(fk[a].nilai));
            
        }
        end = System.nanoTime();
        System.out.println("waktu yang diperlukan selama proses : "+ ((end - Start)/1000000.0)+ " milisecond");
        
        
    }
    
    
}

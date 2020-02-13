/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayobjects;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class persegiPanjang {
    public int panjang;
    public int lebar;
    
    public static void main(String[] args) {
        persegiPanjang[] ppArray = new persegiPanjang[3];
        
        Scanner izul = new Scanner (System.in);
        
        for(int i = 0;i < 3;i++){
            ppArray[0] = new persegiPanjang();
            System.out.println("Persegi panjang ke-"+ i);
            System.out.println("Masukan panjang : ");
            ppArray[0].panjang = izul.nextInt();
            System.out.println("Masukan lebar : ");
            ppArray[0].lebar = izul.nextInt();
        }   
        
        for(int i = 0;i < 3; i++){
            System.out.println("Persegi panjang ke-"+i);
            System.out.println("Panjang: " + ppArray[0].panjang +", lebar: " + ppArray[0].lebar);
        }
        
        
    }
}

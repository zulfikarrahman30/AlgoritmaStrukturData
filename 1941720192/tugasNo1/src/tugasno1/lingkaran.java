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
public class lingkaran {
    public static void main(String[] args) {
        Scanner izul = new Scanner(System.in);
        TugasNo1 a= new TugasNo1();
        
        System.out.print("Masukan Jari-jari : ");
        a.r = izul.nextDouble();
        
        System.out.println("luas : "+ a.luas());
        System.out.println("keliling : "+ a.keliling());
    }
    
   
  
   
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum4;
import java.util.Scanner;
import static praktikum4.minMaxMain.max_min;
/**
 *
 * @author USER
 */
public class minMax {
    public int nilaiArray;
  
public static void main(String[] args){
    minMax[] ppArray = new minMax[5];
    ppArray[0] = new minMax();
    
    Scanner izul = new Scanner(System.in);
    
    for(int i=0; i<5; i++){
       ppArray[i] = new minMax();
        System.out.println("Nilai array indeks ke-"+i);
        System.out.println("Masukkan nilai: ");
        ppArray[i].nilaiArray = izul.nextInt();
        
    }
    int arr[] = new int[5];
    for(int i= 1; i<5;i++){
        arr[i]=ppArray[i].nilaiArray;
    }
    Maxmin hasil = new Maxmin();
    
    max_min(arr,0,4,hasil);
     System.out.println("Divide Conquer");
     System.out.print("Nilai Minimal: "+ hasil.minimum+"\nNilai Maksimaly: " + hasil.maximum);
     System.out.print("\n");
    }
    
}

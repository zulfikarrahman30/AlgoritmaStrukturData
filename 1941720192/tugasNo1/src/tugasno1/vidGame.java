/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasno1;

/**
 *
 * @author USER
 */
public class vidGame {
    int id,lamaPinjam,harga,total;
    String nama,game;
    
    void dataPeminjaman(){
        System.out.println("ID  :"+id);
        System.out.println("Nama member  :"+nama);
        System.out.println("Nama Game  :"+ game);
        System.out.println("Lama pinjam"+ lamaPinjam);
        System.out.println("Harga sewa @hari :"+harga);
    }
    
    void jumlahTotal(){
        total = lamaPinjam * harga;
        System.out.println("Total Harga : "+ total);
    }
}


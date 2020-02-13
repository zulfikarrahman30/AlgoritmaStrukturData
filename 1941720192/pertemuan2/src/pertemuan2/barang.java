package pertemuan2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class barang {
    String namaBarang, jenisBarang;
    int stok,hargaSatuan;
    
    barang(){
    }
    barang(String nm,String jn,int st,int hs){
        namaBarang = nm;
        jenisBarang = jn;
        stok = st;
        hargaSatuan = hs;
    }
    
    void tampilBarang(){
        System.out.println("nama = "+namaBarang);
        System.out.println("jenis = "+jenisBarang);
        System.out.println("stok = "+stok);
        System.out.println("Harga satuan = "+hargaSatuan);
    }
    void tambahStok(int n){
    stok = stok+n;
}
    void kurangiStok(int n){
        if(stok<=0){
        stok = stok-n;
        }
        else{
            System.out.println("stok habis!");
        }
    }
    int hitungHargatotal (int jumlah){
        return jumlah*hargaSatuan;
    }
}

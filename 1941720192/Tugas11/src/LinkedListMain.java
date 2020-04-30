
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
public class LinkedListMain {

    public static void main(String[] args) {
        LinkedListMahasiswa ms = new LinkedListMahasiswa();
        Scanner izul = new Scanner(System.in);
        int pilih;
        do {
            ms.menu();
            System.out.print("Pilih : ");
            pilih = izul.nextInt();
            try {
                switch (pilih) {

                    case 1:
                        System.out.println("Masukan Biodata Mahasiswa : ");
                        System.out.print("NIM :");
                        String nim = izul.next();
                        System.out.print("Nama :");
                        String nama = izul.next();
                        System.out.print("Alamat :");
                        String alamat = izul.next();
                        ms.add(nim, nama, alamat);
                        break;
                    case 2:
                        System.out.println("Hapus Data Mahasiswa : ");
                        ms.print();
                        System.out.println("Masukan NIM Mahasiswa yang ingin di hapus : ");
                        System.out.print("NIM :");
                        String nimhapus = izul.next();
                        ms.removeValue(nimhapus);
                        ms.print();
                        break;
                    case 3:
                        ms.print();
                        System.out.println("Cari Data Mahasiswa : ");
                        System.out.println("Apakah anda ingin cari mahasiswa : (y/n)");
                        char pilih2 = izul.next().charAt(0);
                        if (pilih2 == 'Y' || pilih2 == 'y') {
                            System.out.print("Masukan NIM yang ingin anda cari :");
                            String nimcari = izul.next();
                            ms.carikey(nimcari);
                        }
                        break;

                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        } while (pilih == 1 || pilih == 2 || pilih == 3);
         }
}


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
public class Main {

    public static void main(String[] args) {
        Scanner izul = new Scanner(System.in);
        Scanner fikar = new Scanner(System.in);
        Mahasiswa data = new Mahasiswa();
        int jumMhs = 5;

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("nama =  ");
            String nama = fikar.nextLine();
            System.out.println("Tahun Masuk = ");
            int thn = izul.nextInt();
            System.out.println("Umur = ");
            int umur = izul.nextInt();
            System.out.println("IPK  ");
            double ipk = izul.nextDouble();

            daftarMahasiswa m = new daftarMahasiswa(nama, thn, umur, ipk);
            data.tambah(m);
        }
          System.out.println("Data Mahasiswa sebelum sorting = ");
            data.tampil();
            System.out.println("Data mahasiswa setelah sorting desc berdasarkan ipk = ");
            data.bubblesort();
            data.tampil();
            System.out.println("Data mahasiswa setelah sorting asc berdasar ipk = ");
            data.selectionSort();
            data.tampil();
            System.out.println("Data setelah di insertion sort");
            data.insertionSort();
            data.tampil();

    }

}

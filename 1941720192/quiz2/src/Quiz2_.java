
import java.util.Scanner;
import java.util.ArrayList;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Quiz2_ {
public static final ArrayList<DataKeluhan> list = new ArrayList<DataKeluhan>();

    public static void main(String[] args) {
        Scanner izul = new Scanner(System.in);
        izul.useDelimiter("\n");
        LinkedQueue lq = new LinkedQueue();

        int pilihan;

        do {
            System.out.println("List Keluhan");
            System.out.println("============================================");
            add();
            System.out.println("============================================");
            System.out.println("\n");

            System.out.println("--------------------------------");
            System.out.println("Menu");
            System.out.println("--------------------------------");
            menu();
            System.out.println("--------------------------------");
            System.out.print("Masukkan Pilihan: ");
            pilihan = izul.nextInt();
            System.out.println("--------------------------------");

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Nama\t\t: ");
                    String nama = izul.next();
                    System.out.print("Masukkan Keluhan [1-9]\t: ");
                    int keluhan = izul.nextInt();

                    if (keluhan < 1 || keluhan > 9) {
                        System.out.println("Masukkan input yang benar");
                    } else {
                        lq.insert(new DataPasien(lq.getLastNo() +1, nama, keluhan, list.get((keluhan - 1)).getWaktu()));

                        System.out.println("----------------------------------");
                        lq.print();
                        System.out.println("----------------------------------");

                        System.out.println("\n");
                    }
                    list.clear();
                    break;
                case 2:
                    try {
                        System.out.println("Pasien tertangani: ");
                        lq.remove();
                        System.out.println("--------------------------------");
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    list.clear();
                    break;
                case 3:
                    lq.print();
                    System.out.println("Total antrian: " + lq.getSize());
                    System.out.println("Total perkiraan waktu: " + lq.getTotalWaktu());
                    System.out.println("--------------------------------");
                    list.clear();
                    break;
                case 4:
                    System.out.print("Masukkan no antrian: ");
                    int no = izul.nextInt();
                    System.out.println("--------------------------------");
                    System.out.println("Total antrian: " + lq.getAntri(no));
                    System.out.println("Total perkiraan waktu: " + lq.getWaktuByNum(no));
                    list.clear();
                    break;
                case 5:
                    System.out.print("Masukkan no antrian: ");
                    no = izul.nextInt();
                    System.out.println("--------------------------------");
                    
                    System.out.println("Hasil Pencarian: \n--------------------------------");
                    System.out.println(lq.getInfo(no)+"");
                    System.out.println("--------------------------------");
                    
                    list.clear();
                    break;
                case 6:
                    System.out.println("Rata-rata waktu penanganan" + lq.getRata());
                    list.clear();
                    break;
                case 7:
                    lq.infoKeluhan();
                    System.out.println("--------------------------------");
                    list.clear();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Maaf inputan tidak sesuai");
            }

        } while (pilihan >= 0 || pilihan <= 7);
    }

    public static void add() {

        DataKeluhan a = new DataKeluhan(1, "Demam", 7);
        DataKeluhan b = new DataKeluhan(2, "Flu", 5);
        DataKeluhan c = new DataKeluhan(3, "Sakit Kepala", 8);
        DataKeluhan d = new DataKeluhan(4, "Asma", 4);
        DataKeluhan e = new DataKeluhan(5, "Diare", 3);
        DataKeluhan f = new DataKeluhan(6, "Sakit Gigi", 11);
        DataKeluhan g = new DataKeluhan(7, "Sakit Mata", 13);
        DataKeluhan h = new DataKeluhan(8, "Kesleo", 16);
        DataKeluhan i = new DataKeluhan(9, "Susah Tidur", 5);

        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        list.add(e);
        list.add(f);
        list.add(g);
        list.add(h);
        list.add(i);

        String format = "%1$-10s|%2$-20s|%3$-10s\n";
        System.out.format(format, "No Pilihan", "Keluhan", "Waktu(Menit)");

        list.forEach((l) -> {
            System.out.format(String.format(format, l.getNo_pilihan(), l.getKeluhan(), l.getWaktu()));
        });
    }

    public static void menu() {
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Cek Antrian");
        System.out.println("4. Cek Antrian (no)");
        System.out.println("5. Cek Pasien (no)");
        System.out.println("6. Rata-rata Waktu");
        System.out.println("7. Statistik Keluhan");
        System.out.println("0. Keluar");
    }
    
}

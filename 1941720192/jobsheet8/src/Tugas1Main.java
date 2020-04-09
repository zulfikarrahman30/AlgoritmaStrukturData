
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
public class Tugas1Main {

    public static void main(String[] args) {
        Scanner izul = new Scanner(System.in);

        System.out.print("Masukkan kalimat\t: ");
        String kalimat = izul.nextLine();
        String kata[] = kalimat.split("\\s+");
        Tugas1 tumpukan = new Tugas1(kata.length);

        for (int i = 0; i < kata.length; i++) {
            tumpukan.push(kata[i]);
        }

        tumpukan.print();

        tumpukan.pop();
        tumpukan.peek();
        tumpukan.print();
    }
}

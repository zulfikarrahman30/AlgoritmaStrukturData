/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3;

/**
 *
 * @author USER
 */
public class Tugas3 {

    public String namaMhs;
    public int nilaiTugas;
    public int nilaiKuis;
    public int nilaiUTS;
    public int nilaiUAS;
    public int banyakElemen;

    public double hitungTotal() {
        double total;
        total = (nilaiTugas * 30 / 100) + (nilaiKuis * 20 / 100) + (nilaiUTS * 20 / 100) + (nilaiUAS * 30 / 100);
        return total;
    }

}

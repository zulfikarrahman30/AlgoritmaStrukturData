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
public class kampus {
    int nilai1, nilai2;

    int nilaiTerbaik() {
        int maks;
        if (nilai2 < nilai1) {
            maks = nilai1;
        } else {
            maks = nilai2;
        }
        return maks;
    } 
}

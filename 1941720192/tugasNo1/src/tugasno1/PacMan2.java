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
public class PacMan2 {
  public static void main(String[] args) {
        Scanner izul = new Scanner(System.in);
        PacMan c = new PacMan();
        System.out.print("Masukkan koordinat x: ");
        c.x = izul.nextInt();
        System.out.print("Masukkan koordinat y:  ");
        c.y = izul.nextInt();
        System.out.print("Masukkan width: ");
        c.width = izul.nextInt();
        System.out.print("Masukkan height: ");
        c.height = izul.nextInt();
        
        c.moveLeft();
        c.moveRight();
        c.moveUp();
        c.moveDown();
    }  
}

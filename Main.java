/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceLatihan;

import java.util.Scanner;

/**
 *
 * @author DS
 */
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Pembeda Data = new Pembeda();
        String ulang;
        do {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("         PROGRAM PEMBEDA TIPE DATA");
            System.out.println("           INTEGER DAN DOUBLE");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.print("Masukkan Angka : ");
            double angka = in.nextDouble();
            if ((angka % 2 != -1) && (angka % 2 != 0) && (angka % 2 != 1)) {
                System.out.println("Angka "+angka+" Bertipe Data "+Data.MethodD1());
                
            } else {                
                System.out.println("Angka "+angka+" Bertipe Data "+Data.MethodI1());
            }
            System.out.println("....................................");
            System.out.println("ingin menghitung lagi  (y/n) ?");          
            System.out.println("....................................");
            ulang = in.next();
        } while (ulang.equalsIgnoreCase("y"));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("            PROGRAM SELESAI");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

    }

}

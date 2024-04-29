/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author A-16
 */
public class NewClass1 {

    public static void main(String[] args) {
        String Nama = "Ghalensya Novelan";
        int variabelA = 10;
        int variabelB = 20;
        double dobel = 10.;
        double dobel2 = 20.;
        float floatku = 5.99f;
        boolean isPLUS = true;
        System.out.println("Nama Saya = " + Nama);
        System.out.println("angka pertama saya = " + variabelA);
        System.out.println("angka kedua saya = " + variabelB);
        System.out.println("angka dobel saya1 = " + dobel);
        System.out.println("angka dobel saya2 = " + dobel2);
        System.out.println("float saya = " + floatku);
        System.out.println("bolean saya = " + isPLUS);

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai baru untuk nilaiA (integer): ");
        variabelA = input.nextInt();
        System.out.print("Masukkan nilai baru untuk nilaiA (integer): ");
        variabelB = input.nextInt();

        System.out.print("Masukkan nilai baru untuk nilaiC (double): ");
        dobel = input.nextDouble();
        System.out.print("Masukkan nilai baru untuk nilaiC (double): ");
        dobel2 = input.nextDouble();

        System.out.print("Masukkan nilai baru untuk isPlus (boolean): ");
        floatku = input.nextFloat();

        System.out.print("Masukkan nilai baru untuk isPlus (boolean): ");
        isPLUS = input.nextBoolean();

        System.out.println("nilaiA baru = " + variabelA);
        System.out.println("nilaiB baru = " + variabelB);
        System.out.println("nilaiC baru = " + dobel);
        System.out.println("nilaiC baru = " + dobel2);
        System.out.println("nilaiC baru = " + floatku);
        System.out.println("isPlus baru = " + isPLUS);

        System.out.print("Masukkan nilai string: ");
        String nilaiString = input.next();
        System.out.println("nilaiString = " + nilaiString);
    }

}

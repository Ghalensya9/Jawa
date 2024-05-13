/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan6;

import java.util.Scanner;

/**
 *
 * @author A-12
 */
public class Latiahn1 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int age;
        System.out.print("Berapa Usiamu? ");
        age = keyboard.nextInt();
        System.out.println("Siapa Namamu?: ");
        if (age < 13) {
            System.out.println("\tSekolah SMP");
        }
        if (age < 16) {
            System.out.println("\tSekolah SMA");
        }
        if (age <= 18) {
            System.out.println("\tLulus SMA");
        }

        if (age < 35) {
            System.out.println("\tSudah Bekerja");

        if (age >= 50) {
                System.out.println("\tPensiun");
            }
        }
    }
}

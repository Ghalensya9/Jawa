/*
 * Klik nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt untuk mengubah lisensi ini
 * Klik nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java untuk mengedit templat ini
 */
package Pertemuan6.folder;

import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author M S I
 */
public class Latihan7 {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);

        System.out.println("Tuliskan pesan di sini, saya akan menampilkannya berulang kali.");
        System.out.print("Masukkan pesan Anda: ");
        String pesan = masukan.nextLine();

        // Menggunakan kelas Random untuk menghasilkan bilangan acak
        Random mesinAcak = new Random();
        int jumlahPengulangan = mesinAcak.nextInt(20) + 1; // Menghasilkan bilangan dari 1 sampai 20

        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("\nJumlah pengulangan yang dihasilkan = " + jumlahPengulangan);

        if (jumlahPengulangan >= 10) { // jika lebih dari atau sama dengan 10
            System.out.println("\n\tBilangan acak yang dihasilkan terlalu besar, pesan akan diulang 5 kali.");
            jumlahPengulangan = 5; // maka pesan akan diulang 5 kali
        }

        System.out.println("\nPesan diulang sebanyak : " + jumlahPengulangan + " kali\n");
        System.out.println("-----------------------------------------------------------------------------");

        for (int n = 0; n < jumlahPengulangan; n++) { // dimulai dari index 0
            System.out.println(n + ". " + pesan);
        }
    }
}

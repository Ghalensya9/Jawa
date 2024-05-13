/*
 * Klik nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt untuk mengubah lisensi ini
 * Klik nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java untuk mengedit templat ini
 */
package Pertemuan6;

import java.util.Scanner;
/**
 *
 * @author M S I
 */
public class Latihan5 {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        String ulang = "y";

        while (ulang.equalsIgnoreCase("y")) {
            System.out.println("Masukkan nomor (1-7): ");
            int nomor = masukan.nextInt();

            String hari;
            switch (nomor) {
                case 1:
                    hari = "Hari Senin";
                    break;
                case 2:
                    hari = "Hari Selasa";
                    break;
                case 3:
                    hari = "Hari Rabu";
                    break;
                case 4:
                    hari = "Hari Kamis";
                    break;
                case 5:
                    hari = "Hari Jumat";
                    break;
                case 6:
                    hari = "Hari Sabtu";
                    break;
                case 7:
                    hari = "Hari Minggu";
                    break;
                default:
                    System.out.println("Input tidak valid. Silakan masukkan nomor antara 1 dan 7.");
                    continue;
            }

            System.out.println("Hari ini adalah: " + hari);
            System.out.println("Apakah Anda ingin mengulang program? (y/n): ");
            ulang = masukan.next();
        }

        System.out.println("Terima kasih telah menggunakan program. Sampai jumpa!");
        masukan.close(); // Tutup scanner setelah menggunakan
    }
}

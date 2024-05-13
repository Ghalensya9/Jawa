/*
 * Untuk mengubah header lisensi ini, pilih Header Lisensi di Properti Proyek.
 * Untuk mengubah file templat ini, pilih Alat | Templat
 * dan buka templat di editor.
 */
package Pertemuan6;

import java.util.Scanner;

/**
 *
 * @author A-12
 */
public class Latihan3 {

    public static void main(String[] args) {
        int orang = 30;
        int mobil = 40;
        int bus = 15;
        
        System.out.println("Nilai orang adalah " + orang);
        System.out.println("Nilai mobil adalah " + mobil);
        System.out.println("Nilai bus adalah " + bus);
        
        System.out.println("--------------------------------------------------");

        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Silakan input nilai baru untuk orang ");
        orang = inputScanner.nextInt();
        System.out.println("Silakan input nilai baru untuk mobil ");
        mobil = inputScanner.nextInt();
        System.out.println("Silakan input nilai baru untuk bus ");
        bus = inputScanner.nextInt();
        
        System.out.println("--------------------------------------------------");
        
        System.out.println("Nilai baru orang adalah " + orang);
        System.out.println("Nilai baru mobil adalah " + mobil);
        System.out.println("Nilai baru bus adalah " + bus);
        
        System.out.println("--------------------------------------------------");
        
        if (mobil > orang) {
            System.out.println("\n\tSebaiknya kita naik mobil.");
        } else if (mobil < orang) {
            System.out.println("\tLebih baik kita tidak naik mobil.");
        } else {
            System.out.println("\tKita tidak dapat membuat keputusan.");
        }
        if (bus > mobil) {
            System.out.println("\tItu terlalu banyak bus.");
        } else if (bus < mobil) {
            System.out.println("\tMungkin kita bisa naik bus.");
        } else {
             System.out.println("\tKita masih belum bisa memutuskan.");
        }
        if (orang > bus) {
            System.out.println("\tBaiklah, mari kita naik bus saja.");
        } else {
            System.out.println("\tBaiklah, kita tetap di rumah saja.");
        }
    }
}

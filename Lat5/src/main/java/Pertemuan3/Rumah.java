public class Rumah {
// Variabel instance
int jumlahKamar;
String warnaCat;
public static void main(String[] args) {
// Variabel lokal
int tinggiAtap = 3;
// Membuat objek Rumah
Rumah rumahku = new Rumah();
// Mengatur nilai variabel instance
rumahku.jumlahKamar = 4;
rumahku.warnaCat = "Biru";
// Mencetak informasi rumah
System.out.println("Jumlah kamar: " + rumahku.jumlahKamar);
System.out.println("Warna cat: " + rumahku.warnaCat);
System.out.println("Tinggi atap: " + tinggiAtap); // Hanya dapat diakses
di dalam metode main
}
}
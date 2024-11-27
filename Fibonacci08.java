import java.util.Scanner;
public class Fibonacci08 {
    public static int[] jumlahPasanganMarmut(int bulan, int produktif, int tidakProduktif) {
        if (bulan == 1) {
            return new int[]{produktif, tidakProduktif};
        } else if (bulan == 2) {
            return new int[]{produktif, produktif + tidakProduktif};
        } else {
            int[] bulanSebelumnya = jumlahPasanganMarmut(bulan - 1, produktif, tidakProduktif);
            int totalProduktifSebelum = bulanSebelumnya[0];
            int totalTidakProduktifSebelum = bulanSebelumnya[1];
            int totalProduktifSekarang = totalProduktifSebelum + totalTidakProduktifSebelum;
            int totalTidakProduktifSekarang = totalProduktifSebelum;
            return new int[]{totalProduktifSekarang, totalTidakProduktifSekarang};
        }
    }

    public static void main(String[] args) {
        Scanner pras = new Scanner(System.in);
        System.out.print("Masukkan jumlah pasangan produktif pada bulan pertama: ");
        int produktifAwal = pras.nextInt();
        System.out.print("Masukkan jumlah pasangan tidak produktif pada bulan pertama: ");
        int tidakProduktifAwal = pras.nextInt();
        int jumlahBulan = 12;

        for (int i = 1; i <= jumlahBulan; i++) {
            int[] hasil = jumlahPasanganMarmut(i, produktifAwal, tidakProduktifAwal);
            int totalPasangan = hasil[0] + hasil[1];
            System.out.println("Bulan ke-" + i + ": Produktif = " + hasil[0] + ", Tidak Produktif = " + hasil[1] + ", Total = " + totalPasangan);
        }pras.close();
    }
}
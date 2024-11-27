import java.util.Scanner;
public class Percobaan308 {
    static double hitungLaba(double saldo, int tahun) {
        if (tahun == 0) {
            return (saldo);
        } else {
            return(1.11 * hitungLaba(saldo, tahun-1));
        }
    }
public static void main(String[] args) {
    Scanner pras = new Scanner(System.in);

    System.out.print("Jumlah saldo awal : ");
    double saldoAwal = pras.nextDouble();
    System.out.print("Lamanya investasi (Tahun) : ");
    int tahun = pras.nextInt();
    System.out.println("Jumlah saldo setelah " + tahun + " tahun : " + hitungLaba(saldoAwal, tahun));
    pras.close();
}
}

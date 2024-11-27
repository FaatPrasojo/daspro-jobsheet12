import java.util.Scanner;
public class CekPrimaRekursif08 {
   static boolean cekPrima(int n, int pembagi) {
        if (pembagi * pembagi > n) {
            return true;
        } else if (n % pembagi == 0) {
            return false;
        } else {
            return cekPrima(n, pembagi + 1);
        }
    }
    static boolean aturanPrima(int n) {
        if (n <= 1) {
            return false;
        } else if (n == 2) {
            return true;
        } return cekPrima(n, 2);
    }
    public static void main(String[] args) {
        Scanner pras = new Scanner(System.in);

        System.out.print("Masukkan bilangan : ");
        int n = pras.nextInt();
        
        if (aturanPrima(n)) {
            System.out.println(n + " adalah bilangan prima.");
        } else {
            System.out.println(n + " bukan bilangan prima.");
        }
        pras.close();
    }
}

import java.util.Scanner;
public class Percobaan208 {
    static int hitungPangkat (int x, int y, int hasil) {
        if (y == 0) {
            System.out.print(" x 1 = " );
            return hasil;
        } else {
            System.out.print(x + " x ");
            return hitungPangkat(x, y - 1, hasil * x);
        }
    }
    public static void main(String[] args) {
     Scanner pras = new Scanner(System.in);
     
     System.out.print("Bilangan yang dihitung : ");
     int bilangan = pras.nextInt();
     System.out.print("Pangkat : ");
     int pangkat = pras.nextInt();

     System.out.println(hitungPangkat(bilangan, pangkat, 1));
     pras.close();
    }
}

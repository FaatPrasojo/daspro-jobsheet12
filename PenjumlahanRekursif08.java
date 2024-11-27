import java.util.Scanner;
public class PenjumlahanRekursif08 {
    static int hitungJumlah (int x, int hasil) {
        if (x == 1) {
        System.out.print("1" +" = ");
        return (hasil);
        }else  {
            System.out.print(x + " + ");
            hasil += x;
            return hitungJumlah(x-1, hasil);
        }  
    }
    public static void main(String[] args) {
     Scanner pras = new Scanner(System.in);
     
     System.out.print("Bilangan yang dihitung : ");
     int bilangan = pras.nextInt();

     System.out.println(hitungJumlah(bilangan, 1));
     pras.close();
    }
}
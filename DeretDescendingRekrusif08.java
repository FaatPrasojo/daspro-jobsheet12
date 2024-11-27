import java.util.Scanner;
public class DeretDescendingRekrusif08 {
    static int rekrusif(int n) {
      if (n == 0){
        System.out.print(n);
        return (n);
      }  else {
        System.out.print(n);
        return rekrusif(n-1);
      }
    }
    public static void main(String[] args) {
        Scanner pras = new Scanner(System.in);

        System.out.print("Masukkan nilai bilangan : ");
        int bil = pras.nextInt();

        System.out.println(" adalah bilangan " + bil + " sampai " + rekrusif(bil));
        pras.close();
    }
}

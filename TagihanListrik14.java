
import java.util.Scanner;

public class TagihanListrik14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int tarifDasar = 1500;
        int melebihi= 500;

        System.out.println("Masukan Jumlah  listik KWH");
        int penggunaankwh  = input.nextInt();
        boolean melebihiBatas = penggunaankwh > melebihi;
        
        int totalTagihan = penggunaankwh * tarifDasar;

        System.out.println("Total Tagihan Listrik Rp " + totalTagihan);
        System.out.println("penggunaan melebihi batas  " + melebihiBatas);
       
    }
        
}
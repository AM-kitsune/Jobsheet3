import java.util.Scanner;

public class GajiKaryawan14 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Masukkan jumlah jam kerja: ");
        double jamKerja = scanner.nextDouble();
        
        System.out.print("Masukkan upah per jam: ");
        double upahPerJam = scanner.nextDouble();
        double gajiPokok = jamKerja * upahPerJam;
        double bonus = 0.10 * gajiPokok;
        double totalGajiSebelumPajak = gajiPokok + bonus;
        double pajak = 0.05 * totalGajiSebelumPajak;
        double gajiBersih = totalGajiSebelumPajak - pajak;
    
        System.out.printf("Gaji Pokok: Rp%.2f%n", gajiPokok);
        System.out.printf("Bonus: Rp%.2f%n", bonus);
        System.out.printf("Total Gaji Sebelum Pajak: Rp%.2f%n", totalGajiSebelumPajak);
        System.out.printf("Pajak: Rp%.2f%n", pajak);
        System.out.printf("Gaji Bersih: Rp%.2f%n", gajiBersih);
        scanner.close();
    }
}

import java.util.Scanner;

public class Siakad14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, nim;
        String kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUTS, nilaiAkhir, nilaiUAS;

        System.out.println("Masukan Nama: ");
        nama = sc.nextLine();
        System.out.println("Masukan NIM: ");
        nim = sc.nextLine();
        System.out.println("Masukan Kelas: ");
        kelas = sc.nextLine();
        System.out.println("Masukan Nomor Absen: ");
        absen = sc.nextByte();

        System.out.print("Masukkan nilai kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan nilai UTS: ");
        nilaiUTS = sc.nextDouble();
        System.out.print("Masukkan nilai UAS: ");
        nilaiUAS = sc.nextDouble();
        
        nilaiAkhir = ( (nilaiKuis*0.20) + (nilaiTugas*0.15) + (nilaiUTS*0.30) + (nilaiUAS*0.35)  ) / 3;

        System.out.println("Nama: " + nama + " Nim: " + nim);
        System.out.println("Kelas: " + kelas + "Absen: " + absen );
        System.out.println("Nilai Ahir: " + nilaiAkhir);

    }
}

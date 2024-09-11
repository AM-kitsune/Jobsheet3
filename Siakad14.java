import java.util.Scanner;

public class Siakad14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, nim;
        char kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;

        System.out.println("Masukan Nama: ");
        nama = sc.nextLine();
        System.out.println("Masukan NIM: ");
        nim = sc.nextLine();
        System.out.println("Masukan Kelas: ");
        kelas = sc.nextLine(). charAt(0);
        System.out.println("Masukan Nomor Absen: ");
        absen = sc.nextByte();

        System.out.print("Masukkan nilai kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan nilai ujian: ");
        nilaiUjian = sc.nextDouble();
        
        nilaiAkhir = (nilaiKuis + nilaiUjian + nilaiUjian) / 3;

        System.out.println("Nama: " + nama + " Nim: " + nim);
        System.out.println("Kelas: " + kelas + "Absen: " + absen );
        System.out.println("Nilai Ahir: " + nilaiAkhir);

    }
}

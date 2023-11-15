import java.util.Scanner;

public class JobVacation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama, jenisKelamin, lulusan;
        int umur, pengalaman;
        double penampilan;
        boolean koordinator, admin;

        System.out.println("Selamat Datang di PT. Secret Semut 79");
        System.out.println("=====================================");
        System.out.println();
        System.out.println("Silahkan input data anda");
        System.out.println("Nama :");
        nama = input.nextLine();

        System.out.println("Umur :");
        umur = input.nextInt();
        input.nextLine();

        System.out.println("Jenis Kelamin (Pria/Wanita) :");
        jenisKelamin = input.nextLine();

        System.out.println("Lulusan (SMK/D3/S1) : ");
        lulusan = input.nextLine();

        System.out.println("Pengalaman (Tahun) : ");
        pengalaman = input.nextInt();

        System.out.println("Penampilan (1/10) : ");
        penampilan = input.nextInt();

        koordinator = (jenisKelamin.equals("Pria") && ((umur >= 21 && umur <= 30 && lulusan.equals("D3") && pengalaman >= 2) || (umur > 30 && lulusan.equals("S1") && pengalaman >= 5)));
        admin = (jenisKelamin.equals("Wanita") && ((umur >= 20 && umur <= 25 && lulusan.equals("D3") && (penampilan >= 8.5 || pengalaman >= 1)) || (umur > 25 && lulusan.equals("S1") && penampilan >= 8.5 && pengalaman >= 5)));

        System.out.println();
        System.out.println(nama + ", Terimakasih telah mengikuti Lowongan Kerja di PT. Secret Semut 79.");
        System.out.println();
        System.out.println("Berikut adalah hasil dari Rekrutment untuk Koordinator dan Admin :");
        System.out.println("Hasil kelulusan untuk Koordinator : " + koordinator);
        System.out.println("Hasil kelulusan untuk Admin : " + admin);

    }
}

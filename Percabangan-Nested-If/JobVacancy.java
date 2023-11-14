/**
 * JobVacancy
 */
import java.util.Scanner;

public class JobVacancy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Selamat datang di PT. Sulthan Berkah");
        System.out.println("====================================");
        System.out.println();
        System.out.println("Silahkan Input Data Anda");
        System.out.println();
        System.out.println("Nama : ");
        String nama = input.nextLine();

        System.out.println("Umur : ");
        int umur = input.nextInt();
        input.nextLine();

        System.out.println("Jenis Kelamin (Pria/Wanita) : ");
        String jk = input.nextLine();

        System.out.println("Lulusan (SMK/D3/S1) : ");
        String lulusan = input.nextLine();

        System.out.println("Pengalaman (Tahun) : ");
        int pengalaman = input.nextInt();

        System.out.println("Penampilan (1 s.d 10) : ");
        double penampilan = input.nextDouble();
        input.nextLine();

        System.out.println("Posisi yang dilamar (SPV, Admin, atau Koordinator) : ");
        String posisi = input.nextLine();

        boolean lolos = false;

        if (posisi.equals("SPV")) {
            if (((jk.equals("Pria") || jk.equals("Wanita")) && (umur >= 23 && umur <= 30) && lulusan.equals("S1") && pengalaman > 1) || ((jk.equals("Pria") || jk.equals("Wanita")) && (umur >= 25 && umur <= 35) && lulusan.equals("D3") && pengalaman > 4)){
                lolos = true;
            }
        } else if (posisi.equals("Admin")) {
            if ((jk.equals("Wanita") && (umur >= 20 && umur <= 25) && lulusan.equals("D3") && (penampilan >= 8.5 || pengalaman >= 1)) || (jk.equals("Wanita") && umur > 25 && lulusan.equals("S1") && penampilan >=8.5 && pengalaman >= 3) || (jk.equals("Pria") && (umur >= 20 && umur <= 30) && penampilan >= 8.5 && (lulusan.equals("S1") || lulusan.equals("D3")) && pengalaman >= 2)) {
                lolos = true;
            }
        } else if (posisi.equals("Koordinator")) {
            if ((jk.equals("Pria") && (umur >= 21 && umur <= 30) && (lulusan.equals("SMK") || lulusan.equals("D3")) && pengalaman >= 2) || (jk.equals("Pria") && umur >= 30 && lulusan.equals("S1") && pengalaman >= 5)) {
                lolos = true;
            }
        }

        System.out.println("====================================");
        System.out.println();

        System.out.println(nama + ", Terima Kasih Sudah Mengikuti Lowongan Kerja PT. Sulthan Berkah.");
        System.out.println();
        System.out.println("Berikut adalah Hasil dari Rekrutmen untuk Posisi " + posisi + " :");
        if (lolos) {
            System.out.println("Selamat, " + nama);
            System.out.println("Anda memenuhi syarat sebagai " + posisi + ". Dan akan masuk ke tahap selanjutnya.");
        } else {
            System.out.println("Maaf, " + nama);
            System.out.println("Anda tidak memenuhi syarat sebagai " + posisi + ". Dan tidak akan masuk ke tahap selanjutnya.");
        }
    }
}
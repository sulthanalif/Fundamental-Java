import java.util.Random;
import java.util.Scanner;

public class GuessingNumber {
    public static void main(String[] args) {
        // Menghasilkan nomor acak antara 1 dan 10
        Random random = new Random();
        int jawaban = random.nextInt(10) + 1;

        // Inisialisasi variabel
        int tebakan;
        int percobaan = 0;

        // Scanner untuk input pengguna
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di permainan Tebak Angka!");
        System.out.println("Saya sudah memilih sebuah angka antara 1 dan 10.");

        // Melakukan loop sampai pengguna menebak dengan benar atau mencapai batas percobaan
        while (percobaan < 3) {
            System.out.print("Masukkan tebakan Anda: ");
            tebakan = scanner.nextInt();
            
            // Mengecek apakah tebakan benar
            if (tebakan == jawaban) {
                System.out.println("Selamat! Anda menebak dengan benar. Angka yang benar adalah: " + jawaban);
                break;
            } else {
                // Menentukan seberapa dekat tebakan dengan jawaban
                int jarak = Math.abs(tebakan - jawaban);

                if (jarak >= 3) {
                    System.out.println("Dingin");
                } else if (jarak == 2) {
                    System.out.println("Hangat");
                } else {
                    System.out.println("Panas");
                }

                // Meningkatkan jumlah percobaan
                percobaan++;
            }
        }

        // Menampilkan pesan jika pengguna tidak berhasil menebak dalam tiga percobaan
        if (percobaan == 3) {
            System.out.println("Sayang sekali! Anda tidak berhasil menebak dalam tiga percobaan. Jawabannya adalah: " + jawaban);
        }

        // Menutup scanner
        scanner.close();
    }
}

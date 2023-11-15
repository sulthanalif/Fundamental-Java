/**
 * PassingGradeSMK79
 */
import java.util.Scanner;
 
public class PassingGradeSMK79 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        boolean lolosSMK;
        boolean lolosSastra;
        boolean lolosTKJ;
        
        System.out.println("Masukkan Nilai Ujian Matematika: ");
        int nilaiMTK = input.nextInt();

        System.out.println("Masukkan Nilai Ujian B.Indonesia: ");
        int nilaiIndo = input.nextInt();

        System.out.println("Masukkan Nilai Ujian B.Inggris: ");
        int nilaiIngg = input.nextInt();

        System.out.println("Masukkan Nilai Ujian IPA: ");
        int nilaiIPA = input.nextInt();

        double avarageAll = (double) nilaiIPA+nilaiMTK+nilaiIndo+nilaiIngg/4;
        double avarageSastra = (double) nilaiIndo+nilaiIngg/2;

        lolosSMK = (avarageAll>=73);

        lolosSastra = (avarageSastra>=75);

        lolosTKJ = (nilaiMTK>80);

        System.out.println("Hasil dari Simulasi untuk Persyaratan Penerimaan Calon Siswa di SMK Padepokan 79 adalah sebagai berikut :");
        System.out.println("=========================================================================================================");
        System.out.println("Apakah anda memenuhi syarat untuk masuk ke SMK Padepokan 79 : "+lolosSMK);
        System.out.println("Apakah anda memenuhi syarat untuk masuk ke Jurusan Sastra : "+lolosSastra);
        System.out.println("Apakah anda memenuhi syarat untuk masuk ke Jurusan TKJ : "+lolosTKJ);

    }    
}
import java.util.Scanner;

public class ArrayManipulation1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array numbers
        int[] numbers = {3, 2, 5, 11, 7, 10, 11, 3, 15, 11, 17, 10, 5};

        // Menampilkan isi array
        System.out.println("Array numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("(" + numbers[i] + ") ");
        }

        System.out.println("\n\nCase 1");
        System.out.println("Mencari Angka yang ada di Arrays numbers!!!");

        // Input angka yang dicari
        System.out.print("Masukkan angka yang anda cari: ");
        int targetNumber = scanner.nextInt();

        // Mencari nilai dalam array
        int occurrences = 0;
        System.out.println("Angka " + targetNumber + " yang anda cari ditemukan di array numbers.");

        System.out.print("Ada ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == targetNumber) {
                occurrences++;
                System.out.print(targetNumber);
                if (occurrences < countOccurrences(numbers, targetNumber)) {
                    System.out.print(", ");
                }
                System.out.print(" pada index ke: " + i);
                System.out.println();
            }
        }
        
        if (occurrences == 0) {
            System.out.println("Tidak ada angka " + targetNumber + " dalam array numbers.");
        } else {
            System.out.println("Didalam array numbers.");
        }

        scanner.close();
    }

    // Fungsi untuk menghitung jumlah kemunculan suatu angka dalam array
    private static int countOccurrences(int[] array, int target) {
        int count = 0;
        for (int value : array) {
            if (value == target) {
                count++;
            }
        }
        return count;
    }
}

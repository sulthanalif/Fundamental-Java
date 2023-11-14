import java.util.Scanner;

public class ArrayManipulation2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array numbers
        int[] numbers = {3, 2, 5, 11, 7, 10, 11, 3, 15, 11, 17, 10, 5};

        // Menampilkan isi array
        System.out.println("Nilai dari numbers adalah:");
        displayArray(numbers);

        System.out.println("\n\nCase 2");
        System.out.println("Merubah Nilai dari arrays numbers!!!");

        // Memasukkan posisi yang akan diganti
        System.out.print("Masukkan posisi yang mau diganti (1 - 13): ");
        int indexToModify = scanner.nextInt();

        // Validasi indeks yang dimasukkan
        if (indexToModify < 1 || indexToModify > numbers.length) {
            System.out.println("Posisi tidak valid.");
            return;
        }

        // Memasukkan nilai baru
        System.out.print("Masukkan Nilai : ");
        int newValue = scanner.nextInt();

        // Merubah nilai pada indeks tertentu
        numbers[indexToModify - 1] = newValue;

        // Menampilkan array setelah perubahan
        System.out.println("Nilai dari numbers adalah:");
        displayArray(numbers);

        scanner.close();
    }

    // Fungsi untuk menampilkan isi array
    private static void displayArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}

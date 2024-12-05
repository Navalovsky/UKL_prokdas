import java.util.Scanner;

public class Kehadiran {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa: ");
        int numStudents = scanner.nextInt();

        int[] Kehadiran = new int[numStudents];

        int totalKehadiran = 0;

        for (int i = 0; i < numStudents; i++) {
            System.out.printf("Masukkan jumlah hari hadir siswa ke-" +(i + 1)+ "(dari 30 hari)" +":");
            Kehadiran[i] = scanner.nextInt();

            while (Kehadiran[i] < 0 || Kehadiran[i] > 30) {
                System.out.println("Jumlah hari hadir tidak valid! Harus antara 0 dan 30.");
                System.out.printf("Masukkan jumlah hari hadir siswa ke- (dari 30 hari): ", i + 1);
                Kehadiran[i] = scanner.nextInt();
            }

            totalKehadiran += Kehadiran[i];
        }

        double rataKehadiran = (double) totalKehadiran / numStudents;

        System.out.println("\nLaporan Kehadiran Siswa:");
        for (int i = 0; i < numStudents; i++) {
            System.out.printf("Siswa ke-%d: %d hari hadir\n", i + 1, Kehadiran[i]);
        }
        System.out.printf("\nRata-rata kehadiran: %.2f hari\n", rataKehadiran);

        scanner.close();
    }
}

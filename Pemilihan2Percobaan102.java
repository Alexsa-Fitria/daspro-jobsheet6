import java.util.Scanner;
public class Pemilihan2Percobaan102 {
    public static void main(String[] args) {
        Scanner absen02 = new Scanner(System.in);
        System.out.print("Masukkan tahun: ");
        int tahun = absen02.nextInt();

        if (tahun % 100 == 0) {
            if (tahun % 400 == 0) {
                System.out.println("Tahun Kabisat");
            } else {
                System.out.println("Bukan Tahun Kabisat");
            }
        } else if (tahun % 4 == 0) {
            System.out.println("Tahun Kabisat");
        } else {
            System.out.println("Bukan Tahun Kabisat");
        }
        absen02.close();
    }
}

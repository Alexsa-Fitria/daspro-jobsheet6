import java.util.Scanner;

public class Modifikasi2 {
    public static void main(String[] args) {
        Scanner absen02 = new Scanner(System.in);
        double total_bayar;
        double harga;
        double potonganQRIS = 1000;  
        System.out.println("_______________________");
        System.out.println("==== MENU KAFE JTI ====");
        System.out.println("_______________________");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Buding (Ricebowl + Ice Tea)");
        System.out.println("____________________________________");
        System.out.print("Masukkan angka dari menu yang anda pilih = ");
        byte pilihan_menu = absen02.nextByte();
        absen02.nextLine();  
        System.out.print("Apakah punya member (y/n) ? = ");
        String member = absen02.nextLine();
        System.out.println("____________________________________________");

        
        double diskon = 0.0;
        
        if (member.equals("y")) {
            diskon = 0.10;  
            System.out.println("Besar diskon = 10%");
        } else if (member.equals("n")) {
            System.out.println("Tidak ada diskon untuk non-member");
        } else {
            System.out.println("Input member tidak valid");
            return;  
        }

        if (pilihan_menu == 1) {
            harga = 14000;
            System.out.println("Harga Ricebowl = " + harga);
        } else if (pilihan_menu == 2) {
            harga = 3000;
            System.out.println("Harga Ice Tea = " + harga);
        } else if (pilihan_menu == 3) {
            harga = 15000;
            System.out.println("Harga Buding = " + harga);
        } else {
            System.out.println("Masukkan pilihan menu dengan benar");
            return;
        }


        total_bayar = harga - (harga * diskon);
        System.out.println("Total bayar setelah diskon = " + total_bayar);

        
        System.out.print("Metode pembayaran (1 = Cash, 2 = QRIS) = ");
        String metode_pembayaran = absen02.next();

        
        if (metode_pembayaran.equalsIgnoreCase("2")) {
            System.out.println("Anda menggunakan pembayaran melalui QRIS, potongan Rp.1.000 akan diterapkan.");
            total_bayar -= potonganQRIS;  
        }

        
        System.out.println("Total bayar setelah potongan QRIS = " + total_bayar);
        System.out.println("____________________________________________");
    }

}

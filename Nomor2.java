import java.util.Scanner;

public class Nomor2 {
    public static int hitungTotalHampersDanPacking(int hampers, int packing) {
        int[] hampersPrices = {150000, 175000, 200000};
        int[] packingPrices = {50000, 75000, 125000};

        if (hampers < 1 || hampers > 3) {
            throw new IllegalArgumentException("Pilihan hampers tidak valid.");
        }

        if (packing < 1 || packing > 3) {
            throw new IllegalArgumentException("Pilihan packing tidak valid.");
        }

        return hampersPrices[hampers - 1] + packingPrices[packing - 1];
    }

    public static double hitungTotalDenganPajak(int total) {
        return total + (total * 0.10);
    }
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int hampers = input.nextInt();
        int packing = input.nextInt();
        /* Pekerjaan anda mulai dari sini */
         int total = hitungTotalHampersDanPacking(hampers, packing);

        
        double totalWithTax = hitungTotalDenganPajak(total);

        System.out.println("Total yang harus dibayar: " + totalWithTax);

        /* Pekerjaan anda berakhir sini */

        System.out.println(Nomor2.class.getDeclaredMethods().length); 
    }
}

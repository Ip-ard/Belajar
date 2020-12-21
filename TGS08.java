
package tgs.pkg08;

import java.util.Scanner;

public class TGS08 {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        int jumlah, x, harga, total = 0, potongan, bayar;
        
        System.out.println("Latihan: Modif PenjumlahanBarang\n\nPENJUMLAHAN BARANG:\n");
        System.out.print("Masukkan Jumlah barang yang dibeli = ");
        jumlah = input.nextInt();
        for (x = 1; x <= jumlah; x++) {
            System.out.print("Harga barang yang Ke "+ x +" = ");
            harga = input.nextInt();
            total = total + harga;
        }
        System.out.println("===============================");
        System.out.println("Total Belanja anda     = "+ total);
        
        if (total >= 500000) {
            potongan = 50000;
        } else if (total >= 300000) {
            potongan = 15000;
        } else if (total >= 100000) {
            potongan = 5000;
        } else {
            potongan = 0;
        }
        System.out.println("Potongan harga sebesar = "+ potongan);
        System.out.println("-------------------------------");
        System.out.println("Total yang harus bayar = "+ (total - potongan));
        System.out.println("-------------------------------");
        System.out.print("Anda membayar sebesar  = ");
        bayar = input.nextInt();
        System.out.println("Jumlah kembalian       = "+ (bayar - (total - potongan)));
    }

}
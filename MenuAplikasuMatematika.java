
package tgs.pkg08;

import java.util.Scanner;

public class MenuAplikasuMatematika {

    public static void main(String[] args) {
        boolean isExit = false;
	Scanner scanner = new Scanner(System.in);
	do {
		System.out.println("========= Kalkulator Console =========");
		System.out.println("Menu : ");
		System.out.println("1. Penambahan");
		System.out.println("2. Pengurangan");
		System.out.println("3. Perkalian");
		System.out.println("4. Pembagian");
		System.out.println("5. Keluar");
		System.out.print("Pilih salah satu menu : ");
		int menuSelect = scanner.nextInt();
		if (menuSelect == 5) {
			isExit = true;
		} else {
			if (menuSelect == 1) { //Penambahan
				System.out.println("PENAMBAHAN ");
			} else if (menuSelect == 2) { //Pengurangan
				System.out.println("PENGURANGAN ");
			} else if (menuSelect == 3) { //Perkalian
				System.out.println("PERKALIAN ");
			} else if (menuSelect == 4) { //Pembagian
				System.out.println("PEMBAGIAN ");
			}
			
			System.out.print("Masukkan angka 1 : ");
			double value1 = scanner.nextDouble();
			System.out.print("Masukkan angka 2 : ");
			double value2 = scanner.nextDouble();
			
			double result = 0;
			
			if (menuSelect == 1) { //Penambahan
				result = value1 + value2;
			} else if (menuSelect == 2) { //Pengurangan
				result = value1 - value2;
			} else if (menuSelect == 3) { //Perkalian
				result = value1 * value2;
			} else if (menuSelect == 4) { //Pembagian
				result = value1 / value2;
			} 
			
			System.out.println("Hasil : " + result);
			System.out.print("Ketik 5 untuk keluar, ketik 0 untuk ke menu utama : ");
			menuSelect = scanner.nextInt();
			if (menuSelect == 5)
				isExit = true;
		}			
	} while (!isExit);
	scanner.close();
}
    }


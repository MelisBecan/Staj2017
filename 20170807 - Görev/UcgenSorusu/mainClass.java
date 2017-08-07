import java.util.InputMismatchException;
import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		int yukseklik = 1;

		Scanner ss = new Scanner(System.in);
		
		try {
			System.out.println("Yukseklik Degeri Giriniz: ");
			yukseklik = ss.nextInt() - 1;
		}
		catch(InputMismatchException e) {
			System.out.println("Hatali Giris");
			System.exit(0);
		}

		if(yukseklik==0) {
			System.out.println("Yukseklik 0 Olamaz.");
			System.exit(0);
		}else if(yukseklik<0) {
			System.out.println("Negatif Sayi Girilemez.");
			System.exit(0);
		} 
		
		for (int i = 0; i < yukseklik; i++) {
			if (i == 0) {
				for (int j = yukseklik; i < j; j--) {
					System.out.print(" ");
				}
				System.out.println("*");
				continue;
			}

			for (int j = yukseklik; i < j; j--) {
				System.out.print(" ");
			}

			System.out.print("*");

			for (int j = 0; j < i; j++) {
				System.out.print("  ");
			}
			System.out.println("*");

		}

		for (int i = yukseklik; i > 0; i--) {
			for (int j = yukseklik; i < j; j--) {
				System.out.print(" ");
			}
			System.out.print("*");

			for (int j = 0; j < i; j++) {
				System.out.print("  ");
			}
			System.out.println("*");

			if (i == 1) {
				for (int j = 0; j < yukseklik; j++) {
					System.out.print(" ");
				}
				System.out.println("*");
				break;
			}
		}
	}

}

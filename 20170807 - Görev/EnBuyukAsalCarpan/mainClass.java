import java.util.Scanner;

public class mainClass {
	static long max = 0;
	static long sayi;
	static long denemesayisi = 0;

	public static void isAsal(long z) {
		long sayac = 0;
		for (long x = z; x > 1; x--) {
			if (z % x == 0) {
				sayac++;
			}
		}
		if (sayac < 2) {
			if (z != sayi) {
				max = z;
			}
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Bir Sayi Giriniz: ");
		sayi = input.nextLong();

		for (long i = 1; i <= sayi; i++) {
			if (sayi % i == 0) {
				isAsal(i);
				denemesayisi++;
			}
		}
		System.out.println(max);
		System.out.println("Deneme -->" + denemesayisi);
	}
}

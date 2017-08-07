import java.util.Scanner;

public class mainClass {
	static int max = 0;
	static int sayi;

	public static void isAsal(int z) {
		int sayac = 0;
		for (int x = z; x > 1; x--) {
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
		sayi = input.nextInt();

		for (int i = 1; i <= sayi; i++) {
			if (sayi % i == 0) {
				isAsal(i);
			}
		}
		System.err.println(max);
	}
}
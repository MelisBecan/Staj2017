import java.util.Scanner;

public class mainClass {

	public static int isAsal(int z) {
		int sayac = 0;
		for (int x = z; x > 1; x--) {
			if (z % x == 0) {
				sayac++;
			}
		}
		return sayac;
	}

	public static void main(String[] args) {
		int sayi;
		Scanner input = new Scanner(System.in);
		System.out.println("Bir Sayi Giriniz: ");
		sayi = input.nextInt();

		for (int i = 1; i <= sayi; i++) {
			if (sayi % i == 0) {
				if(isAsal(i)<=2) {
					System.out.println("Asal Sayi: " + i);
				}
			}
		}
	}
}

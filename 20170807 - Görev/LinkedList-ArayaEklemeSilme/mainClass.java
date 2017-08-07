import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {

		int secim;
		ListClass liste = new ListClass();
		Scanner s = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		Scanner s3 = new Scanner(System.in);
		Scanner s4 = new Scanner(System.in);

		System.out.println("1- Veri Girisi");
		System.out.println("2- Veri Listele");
		System.out.println("3- Veri Sil");
		System.out.println("4- Araya Ekle");
		System.out.println("5- Cikis");

		secim = s.nextInt();

		while (secim != 5) {
			switch (secim) {
			case 1:
				System.out.println("Isim Girin: ");
				String ad = s2.nextLine();
				liste.veriekle(ad);
				break;
			case 2:
				liste.listele();
				break;
			case 3:
				System.out.println("Silinecek Isim Girin: ");
				String silinecek = s3.nextLine();
				liste.sil(silinecek);
				break;
			case 4:
				System.out.println("Hangi kayýttan sonra eklenecek: ");
				String arayaekle = s4.nextLine();
				
				System.out.println("Hangi kayýttan sonra eklenecek: ");
				//String arayaekle = s4.nextLine();
				liste.arayaekle(arayaekle);
				break;
			default:
				System.out.println("Yanlis Secim!");
				break;
			}

			System.out.println("1- Veri Girisi");
			System.out.println("2- Veri Listele");
			System.out.println("3- Veri Sil");
			System.out.println("4- Cikis");
			secim = s.nextInt();
		}
		System.out.println("Program Bitti!");
	}
}

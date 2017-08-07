import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {

		int secim, sayac = 0;
		ListClass liste = new ListClass();
		Scanner s = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		Scanner s3 = new Scanner(System.in);
		Scanner s4 = new Scanner(System.in);
		Scanner s5 = new Scanner(System.in);
		Scanner s6 = new Scanner(System.in);

		System.out.println("1- Veri Girisi");
		System.out.println("2- Veri Listele");
		System.out.println("3- Veri Sil");
		System.out.println("4- Araya Ekle");
		System.out.println("5- Secilen Kaydi Getir");
		System.out.println("6- Cikis");

		secim = s.nextInt();

		while (secim != 6) {
			switch (secim) {
			case 1:
				System.out.println("Isim Girin: ");
				String ad = s2.nextLine();
				liste.veriekle(ad);
				sayac++;
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
				System.out.println("Hangi Kayýttan Sonra Eklenecek: ");
				String hangikayit = s4.nextLine();

				System.out.println("Araya Eklenecek Isim Girin: ");
				String arayaekle = s5.nextLine();
				liste.arayaekle(hangikayit, arayaekle);
				break;
			case 5:
				System.out.printf("Listede %d eleman var. Hangi Kayit Getirilsin: ", sayac);
				String kayitgetir = s6.nextLine();
				liste.kayitgetir(kayitgetir);
				break;
			default:
				System.out.println("Yanlis Secim!");
				break;
			}

			System.out.println("1- Veri Girisi");
			System.out.println("2- Veri Listele");
			System.out.println("3- Veri Sil");
			System.out.println("4- Araya Ekle");
			System.out.println("5- Secilen Kaydi Getir");
			System.out.println("6- Cikis");
			secim = s.nextInt();
		}
		System.out.println("Program Bitti!");
	}
}

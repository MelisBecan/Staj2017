import java.io.Console;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.CloseAction;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

public class mainClass {

	public static void main(String[] args) {

		int secim;
		ListClass liste = new ListClass();
		Scanner s = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		Scanner s3 = new Scanner(System.in);

		System.out.println("1- Veri Giri�i");
		System.out.println("2- Veri Listele");
		System.out.println("3- Veri Sil");
		System.out.println("4- ��k��");

		secim = s.nextInt();

		while (secim != 4) {
			switch (secim) {
			case 1:
				System.out.println("�sim Girin: ");
				String ad = s2.nextLine();
				liste.veriekle(ad);
				break;
			case 2:
				liste.listele();
				break;
			case 3:
				System.out.println("Silinecek �sim Girin: ");
				String silinecek = s3.nextLine();
				liste.sil(silinecek);
				break;
			default:
				System.out.println("Yanl�� Se�im!");
				break;
			}

			System.out.println("1- Veri Giri�i");
			System.out.println("2- Veri Listele");
			System.out.println("3- Veri Sil");
			System.out.println("4- ��k��");
			secim = s.nextInt();
		}
		System.out.println("Program Bitti!");
	}
}

import java.util.Scanner;

public class HataAyiklama {
		
	public static void main(String args[]){
			
		Scanner input = new Scanner(System.in);

		System.out.print("Birinci Sayi: ");
		int sayi1=input.nextInt();
		System.out.print("Ikinci Sayi: ");
		int sayi2=input.nextInt();
		
		try{
			if(sayi2>=0){
				System.out.println("Sonuç -> " + sayi1/sayi2);
				}
			else {
				throw new ArithmeticException();
			}
		}
		catch(ArithmeticException a){
			System.out.println("Matematiksel Bir Hata Oluştu -> " + a.getMessage());
		}
	}
}
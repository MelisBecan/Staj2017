import java.util.Scanner;

public class HataAyiklama {
	public static int sayi1=0;
	public static int sayi2=0;
	
	public static void hesapla() throws ArithmeticException{
		if(sayi2>=0){
			System.out.println("Sonuç -> " + sayi1/sayi2);
			}
		else {
			throw new ArithmeticException();
		}
	}
	
	public static void main(String args[]) {
			
		Scanner input = new Scanner(System.in);

		System.out.print("Birinci Sayi: ");
		sayi1=input.nextInt();
		System.out.print("Ikinci Sayi: ");
		sayi2=input.nextInt();
		
		try{
			hesapla();
		}
		catch(ArithmeticException a){
			System.out.println("Matematiksel Bir Hata Oluştu -> " + a.getMessage());
		}
		
	}
}
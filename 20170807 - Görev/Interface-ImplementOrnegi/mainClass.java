package interfaceDenemesi;

public class mainClass {

	public static void main(String[] args) {
		Araclar araba1 = new Araba();
		Araclar traktor1 = new Traktor();
		Araclar kamyon1 = new Kamyon();
		
		
		System.out.println("Arabanýn Özellikleri -> ");
		System.out.println("TS: " + araba1.TekerlekSayisi() + " " + "MG: " + 
			araba1.MotorGucu() + " " + "R: " + araba1.Renk() + "\n");
		
		System.out.println("Traktorun Özellikleri -> ");
		System.out.println("TS: " + traktor1.TekerlekSayisi() + " " + "MG: " + traktor1.MotorGucu() + " " + "R: " + traktor1.Renk() + "\n");
		
		System.out.println("Kamyonun Özellikleri -> ");
		System.out.println("TS: " + kamyon1.TekerlekSayisi() + " " + "MG: " + kamyon1.MotorGucu() + " " + "R: " + kamyon1.Renk() + "\n");
	}

}

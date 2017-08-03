
public class Otomobil {
	
	public static void main(String[] args) {
		Arac araba1=new Arac();
		Arac araba2=new Arac();
		Arac araba3=new Arac();
		Arac araba4=new Arac();
		
		araba1.setMarka("Mercedes");
		araba1.setModel("A180");
		araba1.setRenk("Kırmızı");
		
		araba2.setMarka("Volkswagen");
		araba2.setModel("Golf");
		araba2.setBeygir("105");
		
		araba3.setMarka("Volkswagen");
		araba3.setModel("Polo");
		araba3.setRenk("Beyaz");
		araba3.setYakit("Dizel");
		
		araba4.setMarka("Audi");
		araba4.setModel("A3");
		araba4.setDurum("2.el");
		
		Arac[] s = new Arac[6];
		s[0]=araba1;
		s[1]=araba2;
		s[2]=araba3;
		s[3]=araba4;
		
		for(int i=0;i<4;i++) {
			System.out.println(s[i].toString());
		}
		
	}

}

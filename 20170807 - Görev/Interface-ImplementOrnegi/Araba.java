package interfaceDenemesi;

public class Araba implements Araclar {

	@Override
	public int TekerlekSayisi() {
		int tekerlek=4;
		return tekerlek;
	}

	@Override
	public int MotorGucu() {
		int mtrgc=500;
		return mtrgc;
	}
	
	@Override
	public String Renk() {
		String renk="Sarı";
		return renk;
	}

}
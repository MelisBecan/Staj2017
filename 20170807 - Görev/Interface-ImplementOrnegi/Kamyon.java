package interfaceDenemesi;

public class Kamyon implements Araclar {

	@Override
	public int TekerlekSayisi() {
		int tekerlek=10;
		return tekerlek;
	}

	@Override
	public int MotorGucu() {
		int mtrgc=300;
		return mtrgc;
	}
	
	@Override
	public String Renk() {
		String renk="Siyah";
		return renk;
	}
}

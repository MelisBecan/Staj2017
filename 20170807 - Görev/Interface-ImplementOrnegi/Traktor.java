package interfaceDenemesi;

public class Traktor implements Araclar {

	@Override
	public int TekerlekSayisi() {
		int tekerlek=4;
		return tekerlek;
	}

	@Override
	public int MotorGucu() {
		int mtrgc=200;
		return mtrgc;
	}
	
	@Override
	public String Renk() {
		String renk="Kýrmýzý";
		return renk;
	}
}

public class Arac{
	String marka;
	String model;
	String renk;
	String yakit;
	String durum;
	String beygir;
	
	public Arac() {
		
	}
	
	public String toString() {
		String genel="";
		if(this.marka!=null) { genel+=this.marka + " "; }
		if(this.model!=null) { genel+=this.model + " "; }
		if(this.renk!=null) { genel+=this.renk + " "; }
		if(this.yakit!=null) { genel+=this.yakit + " "; }
		if(this.beygir!=null) { genel+=this.beygir + " "; }
		if(this.durum!=null) { genel+=this.durum + " "; }

		return genel;
	}
	
	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getRenk() {
		return renk;
	}
	public void setRenk(String renk) {
		this.renk = renk;
	}
	public String getYakit() {
		return yakit;
	}
	public void setYakit(String yakit) {
		this.yakit = yakit;
	}
	public String getDurum() {
		return durum;
	}
	public void setDurum(String durum) {
		this.durum = durum;
	}
	public String getBeygir() {
		return beygir;
	}
	public void setBeygir(String beygir) {
		this.beygir = beygir;
	}
	public static void add(Arac araba1) {
		// TODO Auto-generated method stub
		
	}
	

}
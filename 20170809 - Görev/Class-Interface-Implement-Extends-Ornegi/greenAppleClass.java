
public class greenAppleClass extends appleClass {

	public String getTaste() {
		return "sour";
	}

	public String getName() {
		return "Sour " + this.getClass().getName();
	}

}

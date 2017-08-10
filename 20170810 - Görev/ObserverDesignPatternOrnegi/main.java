import java.util.ArrayList;

public class main {

	public static void main(String[] args) {

		Piramit p = new Piramit();
		Kure k = new Kure();
		Kup kp = new Kup();

		System.out.println("Observer");
		ArrayList<Shape> observerList = new ArrayList<Shape>();
		observerList.add(p);
		observerList.add(k);
		observerList.add(kp);

		for (int i = 0; i < observerList.size(); i++) {
			Shape o = observerList.get(i);
			o.yuzeyAlaniHesapla();
		}

		// ArrayList<Object> liste = new ArrayList<Object>();
		// liste.add(p);
		// liste.add(k);
		// liste.add(kp);
		// for (int i = 0; i < liste.size(); i++) {
		// Object o = liste.get(i);
		// if (o instanceof Kure) {
		// System.out.println("Kure");
		// Kure o1 = (Kure) o; // Class casting
		// o1.yuzeyAlaniHesapla();
		// } else if (o instanceof Kup) {
		// System.out.println("Kup");
		// Kup o1 = (Kup) o;
		// o1.yuzeyAlaniHesapla();
		// } else if (o instanceof Piramit) {
		// System.out.println("Piramit");
		// Piramit o1 = (Piramit) o;
		// o1.yuzeyAlaniHesapla();
		// }
		// }
	}

}
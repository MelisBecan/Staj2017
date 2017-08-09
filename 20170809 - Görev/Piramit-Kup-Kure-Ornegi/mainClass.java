import java.util.ArrayList;

public class mainClass {
	public static void main(String[] args) {
		ArrayList<Object> liste = new ArrayList<Object>();

		Kup k = new Kup(1);
		Piramit p = new Piramit(1);
		kure kur = new kure(1);

		liste.add(k);
		liste.add(p);
		liste.add(kur);

		for (int i = 0; i < liste.size(); i++) {
			Object o = liste.get(i);
			if(o instanceof Kup) {
				System.out.println("Kupun Hacmi: " + "Hacim Hesaplandı. Sınıf -> " + liste.get(i).getClass().getName());
			} else if (o instanceof Piramit) {
				System.out.println("Piramit Hacmi: " + "Hacim Hesaplandı. Sınıf -> " + liste.get(i).getClass().getName());
			} else if (o instanceof kure) {
				System.out.println("Kurenin Hacmi: " + "Hacim Hesaplandı. Sınıf -> " + liste.get(i).getClass().getName());
			}
			
//			if (liste.get(i).getClass().getName() == "Kup") {
//				System.out.println("Kupun Hacmi: " + "Hacim Hesaplandı. Sınıf -> " + liste.get(i).getClass().getName());
//			} else if (liste.get(i).getClass().getName() == "Piramit") {
//				System.out.println("Piramit Hacmi: " + "Hacim Hesaplandı. Sınıf -> " + liste.get(i).getClass().getName());
//			} else if (liste.get(i).getClass().getName() == "kure") {
//				System.out.println("Kurenin Hacmi: " + "Hacim Hesaplandı. Sınıf -> " + liste.get(i).getClass().getName());
//			}
		}
	}
}
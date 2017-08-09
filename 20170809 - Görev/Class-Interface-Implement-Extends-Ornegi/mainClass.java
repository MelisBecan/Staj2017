
public class mainClass {

	public static void main(String[] args) {
		greenAppleClass yesilelma = new greenAppleClass();
		System.out.println(yesilelma.getTaste());
		System.out.println(yesilelma.getName());
		plantIMPLClass yeniclass = new plantIMPLClass();

		redAppleClass kirmizielma = new redAppleClass();
		plantIMPLClass peelcek = new plantIMPLClass();
		// System.out.println(kirmizielma.peel());
		fruitClass plant = new fruitClass();

		fruitClass meyve = new fruitClass();
		appleClass elma = new appleClass();
		greenAppleClass gelma = new greenAppleClass();
		// meyve.peel();
		// meyve.setName("Elma");
		// System.out.println(meyve.name);

		// System.out.println("Peel---->" + peelcek.peel());
		System.out.println("---->" + yeniclass.isColoured());
		System.out.println("---->" + kirmizielma.isColoured());

		vegetableClass sebze2 = new vegetableClass();
		sebze2.setName("Patlican");
		System.out.println(sebze2.getName());

		tomatoesClass domates = new tomatoesClass();
		System.out.println(domates.getName());

		System.out.println(domates.getSeedCount());

		goldenAppleClass a1 = new goldenAppleClass();
		System.out.println(a1.getName());

//		redAppleClass b1 = new redAppleClass();
//		b1.peel();

		redAppleClass.peel();
	}
}

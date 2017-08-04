
public class mainClass {

	public static void main(String[] args) {
		// case1();
		case2();
	}

	public static void case1() {

		int kazandi = 0, kaybetti = 0;
		for (int i = 0; i < 100000; i++) {

			Audience a = new Audience();
			Stage s = new Stage();

			if (s.getReward() == a.getChoice()) {
				System.out.println("Kazandýn!");
				kazandi++;
			} else {
				System.out.println("Kaybettin :(");
				kaybetti++;
			}
		}

		System.out.printf("%d kere kazandi. %d kere kaybetti.", kazandi, kaybetti);

	}

	public static void case2() {
		Stage s = new Stage();
		s.getNoReward(1);
	}
}

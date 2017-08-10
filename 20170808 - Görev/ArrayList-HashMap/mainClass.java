import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class mainClass {

	public static void main(String[] args) {
		String[] dizi1 = { "a", "b", "c" };
		int[] dizi2 = { 1, 2, 3, 5 };
		String[] dizi3 = { "Mazhar", "Fuat", "Özkan" };
		int[] dizi4 = new int[dizi2.length];

		ArrayList<String> Dizi = new ArrayList<String>();

		for (int i = 0; i < 3; i++) {
			Dizi.add(dizi1[i]);
		}

		System.out.println("ArrayList --> " + Dizi.get(0) + "," + Dizi.get(1) + "," + Dizi.get(2));

		System.out.println("---------------------");

		int k = dizi2.length - 1;

		for (int j = 0; j < dizi2.length; j++) {
			dizi4[j] = dizi2[k];
			k--;
		}

		k = 0;

		for (int j = 0; j < dizi2.length; j++) {
			dizi2[j] = dizi4[k];
			k++;
		}

		System.out.println("k dizisi --> " + dizi2[0] + "," + dizi2[1] + "," + dizi2[2] + "," + dizi2[3]);

		System.out.println("---------------------");

		HashMap<String, Object> yenihashmap = new HashMap<String, Object>();
		Object o = new Object();
		
		yenihashmap.put("harfler", dizi1);
		yenihashmap.put("sayilar", dizi2);
		yenihashmap.put("ustalar", dizi3);

		for (Map.Entry gosterici : yenihashmap.entrySet()) {
			System.out.println(gosterici.getKey() + " " + gosterici.getValue());
		}
	}
}

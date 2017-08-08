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

		HashMap<String, String> yenihashmap = new HashMap<String, String>();
		
		yenihashmap.put("harfler1", dizi1[0]);
		yenihashmap.put("harfler2", dizi1[1]);
		yenihashmap.put("harfler3", dizi1[2]);

		yenihashmap.put("sayilar1", String.valueOf(dizi2[0]));
		yenihashmap.put("sayilar2", String.valueOf(dizi2[1]));
		yenihashmap.put("sayilar3", String.valueOf(dizi2[2]));
		yenihashmap.put("sayilar4", String.valueOf(dizi2[3]));

		yenihashmap.put("ustalar1", dizi3[0]);
		yenihashmap.put("ustalar2", dizi3[1]);
		yenihashmap.put("ustalar3", dizi3[2]);

		for (Map.Entry gosterici : yenihashmap.entrySet()) {
			System.out.println(gosterici.getKey() + " " + gosterici.getValue());
		}
	}
}

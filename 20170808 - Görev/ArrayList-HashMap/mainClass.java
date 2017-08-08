import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

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

		HashSet<String> yenilist = new HashSet<String>();
		
		yenilist.add("harfler");
		yenilist.add("sayilar");
		yenilist.add("ustalar");
		
		Iterator<String> gosterici = yenilist.iterator();

		while(gosterici.hasNext()) {
			   System.out.println(gosterici.next());  
		}
		
		
		
	}
}

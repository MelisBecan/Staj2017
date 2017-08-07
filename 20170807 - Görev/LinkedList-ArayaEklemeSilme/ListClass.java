
public class ListClass {
	NodeClass head = new NodeClass();
	NodeClass temp = new NodeClass();
	NodeClass bironceki = new NodeClass();

	public void veriekle(String ss) {
		if (head.getIsim() == null) {
			head.setIsim(ss);
			head.setNext(null);
		} else {
			NodeClass temp2 = new NodeClass();

			temp2.setIsim(ss);
			temp2.setNext(head);
			head = temp2;
		}
		System.out.println("eklendi");
	}

	public void listele() {
		if (head.getIsim() == null) {
			System.out.println("liste bos");
			return;
		} else {
			System.out.println("Liste: ");
			temp = head;
			while (temp.getNext() != null) {
				System.out.println(temp.getIsim());
				temp = temp.getNext();
			}
			System.out.println(temp.getIsim());
		}
	}

	public void sil(String silin) {
		temp = head;
		while (!temp.getIsim().equals(silin)) {
			bironceki = temp;
			temp = temp.getNext();
		}
		bironceki.setNext(temp.getNext());
		System.out.println("Silindi");
	}

	public void arayaekle(String hangikayit, String arayaekle) {
		temp = head;
		NodeClass temp3 = new NodeClass();
		while (!temp.getIsim().equals(hangikayit)) {
			bironceki = temp;
			temp = temp.getNext();
		}
		temp3.setIsim(arayaekle);
		bironceki.setNext(temp3);
		temp3.setNext(temp);
		System.out.println("Araya Eklendi");
	}

	public void kayitgetir(String kayitgetir) {
		temp = head;
		for (int i = 1; i < Integer.parseInt(kayitgetir); i++) {
			temp = temp.getNext();
		}
		System.out.println("Getirilen Kayit: " + temp.getIsim());
	}
}

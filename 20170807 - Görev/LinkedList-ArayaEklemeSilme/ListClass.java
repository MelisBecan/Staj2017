
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
		while (!temp.getIsim().equals(silin) ) {			
			bironceki = temp;
			temp = temp.getNext();
		}
		bironceki.setNext(temp.getNext());
		System.out.println("Silindi");
	}
	
	public void arayaekle(String arayaekle) {
		temp = head;
		while (!temp.getIsim().equals(arayaekle) ) {			
			bironceki = temp;
			temp = temp.getNext();
		}
		bironceki.setNext(temp.getNext());
		System.out.println("Silindi");
	}
}

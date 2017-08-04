
public class Liste {
	Node head = new Node();
	Node temp = new Node();



	public void ekle(String ss) {
		
		temp.setIsim(ss);
		temp.setNext(head);
		head=temp;
		
		if (head == null) {
			head.setIsim(ss);
			head.setNext(null);
		} else {
			while (temp.getNext() != null) {
				temp = temp.getNext();
			}
			temp.setIsim(ss);
			temp.setNext(null);
		}
	}

	public void listele() {
		if (head == null) {
			System.out.println("liste boþ");
			return;
		}

		System.out.println("Liste: ");
		System.out.println(head.getIsim());
		Node temp = head.getNext();
		while (temp != null) {
			System.out.println(temp);
			temp = temp.getNext();
		}
	}
}

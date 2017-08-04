
public class Node {

	String isim;
	Node next;
	Node temp;
	
	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public void ekle(Node yeniNode) {
		if (next == null) {
			next = yeniNode;
		} else {
			next.ekle(yeniNode);
		}
	}

	public void listeleNext() {
		System.out.println(this.getIsim());
		if (next != null) {
			next.listeleNext();
		}
	}

	public void listelePrevious() {
		System.out.println(this.getIsim());
		if (next.getIsim() != "Ali") {
			next.listelePrevious();
		}
	}
	
	public void listeSil() {
		while(next.getIsim()!="Berkay") {
			temp=next;
			next=next.getNext();
		}
		temp.setNext(next.getNext());
		System.out.println("Uður Silindi.");
	}
}

public class mainClass {

	public static void main(String[] args) {
		Node s=new Node();
		s.setIsim("Samet");
		
		Node s2=new Node();
		s2.setIsim("Uður");
		
		Node s3=new Node();
		s3.setIsim("Berkay");
		
		Node s4=new Node();
		s4.setIsim("Ali");
		
		s.ekle(s2);
		s.ekle(s3);
		s.ekle(s4);

		s.listeleNext();
		System.out.println("-----------");
		s.listelePrevious();
		System.out.println("-----------");
		s.listeSil();
		System.out.println("-----");
		s.listeleNext();
		
	}
}

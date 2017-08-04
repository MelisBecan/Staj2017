import java.util.Random;

public class Audience {

	int choice,choice2,sunucu;
	
	public Audience() {
		Random rnd2=new Random();
		choice=rnd2.nextInt(3);
		
		choice2=rnd2.nextInt(2);
		sunucu=rnd2.nextInt(3);
	}

	public int getChoice() {
		return choice;
	}

	public void setChoice(int choice) {
		this.choice = choice;
	}

}

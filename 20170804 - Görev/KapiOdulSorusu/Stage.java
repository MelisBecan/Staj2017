import java.util.Random;

public class Stage {

	private int[] gates = {0,0,0};
	public static Random rnd=new Random();
	public static Audience b=new Audience();
	
	public Stage() {
		int reward = rnd.nextInt(3);
		gates[reward]=1;
		System.out.println("Rew" + reward);
	}

	public int getReward() {
		int result = 0;
		if (gates [0] == 1) result = 1;
		if (gates [1] == 1) result = 2;
		if (gates [2] == 1) result = 3;
		return result;
	}

	public int getNoReward(int choice) {
		int[] noReward = new int[2];
		int reward = getReward() ;
		
		int noRewardIndex = 0;
		for (int i=1; i<=3;i++) {
			if ( i == reward ) {
				continue;
			} else {
				noReward[noRewardIndex] = i;
				System.out.println("norew" + i);
				noRewardIndex++;
			}
		}
		System.out.println(noReward.toString());
		return 0;
	}

	public int[] getGates() {
		return gates;
	}

	public void setGates(int[] gates) {
		this.gates = gates;
	}

}
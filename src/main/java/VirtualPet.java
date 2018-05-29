
public class VirtualPet {
	
	 int startingThirst= 0;
	 int startingHunger= 0;
	 int startingEnergy = 0;
	
	public VirtualPet(int thirst, int hunger, int energy) {
    startingThirst = thirst;
    startingHunger = hunger;
    startingEnergy = energy;

	}

	public int giveWater() {
		startingThirst+=10;
		return startingThirst;
	}

	public int giveFood() {
		startingHunger+=10;
		return startingHunger;
	}

	public int giveSleep() {
		startingEnergy+=10;
		return startingEnergy;
	}

	public int losesThirst() {
		startingThirst-=10;
		return startingThirst;
	}

	public int losesHunger() {
		startingHunger-=10;
		return startingHunger;
	}

	public int losesEnergy() {
		startingEnergy-=10;
		return startingEnergy;
	}

	public int lostThirst() {
		startingThirst-=5;
		return startingThirst;
	}

	public int lostHunger() {
		startingHunger-=5;
		return startingHunger;
	}

	public int lostEnergy() {
		startingEnergy-=5;
		return startingEnergy;
	}
	
	
}
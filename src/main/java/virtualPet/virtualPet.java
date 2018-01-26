package virtualPet;

public class virtualPet {
	// default stats
	private int health = 100;
	private int hunger = 0;
	private int boredom = 0;
	private int thirst = 0;
	private int waste = 0;

	public void tickIncrease() {
		health -= 1;
		hunger += 1;
		boredom += 5;
		thirst -= 1;
		waste += 3;
	}
	
	public void giveTreat() {
		thirst-=3;
		hunger+=1;
		health-=2;
		waste=+5;
	}
	
	public void play() {
		hunger+=10;
		health+=5;
		boredom-=15;
	}
	
	public void giveWater() {
		hunger-=3;
		thirst-=15;
		boredom=+1;
		waste=+3;
	}
	
	public void giveFood() {
		hunger-=10;
		health-=2;
		thirst=+3;
		waste=+5;
	}
	
	public int checkWaste() {
		return waste/10; 
	}

	/*public void virtualPet() {
		health = 100;
		hunger = 0;
	}
*/
	public int getHealth() {
		return health;
	}

	public int getHunger() {
		return hunger;
	}

	public int getBoredom() {
		return boredom;
	}

	public int getThirst() {
		return thirst;
	}

	public int getWaste() {
		return waste;
	}
	
	public void getStats() {
		System.out.println("Your pet's current stats are: ");
		System.out.println("Hunger: " + this.getHunger());
		System.out.println("Health: " + this.getHealth());
		System.out.println("Thirst: " + this.getThirst());
		System.out.println("Waste: " + this.checkWaste());
	}
}

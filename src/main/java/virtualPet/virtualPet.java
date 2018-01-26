package virtualPet;

public class virtualPet {
	// default stats
	private int health = 100;
	private int hunger = 0;
	private int boredom = 0;
	private int thirst = 0;
	private int waste = 0;
	String name;

	public String setName(String nameInput) {
		return name = nameInput;
	}

	public void checkStats() {
		if (this.health > 100) {
			this.health = 100;
		}
		if (this.hunger <= 0) {
			this.hunger = 0;
		}
		if (this.boredom <= 0) {
			this.boredom = 0;
		}
		if (this.thirst <= 0) {
			this.thirst = 0;
		}
		if (this.waste <= 0) {
			this.waste = 0;
		}
	}

	public void tickIncrease() {
		health -= 1;
		hunger += 1;
		boredom += 5;
		thirst -= 1;
		waste += 3;
		this.checkStats();
	}

	public void giveTreat() {
		thirst += 3;
		hunger -= 1;
		health -= 2;
		waste += 5;
		this.checkStats();
	}

	public void play() {
		hunger += 10;
		health += 5;
		boredom -= 10;
		thirst += 10;
		this.checkStats();
	}

	public void giveWater() {
		hunger -= 3;
		thirst -= 15;
		boredom += 5;
		waste += 3;
		this.checkStats();
	}

	public void giveFood() {
		hunger -= 10;
		health -= 2;
		thirst += 3;
		waste += 5;
		this.checkStats();
	}

	// getters
	public int checkWaste() {
		return waste / 10;
	}

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

	public void cleanUp() {
		waste -= 20;
		boredom += 3;
		
	}
	
	public String getStats() {
		return "Hunger: " +this.getHunger()+"\nHealth: "+this.getHealth()+"\nThirst: "+this.getThirst()+"\nWaste: "+this.checkWaste(); 
		
	}

}

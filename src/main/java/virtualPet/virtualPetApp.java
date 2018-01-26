package virtualPet;

import java.util.Scanner;

public class virtualPetApp {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		virtualPet pet = new virtualPet();
		int tick = 0;
		String userResponse = "";
		System.out.println("Welcome to your all new virtual pet!");
		System.out.println("Your pet's current stats are: ");
		pet.getStats();

		while (!userResponse.equalsIgnoreCase("quit")) {
			System.out.println("Current tick: " + tick);

			System.out.println("What would you like to do? Your options are:"
					+ "\n1. Feed \n2. Give water \n3. Play \n4. Clean Up \n5. Get Status");
			userResponse = input.nextLine().toLowerCase();

			if (userResponse.equals("1") || (userResponse.equals("feed"))) {
				System.out.println("How much would you like to feed him?");
				System.out.println("1. Treat");
				System.out.println("2. Fill food bowl");
				userResponse = input.nextLine().toLowerCase();

				if (userResponse.equals("1") || (userResponse.equals("Treat"))) {
					pet.giveTreat();
				} else {
					pet.giveFood();
				}
			}

			if (userResponse.equals("2")) {
				pet.giveWater();
				pet.checkStats();
			}

			if (userResponse.equals("3")) {
				pet.play();
				pet.checkStats();

			}

			if (userResponse.equals("4")) {
				pet.cleanUp();
				pet.checkStats();

			}

			if (userResponse.equals("5")) {
				System.out.println(pet.getStats());

			}
			tick++;
			pet.getStats();
		}

		System.out.println("End of day status:");
		pet.getStats();
		System.out.println("Good bye forever.");
		System.exit(0);

	}
}

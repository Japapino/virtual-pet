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

		while (!userResponse.equalsIgnoreCase("quit")) {

			System.out.println("What would you like to do? Your options are:"
					+ "\n1. Feed \n2. Give water \n3. Play \n4.Clean Up \n5. Get Status");
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
			
			if (userResponse.equals("5")) {
				pet.getStats();
			}
			
			
			

		}

	}
}

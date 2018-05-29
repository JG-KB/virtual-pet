import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {
		VirtualPet Bite = new VirtualPet(100, 100, 100);
		Scanner input = new Scanner(System.in);
		System.out.println(
				" I'm Bite the GiGa Monster! \n My world is very harsh and only the most adaptable live longer! \n You can perform one action per turn but beware, after each turn I will lose 10 points to my thirst, hunger and energy due to the harsh days of my world. \n If i reach zero or below zero in any of those 3 I will die. \n How many actions can you do? Keep track of your number for your personal best!");
		while (Bite.startingThirst >= 0 || Bite.startingHunger >= 0 || Bite.startingEnergy >= 0) {
			System.out.println("Bite the GiGa Monster's Thirst: " + Bite.startingThirst);
			System.out.print("\n");
			System.out.println("Bite the GiGa Monster's Hunger: " + Bite.startingHunger);
			System.out.print("\n");
			System.out.println("Bite the GiGa Monster's Energy: " + Bite.startingEnergy);
			System.out.print("\n");
			System.out.println("Please do an action with your Pet:");
			System.out.print("\n");
			System.out.println("Press 1 to give water to your Pet. ");
			System.out.print("\n");
			System.out.println("Press 2 to give food to your Pet. ");
			System.out.print("\n");
			System.out.println("Press 3 to tell your Pet to sleep.");
			System.out.print("\n");
			// System.out.println("Press 4 to do nothing.");
			// System.out.print("\n");
			String userAction = input.nextLine();

			if (userAction.equals("1")) {
				Bite.giveWater();
				System.out.println(" You gave water to Bite.");
				System.out.print("\n");
			} else if (userAction.equals("2")) {
				Bite.giveFood();
				System.out.println(" You gave food to Bite.");
				System.out.print("\n");
			} else if (userAction.equals("3")) {
				Bite.giveSleep();
				System.out.println(" You told Bite to rest.");
				System.out.print("\n");
				// } else if (userAction.equals("4")) {
				// Bite.lostThirst();
				// Bite.lostHunger();
				// Bite.lostEnergy();
				// System.out.println(" Your pet's thirst, hunger and energy have decreased by 5
				// for doing nothing!");
			}
			if (Bite.startingThirst <= 0 || Bite.startingHunger <= 0 || Bite.startingEnergy <= 0) {
				System.out.println(
						" Your Pet has died because it's thirst, hunger or energy level had reached zero or lower! Sorry please try again!");
			}
			Bite.losesThirst();
			Bite.losesHunger();
			Bite.losesEnergy();

		}
	}

}

package lab2;

import java.util.Scanner;

public class Adventure {

	public static void main(String[] args) {

		System.out.println("Hello and welcome to a crazy world. "
				+ "Please choose a door, pink or blue: ");
		Scanner Keyboard = new Scanner(System.in);
		String door = Keyboard.nextLine();
		System.out.println(door);

		if (door.equals("pink")) {
			System.out
					.println("You are in a garden full of rabbits and hedgehogs.");
			System.out.println("now choose an animal: ");
			String animal = Keyboard.nextLine();

			if (animal.equals("rabbit")) {
				System.out.println("You are a lucky rabbit owner now!");
				System.out.println("END");
			} else {
				System.out.print("Sorry no pet for you!");
				System.out.println("Try again...");

			}

		}
		if (door.equals("blue")) {
			System.out.print("Hmmmm what time is tea time?:  ");
			String tt = Keyboard.nextLine();
			System.out.println(tt);

			int userIn = Integer.parseInt(tt);

			if (userIn > 5 && userIn < 10) {
				for (int i = 0; i < userIn; i++) {
					System.out.println("Welcome to a never ending tea party!");
				}

			}

		}
	}
}

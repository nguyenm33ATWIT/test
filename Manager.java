package PackageThing;

import java.util.Scanner;

public final class Manager {
	private static int DEFAULT_PIN = 0000;
	public static int pin;

	/**
	 * changes manager Pin
	 * @param Scanner to read new pin
	 * @return true if successful, false otherwise
	 */
	public static boolean changePin(Scanner input) {
		System.out.println("Enter Pin:");
		int oldPin = input.nextInt();
		if(oldPin == pin) {
			System.out.println("Enter new Pin:");
			pin = CoffeeShop.getInt(input);
			return true;
		} else {
			System.out.println("Pin is incorrect");
			return false;
		}
	}
	/**
	 * adds item to menu
	 * @param newitem
	 */
	 public static void addItem(Scanner input) {
		 System.out.println("Name of Item: ");
		 String name = input.nextLine();
		 
		 System.out.println("Item Description: ");
		 String description = input.nextLine();
		 
		 System.out.println("Price: ");
		 double price = input.nextInt();
		 
		 System.out.println("Type (1 if drink, 2 if food):");
		 int type = input.nextInt();
		 
		 if(type == 1) {
			 Menu.drinks.add(new MenuItems(price, name, description, type));
		 } else if(type == 2) {
			 Menu.food.add(new MenuItems(price, name, description, type));
		 }
		 
		 return;
		 
	 }
}

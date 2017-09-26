import java.util.Map;

public class Hallway extends Room{

	public Hallway(String name, String description, Map<Item, String> itemsRoom, String waitDesc, String neutralState) {
		super(name, description, itemsRoom, waitDesc, neutralState);
	}

	public String go(String direction, Inventory inventory) {
		if (direction.equalsIgnoreCase("north")) {
			if (inventory.contains("peanut") != null){
				System.out.println("The student is coming! I need to hurry... maybe, if we escaped by flushing ourselves...");
				System.out.println("Ah! no time to decide! I push the flush and go down....");
				System.out.println("I don't remember much from the flush down... but one thing I do remember crystal clear is the tiny little body I had to carry back to the now childless mother...");
				System.out.println("No matter how much hazelnut whiskey I chug... I can't forget it... ");
				return "quit";
			} else {
			System.out.println("I walked north into the bathroom.");
			return "Bathroom";
			}
		} else if (direction.equalsIgnoreCase("south")) {
			System.out.println("But...if I walk south, I would bump into the wall...");
			return "Hallway";
		} else if (direction.equalsIgnoreCase("west")) {
			System.out.println("I'll try squeezing under the door. I need to find Peanut!");
			return "Dorm";
		} else if (direction.equalsIgnoreCase("east")) {
			System.out.println("It's a dead end, I should probably go the other way.");
			return "Hallway";
		} else {
			System.out.println("I can't walk " + direction + ". I need to hurry and save Peanut!");
			return "Hallway";
		}

	}


}

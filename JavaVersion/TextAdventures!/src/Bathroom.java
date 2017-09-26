import java.util.Map;

public class Bathroom extends Room {

	public Bathroom(String name, String description, Map<Item, String> itemsRoom, String waitDesc, String neutralState) {
		super(name, description, itemsRoom, waitDesc, neutralState);
	}

	public String go(String direction, Inventory inv) {
		if (direction.equalsIgnoreCase("north")) {
			System.out.println("I bumped into a trashcan.");
			return "Bathroom";
		} else if (direction.equalsIgnoreCase("south")) {
			System.out.println("I walk south into the hallway.");
			return "Hallway";
		} else if (direction.equalsIgnoreCase("east")) {
			System.out.println("I bumped into the wall");
			return "Bathroom";
		} else if (direction.equalsIgnoreCase("west")) {
			System.out.println("It's a dead end, I should probably go the other way.");
			return "Bathroom";
		} else {
			System.out.println("I can't walk " + direction + ". I need to hurry and save Peanut!");
			return "Bathroom";
		}
	}
}
import java.util.Map;

public class Outdoors extends Room {

	public Outdoors(String name, String description, Map<Item, String> roomItems, String waitDesc, String neutralState) {
		super(name, description, roomItems, waitDesc, neutralState);
	}

	public String climb(String direction, Inventory inv) {
		if (direction.equalsIgnoreCase("up tree")) {
			System.out.println("You climbed up the tree");
			if ((inv.contains("leaf") != null)) {
				System.out.println("What if I use the leaf to fly to the bathroom?");
				System.out.println("I jump and I hold on to the leaf. I leap into the bathroom");
				return "Bathroom";
			} else {
				System.out.println("I'm not a flying squirrel. Maybe I should go back and look for something to fly with...");
				return "Tree";
			} 
		} else {
			System.out.println("You cannot climb " + direction + ".");
			return "Outdoors";
		}
	}

	public String go(String direction, Inventory inv) {
		System.out.println("I can't go " + direction + ". But I could climb up the tree though...");
		return "Outdoors";
	}
}
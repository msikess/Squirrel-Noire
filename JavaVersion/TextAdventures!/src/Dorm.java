import java.util.Map;

public class Dorm extends Room{

	/**
	 * @param name
	 * @param description
	 * @param roomItems
	 * @param waitDesc
	 * @param neutralState
	 */
	public Dorm(String name, String description, Map<Item, String> roomItems, String waitDesc, String neutralState) {
		super(name, description, roomItems, waitDesc, neutralState);
	}

	/* (non-Javadoc)
	 * @see Room#go(java.lang.String, Inventory)
	 */
	public String go(String direction, Inventory inv) {
		if (direction.equalsIgnoreCase("east")) {
			System.out.println("I walked through the door into the hallway again.");
			return "Hallway";
		} else {
			System.out.println("I can't go " + direction + ". The door is in the east direction...");
			return "Dorm";
		}
	}
}
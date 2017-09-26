import java.util.Map;

public class Tree extends Room{

	public Tree(String name, String description, Map<Item, String> itemsRoom, String waitDesc, String neutralState) {
		super(name, description, itemsRoom, waitDesc, neutralState);
	}

	public String climb(String direction) {
		if (direction.equalsIgnoreCase("down tree")) {
			System.out.println("I climbed down the tree");
			return "Outdoors";
		} else {
			System.out.println("I wouldn't do that...");
			return "Tree";
		}
	}

	public String go(String direction, Inventory inv) {
		System.out.println("I'm on a branch! I can't go " + direction + ".");
		return "Tree";
	}

}
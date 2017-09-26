import java.util.ArrayList;

public class Inventory {
	ArrayList<Item> inventory;

	public Inventory() {
		inventory = new ArrayList<>();
	}

	public Boolean pickUp(Item item) {
		if (item.get("pick") == true){
			inventory.add(item);
			item.set("use", true);
			if (!item.getName().equalsIgnoreCase("nut")) {
				item.set("pick", false);
			}
			item.set("look", false);
			return true;
		} else {
			return false;
		}
	}

	public Item contains(String item) {
		for (Item x : inventory) {
			if (x.getName().equalsIgnoreCase(item)) {
				return x;
			}
		}
		return null;
	}

	public Boolean use(Item item) {
		if (inventory.contains(item) && item.get("use") == true) {
			if (item.get("fly") == true) {
				return true;
			} else {
				inventory.remove(item);
				item.set("use", false);
				return true;
			}
		} else {
			return false;
		}
	}
}

import java.util.Map;

public abstract class Room {
	protected String name;
	protected String description;
	protected Boolean moveRooms;
	protected Map<Item, String> itemsRoom;
	protected String waitDesc;
	protected String neutralState;

	public Room(String name, String description, Map<Item, String> itemsRoom, String waitDesc, String neutralState) {
		this.name = name;
		this.description = description;
		this.itemsRoom = itemsRoom;
		this.waitDesc = waitDesc;
		this.neutralState = neutralState;

	}

	public abstract String go(String direction, Inventory inv);

	public String roomName() {
		return name;
	}

	public String roomDescription() {
		return description;
	}

	public void lookAt(String item) {
		if (itemsRoom != null){
		for (Item i : itemsRoom.keySet()) {
			if (item.equalsIgnoreCase(i.getName()) && i.get("look") == true) {
				System.out.println(i.describe());
				return;
			} 
		}
		}
		System.out.println("I looked around for " + item + " but I can't seem to find it.");
		return;
	}

	public void pickUp(String item, Inventory inventory) {
		if (itemsRoom != null) {
		for (Item i : itemsRoom.keySet()) {
			if (item.equalsIgnoreCase(i.getName()) && inventory.pickUp(i) == true) {
				i.setDescription(itemsRoom.get(i));
				System.out.println("I picked up " + i.getName() + ". I stored it in my mouth.");
				System.out.println(i.describe());
				itemsRoom.remove(i);
				return;
			} 
		}
		}
		System.out.println("I can't pick up " + item + ".");
		return;
	}

	public Item use(String item, Inventory inventory){
		Item i = inventory.contains(item);
		if (i != null && inventory.use(i) == true){
			System.out.println(i.getEff());
			return i;
		} else {
			System.out.println("Not now... Not here...");
			return null;
		}
	}

	public void talkTo(String item) {
		if (itemsRoom != null){
		for (Item i : itemsRoom.keySet()) {
			if (item.equalsIgnoreCase(i.getName()) && i.get("talk") == true) {
				System.out.println(i.getEff());
				return;
			} 
		}
		}
		System.out.println("Ugh, I can't talk to " + item + ". Haven't had enough of my Hazelnut Whiskey.");
		return;
	}

	public void fight(String item) {
		if (itemsRoom != null){
		for (Item i : itemsRoom.keySet()) {
			if (item.equalsIgnoreCase(i.getName()) && i.get("fight") == true) {
				System.out.println("I scratched the " + item
						+ ". They flinched and dropped Peanut! I must act fast, now is the only time to get away.");
				i.set("fight", false);
				for (Item pea : itemsRoom.keySet()) {
					if (pea.getName().equalsIgnoreCase("Peanut")) {
						pea.set("pick", true);
						pea.set("use", false);
						return;
					}
				}
			}
		}
		}
		System.out.println("I can't fight the innocent...");
		return;
	}

	public void wait(int count) {
		if (count % 3 == 0) {
			System.out.println(this.waitDesc);
		} else {
			System.out.println(this.neutralState);
		}
	}

}

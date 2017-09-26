import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Parser {
	Scanner line;
	private int COUNT = 1;

	public Parser(Scanner line) {
		this.line = new Scanner(System.in);
	};

	public void commandParser(Scanner line, Room room, Map<String, List<Room>> map, Inventory inv) {
		System.out.printf("\n > ");
		String command = line.nextLine().toLowerCase();
		if (command.equalsIgnoreCase("quit")){
			int nuts = 0;
			for (int i = 0; i < inv.inventory.size(); i++) {
				if (inv.inventory.get(i).getName().equalsIgnoreCase("nut")) {
					nuts++;
				}
			}
			System.out.println("You've stored " + nuts + " out of 20 nuts in your mouth! Ready for winter!");
			return;
		}
		if (command.equalsIgnoreCase("help")){
			System.out.println("go <direction: north, south, east, west>;\n"
					+ "climb <up tree/down tree>;\n"
					+ "pick up <item>;\n"
					+ "look at <item>;\n"
					+ "use <item>;\n"
					+ "talk to <item>;\n"
					+ "fight <item>;\n"
					+ "wait;\n");
		}
		if (command.contains(" the ")) {
			command = command.replace(" the ", " ");
		} if (command.contains(" a ")) {
			command = command.replace(" a ", " ");
		} if (command.contains(" an ")) {
			command = command.replace(" an ", " ");
		} if (command.startsWith("look at")) {
			String item = command.substring(8);
			room.lookAt(item);
			System.out.println();
			commandParser(line, room, map, inv);
		}
		else if (command.startsWith("pick up")) {
			String item = command.substring(8);
			room.pickUp(item, inv);
			System.out.println();
			commandParser(line, room, map, inv);
		}
		else if (command.startsWith("use")) {
			String item = command.substring(4);
			room.use(item, inv);
			System.out.println();
			commandParser(line, room, map, inv);
		}
		else if (command.startsWith("talk to")) {
			String item = command.substring(8);
			room.talkTo(item);
			System.out.println();
			commandParser(line, room, map, inv);
		}
		else if (command.startsWith("fight")) {
			String item = command.substring(6);
			room.fight(item);
			System.out.println();
			commandParser(line, room, map, inv);
		}
		else if (command.startsWith("wait")) {
			room.wait(COUNT++);
			System.out.println();
			commandParser(line, room, map, inv);
		}
		else if (command.startsWith("climb")) {
			String direction = command.substring(6);
			if (room instanceof Outdoors) {
				String roomie = ((Outdoors) room).climb(direction, inv);
				if (room.name == roomie) {
					System.out.println();
					commandParser(line, room, map, inv);
				} else if (map.get(room.name).get(0).name == roomie) {
					System.out.println(map.get(room.name).get(0).description);
					System.out.println();
					commandParser(line, map.get(room.name).get(0), map, inv);
				} else {
					System.out.println(map.get(room.name).get(1).description);
					System.out.println();
					commandParser(line, map.get(room.name).get(1), map, inv);
				}
			}
			if (room instanceof Tree) {
				String roomie = ((Tree) room).climb(direction);
				if (room.name == roomie) {
					System.out.println();
					commandParser(line, room, map, inv);
				} else {
					if (map.get(room.name).get(0).name == roomie) {
						System.out.println(map.get(room.name).get(0).description);
						System.out.println();
						commandParser(line, map.get(room.name).get(0), map, inv);
					} else {
						System.out.println(map.get(room.name).get(1).description);
						System.out.println();
						commandParser(line, map.get(room.name).get(1), map, inv);
					}
				} 
			} else {
				System.out.println("I can't climb here.");
				commandParser(line, room, map, inv);
			}
		}
		else if (command.startsWith("go")) {
			String direction = command.substring(3);
			String roomie = null;
			if (room instanceof Outdoors) {
				roomie = ((Outdoors) room).go(direction, inv);
				if (roomie == room.name) {
					System.out.println();
					commandParser(line, room, map, inv);
				}
			} if (room instanceof Bathroom) {
				roomie = ((Bathroom) room).go(direction, inv);
				if (roomie == room.name) {
					System.out.println();
					commandParser(line, room, map, inv);
				} else if (map.get(room.name).get(0).name == roomie) {
					System.out.println(map.get(room.name).get(0).description);
					System.out.println();
					commandParser(line, map.get(room.name).get(0), map, inv);
				} else if (map.get(room.name).get(1).name == roomie) {
					System.out.println(map.get(room.name).get(1).description);
					System.out.println();
					commandParser(line, map.get(room.name).get(1), map, inv);
				}
			}if (room instanceof Tree) {
				roomie = ((Tree) room).go(direction, inv);
				if (roomie == room.name) {
					System.out.println();
					commandParser(line, room, map, inv);
				}
			} if (room instanceof Hallway) {
				roomie = ((Hallway) room).go(direction, inv);
				if (roomie.equalsIgnoreCase("quit")) {
					int nuts = 0;
					for (int i = 0; i < inv.inventory.size(); i++) {
						if (inv.inventory.get(i).getName().equalsIgnoreCase("nut")) {
							nuts++;
						}
					}
					System.out.println("You've stored " + nuts + " out of 20 nuts in your mouth! Ready for winter!");
					return;
				}
				if (roomie == room.name) {
					System.out.println();
					commandParser(line, room, map, inv);
				} else if (map.get(room.name).get(0).name == roomie) {
					System.out.println(map.get(room.name).get(0).description);
					System.out.println();
					commandParser(line, map.get(room.name).get(0), map, inv);
				} else if (map.get(room.name).get(1).name == roomie) {
					System.out.println(map.get(room.name).get(1).description);
					System.out.println();
					commandParser(line, map.get(room.name).get(1), map, inv);
				}
			} else if (room instanceof Dorm){
				roomie = ((Dorm) room).go(direction, inv);
				if (roomie == room.name) {
					System.out.println();
					commandParser(line, room, map, inv);
				} else if (map.get(room.name).get(0).name == roomie) {
					System.out.println(map.get(room.name).get(0).description);
					System.out.println();
					commandParser(line, map.get(room.name).get(0), map, inv);
				}
			}
		} else {
			System.out.println("I can't do that...");
			System.out.println();
			commandParser(line, room, map, inv);
		}
	}
}


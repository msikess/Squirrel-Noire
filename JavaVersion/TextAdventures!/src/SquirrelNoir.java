import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SquirrelNoir {

	public static Map<String, List<Room>> initializeGame(){
		Item Mother = new Item("Mother","She looks very worried...I should help her", "Please! Detective Nuts!\nMy child, Peanut, is missing!!! He was taken by a human! You must find my son!", true, false, false, false, true, false);
		Item Peanut = new Item("Peanut","That's Peanut! He's just a little squirrel. I must help him!", "", true, false, false, false, false, false);
		Item Human = new Item("Human","That monster! He kidnapped Peanut!", "", true, false, false, false, false, true);
		Item PCardSquirrel = new Item("PB","That's PB, maybe he knows something...I've heard he has an illegal collection of lost P-Cards.", "Well, I saw one of those humans kidnap Peanut, he walked towards that dorm, over there, by the tree.", true, false, false, false, true, false);
		Item Leaf = new Item("Leaf","That's a pretty sturdy leaf...I might use it for something...", "But it's stored in my mouth already.", true, true, false, true, false, false);
		Item Nut = new Item("Nut", "That's a nice, shiny nut...", "Yummy!", true, true, false, false, false, false);
		Item Nut1 = new Item("Nut", "That's a nice, shiny nut...", "Yummy!", true, true, false, false, false, false);
		Item Nut2 = new Item("Nut", "That's a nice, shiny nut...", "Yummy!", true, true, false, false, false, false);
		Item Nut3 = new Item("Nut", "That's a nice, shiny nut...", "Yummy!", true, true, false, false, false, false);
		Item Nut4 = new Item("Nut", "That's a nice, shiny nut...", "Yummy!", true, true, false, false, false, false);
		Item Nut5 = new Item("Nut", "That's a nice, shiny nut...", "Yummy!", true, true, false, false, false, false);
		Item Nut6 = new Item("Nut", "That's a nice, shiny nut...", "Yummy!", true, true, false, false, false, false);
		Item Nut7 = new Item("Nut", "That's a nice, shiny nut...", "Yummy!", true, true, false, false, false, false);
		Item Nut8 = new Item("Nut", "That's a nice, shiny nut...", "Yummy!", true, true, false, false, false, false);
		Item Nut9 = new Item("Nut", "That's a nice, shiny nut...", "Yummy!", true, true, false, false, false, false);
		Item Nut10 = new Item("Nut", "That's a nice, shiny nut...", "Yummy!", true, true, false, false, false, false);
		Item Nut11 = new Item("Nut", "That's a nice, shiny nut...", "Yummy!", true, true, false, false, false, false);
		Item Nut12 = new Item("Nut", "That's a nice, shiny nut...", "Yummy!", true, true, false, false, false, false);
		Item Nut13 = new Item("Nut", "That's a nice, shiny nut...", "Yummy!", true, true, false, false, false, false);
		Item Nut14 = new Item("Nut", "That's a nice, shiny nut...", "Yummy!", true, true, false, false, false, false);
		Item Nut15 = new Item("Nut", "That's a nice, shiny nut...", "Yummy!", true, true, false, false, false, false);
		Item Nut16 = new Item("Nut", "That's a nice, shiny nut...", "Yummy!", true, true, false, false, false, false);
		Item Nut17 = new Item("Nut", "That's a nice, shiny nut...", "Yummy!", true, true, false, false, false, false);
		Item Nut18 = new Item("Nut", "That's a nice, shiny nut...", "Yummy!", true, true, false, false, false, false);
		Item Nut19 = new Item("Nut", "That's a nice, shiny nut...", "Yummy!", true, true, false, false, false, false);
		Map<Item, String> outdoorsItems = new HashMap<Item, String>();
		outdoorsItems.put(Mother, "");
		outdoorsItems.put(Nut, "I like nuts.");
		outdoorsItems.put(Nut1, "I like nuts.");
		outdoorsItems.put(Nut2, "I like nuts.");
		outdoorsItems.put(Nut3, "I like nuts.");
		outdoorsItems.put(Nut4, "I like nuts.");
		outdoorsItems.put(Nut5, "I like nuts.");
		outdoorsItems.put(Leaf, "Yummy!");
		outdoorsItems.put(PCardSquirrel, "");
		Room outdoors = new Outdoors("Outdoors", "This place used to be quiet until the crane came, but we still have some luscious trees that drop sturdy leafs and nuts around.\n"
				+ "I see a squirrel, the mother of 12, distressed and my old pal PB next to her.\n", outdoorsItems,
									"I need to gather clues and get moving.", "This soft breeze makes my hair look goooOood");
		Map<Item, String> dormItems = new HashMap<Item, String> ();
		dormItems.put(Human, "");
		dormItems.put(Nut6, "I like nuts.");
		dormItems.put(Nut7, "I like nuts.");
		dormItems.put(Nut8, "I like nuts.");
		dormItems.put(Nut9, "I like nuts.");
		dormItems.put(Peanut, "I'll keep you safe, buddy!");
		Map<Item, String> bathItems = new HashMap<Item, String> ();
		bathItems.put(Nut10, "I like nuts.");
		bathItems.put(Nut11, "I like nuts.");
		bathItems.put(Nut12, "I like nuts.");
		bathItems.put(Nut13, "I like nuts.");
		bathItems.put(Nut14, "I like nuts.");
		bathItems.put(Nut15, "I like nuts.");
		Map<Item, String> treeItems = new HashMap<Item, String> ();
		treeItems.put(Nut16, "I like nuts.");
		treeItems.put(Nut17, "I like nuts.");
		Map<Item, String> hallItems = new HashMap<Item, String> ();
		hallItems.put(Nut18, "I like nuts.");
		hallItems.put(Nut19, "I like nuts.");
		Room tree = new Tree("Tree", "This is a breathtaking view of the campus. But the clouds are gray and Peanut is still missing.", treeItems, "when will I whither away..?", "I waited...the leaves were falling, slowly dying, just like all of us...");
		Room bathroom = new Bathroom ("Bathroom", "Just a smelly bathroom, with a door on the south... This bathroom reminds me of my childhood...wait, child? I need to save lil Peanut, fast!", bathItems, "I think I need to pee...", "It's so smelly, I want to leave...");
		Room hallway = new Hallway("Hallway", "It's a long hallway, but I think I hear a squeak coming from a room on the west side.", hallItems, "I smell that smelly smell, the smell that it smells like", "I wonder what's for dinner at D-Hall? I might creep on some students eating outside.");
		Room dorm = new Dorm ("Dorm", "It's the human's tiny dorm. I didn't know that humans like to live in tiny spaces like we do. There's the human and Peanut!", dormItems, "No time to waste! I need to be brave... for once.", "He has a lavalaaamp!");
		Map<String, List<Room>> roomMap = new HashMap<String, List<Room>>();
		List<Room> outList = new ArrayList<>();
		List<Room> treeList = new ArrayList<>();
		List<Room> bathList = new ArrayList<>();
		List<Room> hallList = new ArrayList<>();
		List<Room> dormList = new ArrayList<>();
		outList.add(tree);
		outList.add(bathroom);
		roomMap.put("Outdoors", outList);
		treeList.add(bathroom);
		treeList.add(outdoors);
		roomMap.put("Tree", treeList);
		bathList.add(hallway);
		bathList.add(tree);
		roomMap.put("Bathroom", bathList);
		hallList.add(dorm);
		hallList.add(bathroom);
		roomMap.put("Hallway", hallList);
		dormList.add(hallway);
		roomMap.put("Dorm", dormList);
		return roomMap;
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner line = null;
		Parser parser = new Parser(line);
		Inventory inv = new Inventory();
		Map<String, List<Room>> roomMap = initializeGame();
		Room starter = roomMap.get("Tree").get(1);
		Scanner in = new Scanner(System.in).useDelimiter(">\\s*");
		Boolean playMode = false;
		String command = "";
		System.out.println("Squirrel Noir\nby Ana Segebre and Mariam Nadiradze\nDo you want to play?");
		while (playMode == false) {
			System.out.printf("> ");
			command = in.nextLine();
			if (command.equalsIgnoreCase("no")) {
				return;
			} else if (command.equalsIgnoreCase("yes")) {
				playMode = true;
				System.out.println("It was a cold and windy day in Grinnell... The wind was puffing my tail in a weird way, so I knew from the moment I climbed down my tree that something would happen today...");
			}
		}
		while (playMode == true) {
			System.out.println(starter.description);
			parser.commandParser(in, starter, roomMap, inv);
			System.out.println("Developed by Ana Segebre and Mariam Nadiradze"
					+ "\n"
					+ "\nCast:"
					+ "\n"
					+ "\nDet. Nuts as Det. Nuts.\nMother Squirrel as Mother of 12."
					+ "\nPeanut Butter as PB.\nYour next-door student neighbor as Human."
					+ "Peanut as Peanut.\n\nIn the memory of Peanut... \n(2016 - 2017)\nRest in peace, little buddy.");
			System.out.println("Do you wish to play again?");
			command = in.nextLine();
			if (command.equalsIgnoreCase("no")){
				playMode = false;
			}
			in.close();
		}
	}
}
public class Item {
	private String name;
	private String description;
	private String effect;
	private Boolean lookable;
	private Boolean pickable;
	private Boolean usable;
	private Boolean flyable;
	private Boolean talkable;
	private Boolean fightable;

	public Item(String name, String des, String eff, Boolean look, Boolean pick, Boolean use, Boolean fly,
			Boolean talk, Boolean fight) {
		this.name = name;
		description = des;
		effect = eff;
		lookable = look;
		pickable = pick;
		usable = use;
		flyable = fly;
		talkable = talk;
		fightable = fight;
	}

	public String describe() {
		return description;
	}
	
	public String getName() {
		return name;
	}
	
	public String getEff(){
		return effect;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean get(String str) {
		String getter = str.toLowerCase();
		switch (getter) {
		case "look":
			return lookable;
		case "pick":
			return pickable;
		case "use":
			return usable;
		case "fly":
			return flyable;
		case "talk":
			return talkable;
		case "fight":
			return fightable;
		default:
			System.out.println("Wait what? Try again...");
			return false;

		}
	}

	public void set(String str, Boolean bool) {
		String setter = str.toLowerCase();
		switch (setter) {
		case "look":
			lookable = bool;
			break;
		case "pick":
			pickable = bool;
			break;
		case "use":
			usable = bool;
			break;
		case "fly":
			flyable = bool;
			break;
		case "talk":
			talkable = bool;
			break;
		case "fight":
			fightable = bool;
			break;
		default:
			break;
		}
	}

}
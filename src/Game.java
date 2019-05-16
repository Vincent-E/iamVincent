
/**
 *
 * @author VincentE
 */

public class Game {
	private Parser parser;
	private Player player;


	public Game() {
		initGame();
	}

	private void initGame() {
		parser = new Parser();
		player = new Player("Minas", "peraste mas");

		Room outside, bedroom, livingRoom, kitchen, hallway;
                
		Item key = new Item("key", "This is a key");
		Item knife = new Item("knife","You found a knife");

		
		outside = new Room("Aulh",
				"Eisai eksw apto spiti");
		bedroom = new Room("upnodwmatio", "eisai sto upnodwmatio");
		livingRoom = new Room("saloni", "eisai sto saloni");
		kitchen = new Room("kouzina", "eisai sti kouzina");
		hallway = new Room("hallway", "eisai sto diadromo");

		// initialise outside room exits
		outside.setExit("east", new Exit("east", "Auth einai h anatolikh eksodos",
				outside, bedroom, false));
                
                bedroom.setExit("west", new Exit("west", "Ayth einai h dutikh eksodos",
				bedroom, outside, false));
                bedroom.setExit("east", new Exit("anatolikh", "Ayth einai h anatolikh eksodos",bedroom,
				livingRoom,false));
		
		livingRoom.setExit("west", new Exit("west", "Ayth einai h dutikh eksodos",
				livingRoom, outside, false));
                livingRoom.setExit("north", new Exit("north", "Ayth einai h voreia eksodos",livingRoom, kitchen,false));
		livingRoom.setExit("east", new Exit("east","Auth einai h anatolikh eksodos",livingRoom,hallway,true));
                
		livingRoom.addItem(key);
                livingRoom.addItem(knife);

		
		kitchen.setExit("south", new Exit("south", "Auth einai h notia eksodos",kitchen,
				livingRoom, false));
		

		
		hallway.setExit("west", new Exit("west", "Auth einai h dutikh eksodos", hallway,
				livingRoom, false));
		

		player.setCurrentRoom(outside);
                player.addItem(new Item("map", "Autos einai o xartis"));
	}

	
	public void play() {
		printWelcome();

		

		boolean finished = Command.getWantToQuit();
		while (!finished) {
			Command command = parser.getCommand();
			finished = processCommand(command);
		}
		System.out.println("Euxaristoume pou paiksate");
	}

	
	private void printWelcome() {
		System.out.println();
		System.out.println("Kalwsorisate.");
		System.out
				.println("Peraste mas to mathima plz");
		System.out.println(">help< gia voitheia");
		System.out.println();
		System.out.println(player.getCurrentRoom().getLongDescription());
	}

	
	private boolean processCommand(Command command) {

		if (command.isUknown()) {
			System.out.println("Den katalavainw ti ennoeis...");
			return false;
		}

		String commandWord = command.getCommandWord();

		CommandList cl = new CommandList();

		
		cl.makeCommands();
		
		if (cl.isCommand(commandWord)) {
			
			cl.getCommand(commandWord).makeAction(player, command);
		} else {
			System.out.println("Den katalavainw ti ennoeis...");
		}

		return Command.getWantToQuit();
	}

	public static void main(String[] args) {
		Game game = new Game();
		game.play();
	}

}


import java.util.ArrayList;

/**
 *
 * @author VincentE
 */
public class Player extends ObjectMaker{
    public Room currentRoom;
    private Room nextRoom;
    private ArrayList<Item> itemsList;
    
    public Player(String name, String description) {
		super(name, description);
		itemsList = new ArrayList<Item>(0);
	}
    
    public void setCurrentRoom(Room room) {
		currentRoom = room;
	}
    
    public Room getCurrentRoom() {
		return this.currentRoom;
	}
    
    public void setNextRoom(Room next){
                nextRoom = next;
    }
    
    public Room getNextRoom(){
                return this.nextRoom;
    }
    
    public boolean checkItem(String itemName) {
		boolean doExist = false;
		String name;

		for (Item e : itemsList) {
			name = e.getName();
			if (name.compareTo(itemName) == 0) {
				doExist = true;
			}
		}
		return doExist;
	}
    public Item getItem(String itemName) {
		String name;
		Item returnedItem = null;

		for (Item e : itemsList) {
			name = e.getName();
			if (name.compareTo(itemName) == 0) {
				returnedItem = e;
				break;
			}
		}
		return returnedItem;
	}
    
    public void addItem(Item e) {
		itemsList.add(e);
	}
    
    public void removeItem(Item e) {
		for (int i = 0; i < itemsList.size(); i++) {
			if (itemsList.get(i).equals(e)) {
				itemsList.remove(i);
				break;
			}
		}
	}
    
    public void printInfo() {
		String str = "";
		for (Item e : itemsList) {
			str += " " + e.getName();
		}
		if (str == "") {
			System.out.println("Den exeis antikeimena");
		} else {
			System.out.println("Exeis ta ekshs antikeimena:" + str);
		}
	}
}









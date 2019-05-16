
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
/**
 *
 * @author VincentE
 */
public class Room extends ObjectMaker{
    private ArrayList<Item> itemsList;
    private HashMap<String, Exit> exits;
    
    public Room(String name, String description){
        super(name, description);
        exits = new HashMap<String, Exit>();
        itemsList = new ArrayList<Item>(0);
    }
    
    public void setExit(String direction, Exit roomExits){
        exits.put(direction, roomExits);
    }
    
    public String getShortDescription(){
        return super.getDescription();
    }
    public String getLongDescription(){
        return "Vriskesai " + super.getDescription()+ ".\n" + getExitString();
    }
    
    private String getExitString(){
        String returnString = "Exits:";
        Set<String> keys = exits.keySet();
        for(String exit : keys)
            returnString += " " + exit;
        return returnString;
    }
    
    public void printInfo() {
		String str = "Exits:";
		Set<String> keys = exits.keySet();
		for (String exit : keys)
			str += " " + exit;
		System.out.println(str);
	}
    
    public void printItemsInfo() {
		String str = "Yparxoun ta ekshs dia8esima antikeimena:";

		for (Item e : itemsList)
			str += " " + e.getName();
		System.out.println(str);
	}
    
    public Exit getExit(String direction){
        return exits.get(direction);
    }
    
    
    public void addItem(Item e){
        itemsList.add(e);
    }
    
    public Item getItem(String itemName){
        String name;
        Item returnedItem = null;
        
        for(Item e: itemsList){
            name = e.getName();
            if(name.compareTo(itemName)==0){
                returnedItem = e;
            }
        }
        return returnedItem;
    }
    
    public void removeItem(Item e){
        for(int i=0; i<itemsList.size(); i++){
            if(itemsList.get(i).equals(e)){
                itemsList.remove(i);
                break;
            }
        }
    }
    
    public boolean doItemExist(String itemName) {
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
}






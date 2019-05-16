
/**
 *
 * @author VincentE
 */
public class Exit extends ObjectMaker{
    private Room curRoom;
    private Room room;
    private boolean isLocked;
    
    public Exit(String name,String description,Room current, Room next, boolean isLocked){
        super(name,description);
        this.setCurrentRoom(current);
        this.setNextRoom(next);
        this.setLocked(isLocked);
    }
    
    public Exit(String name, String description, Room current, Room next){
        super(name,description);
        this.setCurrentRoom(current);
        this.setNextRoom(next);
        this.setLocked(isLocked);
    }
    
    public void setName(String name){
        super.setName(name);
    }
    
    public String getName() {
		return super.getName();
	}
    
    public void setNextRoom(Room room){
        this.room = room;
    }
    
    public Room getNextRoom(){
        return room;
    }
    
    public void setLocked(boolean isLocked){
        this.isLocked = isLocked;
    }
    
    public boolean isLocked(){
        return isLocked;
    }
    
    public Room getCurrentRoom() {
		return curRoom;
	}
    
    public void setCurrentRoom(Room currentRoom) {
		this.curRoom = currentRoom;
	}
    
}




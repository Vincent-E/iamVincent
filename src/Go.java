

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author VincentE
 */
public class Go implements Actions {

    public Go() {
    }
    
    public void makeAction(Player player, Command command){
        if (!command.hasSecondWord()){
			System.out.println("Go pou?");
			return;
		}
    
    
    String direction = command.getSecondWord();
    
     
    Exit exit = player.getCurrentRoom().getExit(direction);
    
    Room nextRoom = exit.getNextRoom();
    
    if(nextRoom == null){
        System.out.println("Den exei porta!");
    }else if(exit.isLocked()){
        System.out.println("Kleidwmenh porta!Dokimase na tin ksekleidwseis");
    }else{
        player.setCurrentRoom(nextRoom);
        System.out.println(player.getCurrentRoom().getLongDescription());
    }
    
		
    player.getCurrentRoom().printItemsInfo();
    player.printInfo();
    player.getCurrentRoom().printInfo();
    }
}


















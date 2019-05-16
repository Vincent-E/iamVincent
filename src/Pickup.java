

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author VincentE
 */
public class Pickup implements Actions {

    
    
    public Pickup() {
    }
    
    public void makeAction(Player player,Command command){
        Item e;
        
        if (!command.hasSecondWord()){
			System.out.println("Pickup ti?");
			return;
		}
        
        String itemName = command.getSecondWord();
        
        if(player.getCurrentRoom().doItemExist(itemName)){
            e = player.getCurrentRoom().getItem(itemName);
            player.getCurrentRoom().removeItem(e);
            player.addItem(e);
        }else{
            System.out.println("Den uparxei to antikeimeno mesto dwmatio");
            return;
        }
        player.getCurrentRoom().printInfo();
        player.getCurrentRoom().printItemsInfo();
        player.printInfo();
    }
}







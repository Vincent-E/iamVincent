


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author VincentE
 */

public class Unlock implements Actions {

   public Unlock() {
    }
    
   public void makeAction(Player player,Command command){
       if(!command.hasSecondWord()){
           System.out.println("Use ti?");
           return;
       }
       
       boolean existKey = false;
       Exit door = null;
       
       String doorToUnlock = command.getSecondWord();
       door = player.getCurrentRoom().getExit(doorToUnlock);
       existKey = player.checkItem("key");
       if(existKey == true){
           if(door.isLocked() == true){
               player.getCurrentRoom().getExit(doorToUnlock).setLocked(false);
           }else{
               System.out.println("Den exeis kleidi!");
           }
       }   
       player.getCurrentRoom().printInfo();
       player.getCurrentRoom().printItemsInfo();
       player.printInfo();
   }
}












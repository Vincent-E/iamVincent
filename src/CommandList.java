


import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author VincentE
 */
public class CommandList {
    private HashMap<String, Actions> commandList;
    
    public CommandList(){
        
    }
    
    public void makeCommands(){
        commandList = new HashMap<String, Actions>();
        
        Actions excHelp = new Help();
        commandList.put("help",excHelp);
        
        Actions excQuit = new Quit();
        commandList.put("quit",excQuit);
        
        Actions excGo = new Go();
        commandList.put("go",excGo);
        
        Actions excPickup = new Pickup();
        commandList.put("pickup",excPickup);
        
        Actions excUnlock = new Unlock();
        commandList.put("unlock",excUnlock);
        
        Actions excUse = new Use();
        commandList.put("use",excUse);
    }
    
    public boolean isCommand(String string){
        if(commandList.containsKey(string)){
            return true;
        }
        return false;
    }
    
    public Actions getCommand(String command){
        return commandList.get(command);
    }
    
    public void showAll(){
        System.out.println("go,pickup,unlock,use,help,quit");
    }
}











/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author VincentE
 */
public class Quit implements Actions {

    public Quit() {
    }
    
    public void makeAction(Player player, Command command){
        if(!command.hasSecondWord()){
            Command.setWantToQuit(true);
        }else{
            System.out.println("Quit ti??");
        }
    }
}





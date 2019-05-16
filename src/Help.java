

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author VincentE
 */
public class Help implements Actions {
    CommandList list = new CommandList();
    
    public Help() {
        
    }
    
    public void makeAction(Player player, Command command){
        System.out.println("Prospathise na fugeis!");
        System.out.println("Ta commands einai:");
        list.showAll();
        
    }
}







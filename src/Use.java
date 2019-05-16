

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author VincentE
 */
public class Use implements Actions{
    
    public Use(){
        
    }
    
    public void makeAction(Player player, Command command){
        if (!command.hasSecondWord()){
			System.out.println("Use ti?");
			return;
		}
        
        
        String itemWord = command.getSecondWord();
        
        
        if("knife".equals(itemWord)){
            boolean existKnife = false;
            existKnife = player.checkItem("knife");
            if (existKnife == true) {
                System.out.println("You killed yourself :( DONT PLAY WITH KNIVES");
                Command.setWantToQuit(true);
            }else{
                System.out.println("You dont have a knife");
            }
        }
        
        if("map".equals(itemWord)){
            boolean existMap = false;
            existMap = player.checkItem("map");
            if (existMap == true){
                System.out.println("1st room: Outside (exits: east)"+"\n"+
                                   "2nd room: bedroom (exits:west, east)"+"\n"+
                                   "3rd room: Living Room (exits:west, east, north)"+"\n"+
                                   "4th room: Kitchen (exits: south)"+"\n"+
                                   "5th room: Hallway (exits:west)"+"\n");
            }else{
                System.out.println("You dont have a map");
            }
        }
        }
}







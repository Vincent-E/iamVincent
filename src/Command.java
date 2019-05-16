


/**
 *
 * @author VincentE
 */
public class Command {
    private String commandWord;
    private String secondWord;
    protected static boolean wantToQuit = false;
    
    public Command(String firstWord, String secondWord){
        commandWord = firstWord;
        this.secondWord = secondWord;
    }
    
    public String getCommandWord(){
        return commandWord;
    }
    
    public String getSecondWord(){
        return secondWord;
    }
    
    public boolean isUknown(){
        return (commandWord == null);
    }
    
    public boolean hasSecondWord(){
        return (secondWord != null);
    }
    
    public static boolean getWantToQuit(){
        return wantToQuit;
    }
    
    public static void setWantToQuit(boolean arg){
        wantToQuit = arg;
    }
}




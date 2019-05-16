

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author VincentE
 */
public class Parser {
    private CommandList commands;
    private Scanner reader;
    
    public Parser(){
        commands = new CommandList();
        reader = new Scanner(System.in);
    }
    
    public Command getCommand(){
        String word1;
        String word2;
        
        String line = reader.nextLine();
        Scanner scan = new Scanner(line);
        
        if (scan.hasNext()){
            word1 = scan.next();
        }else{
            word1 = null;
        }
        
        if (scan.hasNext()){
            word2 = scan.next();
        }else{
            word2 = null;
        }
        
        return new Command(word1, word2);
    }
    
    public void showCommands(){
        commands.showAll();
    }
}





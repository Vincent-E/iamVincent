

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author VincentE
 */
public abstract class ObjectMaker {
    private String name;
    private String description;
    
    public ObjectMaker(String name, String description){
        this.name = name;
        this.description = description;
    }
    
    public String getDescription(){
        return description;
    }
    
    public void setDectription(String description){
        this.description = description;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name=name;
    }
    
    
}




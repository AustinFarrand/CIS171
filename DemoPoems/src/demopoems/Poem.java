/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demopoems;

/**
 *
 * @author af0054085
 */
public class Poem {
    protected String name;
    protected int lines;
    
    Poem(String name, int lines){
        this.name = name;
        this.lines = lines;
    }
    
    public String getName(){
        return name;
    }
    
    public int getLines(){
        return lines;
    }
    
    @Override
    public String toString(){
        String info = getName() + " Lines: " + getLines();
        return info;
    }
}

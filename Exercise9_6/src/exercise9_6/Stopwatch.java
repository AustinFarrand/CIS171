/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise9_6;

/**
 *
 * @author af0054085
 */
public class Stopwatch {
    private long startTime;
    private long endTime;
    long elapsedTime;
    
    Stopwatch(){
        
    }
    
    public long getStartTime(){
        startTime = System.currentTimeMillis();
        return startTime;
    }
    
    public long getEndTime(){
        endTime = System.currentTimeMillis();
        return endTime;
    }
    
    public void start(){
        startTime = System.currentTimeMillis();
    }
    
    public void stop(){
        endTime = System.currentTimeMillis();
    }
    
    public long getElapsedTime(){
        elapsedTime = endTime - startTime;
        return elapsedTime;
    }
}

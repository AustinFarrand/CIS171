/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise10_1;

/**
 *
 * @author af0054085
 */
public class Time {
    private int hour, minute, second;
    
    public Time(){
        long elapsedTime = System.currentTimeMillis();
        this.setTime(elapsedTime);
    }
    
    public Time(long elapsedTime){
        this.setTime(elapsedTime);
    }
    
    public Time(int hour, int minute, int second){
    }
    
    public void setTime(long elapsedTime){
        long totalSeconds = elapsedTime / 1000;
        this.second = (int)totalSeconds % 60;
        
        long totalMinutes = totalSeconds / 60;
        this.minute = (int)totalMinutes % 60;
        
        long totalHours = totalMinutes / 60;
        this.hour = (int)totalHours % 24;
    }
    
    public int getHour(){
        return hour;
    }
    
    public int getMinute(){
        return minute;
    }
    
    public int getSecond(){
        return second;
    }
}

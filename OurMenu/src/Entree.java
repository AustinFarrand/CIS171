/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ourmenu;
/**
 *Class: Entree
 * Developer: Austin Farrand
 * Date: 1/26/2017
 * Purpose Define an Entree menu item
 * @author af0054085
 */
public class Entree extends MenuItem {
    private float entreePrepTime = 0;

    /**
     * Default constructor
     */
    public Entree(){
        this("Default Entree", "Default Entree description", (float) 1.00, (float) 1.00);
    }
    /**
     * Constructor expects our data as parameters
     * @param itemName
     * @param itemDescription
     * @param itemPrice
     * @param itemCost 
     */
    public Entree(String itemName, String itemDescription, float itemPrice, float itemCost){
        super(itemName, itemDescription, itemPrice, itemCost);
    }
    
    public float getEntreePrepTime() {
        return entreePrepTime;
    }

    public void setEntreePrepTime(float entreePrepTime) {
        this.entreePrepTime = entreePrepTime;
    }
    /**
     * Calculate the time for preparation
     * @return 
     */
    @Override
    public String calcPrepTime(){
        return "Entree prep time is forty minutes";
    }
    @Override
     public String returnSupplier(){
         return "This is the supplier";
     }
}

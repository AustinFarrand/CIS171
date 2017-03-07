/*
 * This package will create a menu
 */
package ourmenu;

/**
 *Class: MenuItem
 *Developer: Austin Farrand
 * Date: 1/24/2017
 * @author af0054085
 */
public abstract class MenuItem implements Comparable<MenuItem>, iMenu {
    private String itemName;
    private String itemDescription;
    private float itemCost;
    private float itemPrice;
    /**
     * This is the default constructor
     */
    public MenuItem() {
    }
    /**
     * This constructor accepts all data fields.
     * @param itemName
     * @param itemDescription
     * @param itemCost
     * @param itemPrice 
     */
    public MenuItem(String itemName, String itemDescription, float itemCost, float itemPrice) {
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.itemCost = itemCost;
        this.itemPrice = itemPrice;
    }
   
    /**
     * @return the itemName
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * @param itemName the itemName to set
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     * @return the itemDescription
     */
    public String getItemDescription() {
        return itemDescription;
    }

    /**
     * @param itemDescription the itemDescription to set
     */
    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    /**
     * @return the itemCost
     */
    public float getItemCost() {
        return itemCost;
    }

    /**
     * @param itemCost the itemCost to set
     */
    public void setItemCost(float itemCost) {
        this.itemCost = itemCost;
    }

    /**
     * @return the itemPrice
     */
    public float getItemPrice() {
        return itemPrice;
    }

    /**
     * @param itemPrice the itemPrice to set
     */
    public void setItemPrice(float itemPrice) {
        this.itemPrice = itemPrice;
    }
    
    /**
     * The toString method will return meaningful information
     * @return 
     */
    @Override
    public String toString(){
        return itemName + " $" + calcProfit();
    }
    public double calcProfit(){
        return itemPrice - itemCost;
    }
    /**
     * Implement the compareTo to allow sorting 
     * @param o
     * @return 
     */
    @Override
    public int compareTo(MenuItem o){
        if(calcProfit() > o.calcProfit())
            return 1;
        else if (calcProfit() < o.calcProfit())
            return -1;
        else
            return 0;
          
    }
    
    public abstract String calcPrepTime();
      
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ourmenu;

/**
 *
 * @author af0054085
 */
public class OurMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Object entrees[] = { new Entree(), new Entree(), new Entree() };
        
        ((Entree)entrees[0]).setItemName("Steak");
        ((Entree)entrees[0]).setItemDescription("Expensive T-Bone Steak");
        ((Entree)entrees[0]).setItemCost(20.0F);
        ((Entree)entrees[0]).setItemPrice((float)1000.00);
        
        ((Entree)entrees[1]).setItemName("Spaghetti");
        ((Entree)entrees[1]).setItemDescription("This spaghetti sucks");
        ((Entree)entrees[1]).setItemCost(5.0F);
        ((Entree)entrees[1]).setItemPrice((float)95.00);
        
        System.out.println("Entree menu items");
        
        for(int i = 0; i < entrees.length; i ++){
            System.out.println((Entree) entrees[i]);
        }
        
        System.out.println("Sorted menu items");
        java.util.Arrays.sort(entrees);
        
        for(Object item : entrees){
            System.out.println((Entree) item);
        }
        
    }
    
}

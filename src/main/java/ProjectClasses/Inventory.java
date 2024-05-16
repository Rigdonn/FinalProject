package ProjectClasses;

import java.util.ArrayList;
/**
 * Class to define people information
 * @author Alejandro Ruiz Rios
 * @version 1
 */
public class Inventory {
    private ArrayList<Items> inventory;

    /**
     * Constructor with parameters
     *
     * @param inventory List of all objects on my data base
     */
    public Inventory(ArrayList<Items> inventory) {
        this.inventory = inventory;
    }

    public ArrayList<Items> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Items> inventory) {
        this.inventory = inventory;
    }

    public void searchItems(){
        
    }
}

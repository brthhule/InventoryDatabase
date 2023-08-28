package CollectonItems;

import Infrastructure.*;

public class Item {
    //Private variables
    private String name;
    private int amount;

    //Default Constructor
    public Item () {
        Misc.db("Item", "Item (Default)");
        name = "NULL";
        amount = 0;
    }

    //2 Parameter Constructor
    public Item (String nameArg, int amountArg) {
        Misc.db("Item", "Item (2 param)");
        name = nameArg;
        amount = amountArg;
    }

    //Getters
    public String getName() {
        Misc.db("Item", "getName");
        return name;
    }
    public int getAmount(){
        Misc.db("Item", "getAmount");
        return amount;
    }

    //Modifiers
    public void increaseAmount(int amountArg){
        Misc.db("Item", "increaseAmount");
        amount += amountArg;
    }


}

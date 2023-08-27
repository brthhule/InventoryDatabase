public class Item {
    //Private variables
    private String name;
    private int amount;

    //Default Constructor
    public Item () {
        name = "NULL";
        amount = 0;
    }

    //2 Parameter Constructor
    public Item (String nameArg, int amountArg) {
        name = nameArg;
        amount = amountArg;
    }

    //Getters
    public String getName() {
        return name;
    }
    public int getAmount(){
        return amount;
    }

    //Modifiers
    public void increaseAmount(int amountArg){
        amount += amountArg;
    }


}

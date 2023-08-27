public class Item {
    private String name;
    private int amount;
    public Item () {
        //Empty
    }

    public Item (String nameArg, int amountArg) {

    }

    public String getName() {
       return name;
    }

    //std::string getName();
    //int getAmount();
    //void increaseAmount(int amountArg);

    public void increaseAmount(int amountArg){
        amount += amountArg;
    }

    public int getAmount(){
        return amount;
    }



}

/*
Item() {
        name = "NULL";
        amount = NULL;
        }

        Item::Item(std::string nameArg, int amountArg) {
        name = nameArg;
        amount = amountArg;
        }

        std::string Item::getName() {
        return name;
        }

        int Item::getAmount() {
        return amount;
        }

        void Item::increaseAmount(int amountArg) {
        amount += amountArg;
        }
*/
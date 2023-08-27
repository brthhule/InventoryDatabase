public class Item {
    private String name;
    private int amount;
    public Item () {
        name = "NULL";
        amount = 0;
    }
    public Item (String nameArg, int amountArg) {
    }

    Item() {

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
    public String getName();
            int getAmount();
            void increaseAmount(int amountArg);


            }

            }

/*

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
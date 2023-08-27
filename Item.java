public class Item {
    private String name;
    private int amount;
    public Item () {
        //Empty
    }

    public Item (String nameArg, int amountArg) {

    }

    public String getName() {
    }
}
    std::string getName();
    int getAmount();
    void increaseAmount(int amountArg);


};

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

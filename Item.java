public class Item {
}


#ifndef ITEM_H
        #define ITEM_H

        #include <iostream>
#include <string>

class Item {
    public:
    Item();
    Item(std::string nameArg, int amountArg);

    std::string getName();
    int getAmount();
    void increaseAmount(int amountArg);

    private:
    std::string name;
    int amount;

};

#endif

        #include "Item.h"

        Item::Item() {
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

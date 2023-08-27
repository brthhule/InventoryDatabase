public class Database {
}

#ifndef DATABASE_H
        #define DATABASE_H

        #include <iostream>
#include <stdio.h>
        #include <vector>
#include <unordered_map>
#include <string.h>

        #include "Item.h"
        #include "Collection.h"
        #include "Misc.h"

class Database {
    public:
    Database();
    void DBaddItem();
    void createCollection(std::string collectionNmae);
    void show();



    //function pointer


    private:
    void showAllOrganized();
    void showAllNotOrganized();
    Collection baseCollection;

};

#endif


        #include "Database.h"

        Database::Database() {
        //Empty
        }

        void Database::DBaddItem() {
        //Item information-
        std::string collectionName;
        std::string itemName;
        std::string amount;

        //Get item information
        std::cout << "Enter a collection name: ";
        std::getline(std::cin, collectionName);
        std::cout << "Enter an item: ";
        std::getline(std::cin, itemName);
        std::cout << "Enter an amount: ";
        std::getline(std::cin, amount);

        //Create item from item information-- item name and amount
        Item newItem (itemName, std::stoi(amount));

        //If the collection doesn't already exists in the base collection
        if (!baseCollection.hasCollection(collectionName))
        {
        //Create collection
        createCollection(collectionName);
        //Collection now exists
        }

        //Create pointer to the collection of the item
        Collection* collectionPtr = baseCollection.getCollection(collectionName);
        //Add the item to that collection
        collectionPtr->addItem(newItem);
        //Delete pointer
        delete collectionPtr;
        //End method
        return;
        }

//Create a new collection for base collection
        void Database::createCollection(std::string collectionNmae) {
        std::string pathName = "SavedInfo/" + collectionNmae;
        //Create new collection object
        Collection newC (pathName, collectionNmae);
        //Add the collection oject to the baseCollection map of collections
        baseCollection.addCollection(newC);
        }

        void Database::show() {
        std::string input;
        Misc newMisc;
        newMisc.showOptions("show");
        std::getline(std::cin, input);
        input = newMisc.getInput(3, input);



        switch (input.at(0)) {
        case 1:
        showAllOrganized();
        break;
        case 2:
        showAllNotOrganized();
        break;
        case 3:
        baseCollection.showCollection();
        break;
        }
        }

        void Database::showAllOrganized() {

        }

        void Database::showAllNotOrganized() {

        }



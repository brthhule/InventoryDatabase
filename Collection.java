import java.util.*;
import java.util.HashMap;

public class Collection {

    private HashMap <String, Collection> collectionMap;
    private HashMap <String, Item> itemMap;
    private String name;
    private String pathName;
    private int level;

    public Collection() {
        //Empty
    }

    public Collection(String pathNameArg, String nameArg) {
        pathName = pathNameArg;
    }

    public void addCollection(Collection newC) {
        collectionMap.put(newC.getName(), newC);
    }

    public String getName() {
        return name;
    }

    public void addItem(Item newI) {

        //If item exists
        if (itemMap.containsKey(newI.getName())) {
            itemMap.at(newI.getName()).increaseAmount(newI.getAmount());
        }
    }

    Item getItem(String itemName) {
        return itemMap.at(itemName);
    }

    bool hasItem(String itemName) {
        return itemMap.count(itemName);
    }

    bool hasCollection(String collectionName) {
        return collectionMap.count(collectionName);
    }

    void showCollection() {
        System.out.print() << "Collections: \n";
        //Collection c = showCollectionTemplate<Collection>(collectionMap);
        System.out.print() << "Items: \n";
        showCollection2(i);
        //Item i = showCollectionTemplate<Item>(itemMap);
    }


}
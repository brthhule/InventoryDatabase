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
            itemMap.get(newI.getName()).increaseAmount(newI.getAmount());
        }
    }

    public Item getItem(String itemName) {
        return itemMap.get(itemName);
    }

    public boolean hasItem(String itemName) {
        return itemMap.containsKey(itemName);
    }

    public boolean hasCollection(String collectionName) {
        return collectionMap.containsKey(collectionName);
    }

    public void showCollection() {
        System.out.print("Collections: \n");
        System.out.print("Items: \n");
    }
}
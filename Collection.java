import java.util.*;
import java.util.HashMap;

public class Collection {
                    //Private variables
    private HashMap <String, Collection> collectionMap;
    private HashMap <String, Item> itemMap;
    private String name;
    private String pathName;
    private int level;

                    //Constructors
    //Default constructor, empty, shouldn't be used
    public Collection() {
        collectionMap = new HashMap<String, Collection>();
        itemMap = new HashMap<String, Item>();
        name = "NULL";
        pathName = "NULL";
        level = -1;
        //Empty
    }

    //Three parameter constructor, should be used
    public Collection(String previousPath, String nameArg, int previousLevel) {
        collectionMap = new HashMap<String, Collection>();
        itemMap = new HashMap<String, Item>();
        name = nameArg;
        pathName = previousPath + "/" + nameArg;
        level = previousLevel++;
    }

                    //Modifiers
    public void addCollection(Collection newC) {
        collectionMap.put(newC.getName(), newC);
    }
    public void addItem(Item newI) {

        //If item exists
        if (itemMap.containsKey(newI.getName())) {
            itemMap.get(newI.getName()).increaseAmount(newI.getAmount());
        }
    }

                    //Getters
    public String getName() {
        return name;
    }
    public Item getItem(String itemName) {
        return itemMap.get(name);
    }
    public Collection getCollection (String name){return collectionMap.get(name);}
    public int getLevel(){return level;}
    public String getPathName(){return pathName;}

                    //Checkers
    public boolean hasItem(String itemName) {
        return itemMap.containsKey(itemName);
    }
    public boolean hasCollection(String collectionName) {
        return collectionMap.containsKey(collectionName);
    }

                    //Show Collection
    public void showCollection() {
        System.out.print("Collections: \n");
        System.out.print("Items: \n");
    }
}
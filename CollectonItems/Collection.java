package CollectonItems;

import java.util.HashMap;
import Infrastructure.*;

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
        Misc.db("Collection", "Collection (Default)");
        collectionMap = new HashMap<String, Collection>();
        itemMap = new HashMap<String, Item>();
        name = "NULL";
        pathName = "NULL";
        level = -1;
        //Empty
    }

    //Three parameter constructor, should be used
    public Collection(String previousPath, String nameArg, int previousLevel) {
        Misc.db("Collection", "Collection (3 param)");
        collectionMap = new HashMap<String, Collection>();
        itemMap = new HashMap<String, Item>();
        name = nameArg;
        pathName = previousPath + "/" + nameArg;
        level = previousLevel++;
    }

                    //Modifiers
    public void addCollection(Collection newC) {
        Misc.db("Collection", "addCollection");
        collectionMap.put(newC.getName(), newC);
    }
    public void addItem(Item newI) {
        Misc.db("Collection", "addItem");
        //If item exists
        if (itemMap.containsKey(newI.getName())) {
            itemMap.get(newI.getName()).increaseAmount(newI.getAmount());
        }
    }

                    //Getters
    public String getName() {
        Misc.db("Collection", "getName");
        return name;
    }
    public Item getItem(String itemName) {
        Misc.db("Collection", "getItem");
        return itemMap.get(name);
    }
    public Collection getSurfaceCollection (String name){
        Misc.db("Collection", "getSurfaceCollection");
        return collectionMap.get(name);
    }
    public Collection getDeepCollection(String collectionName){
        if (this.getName().equals(collectionName)){
            return this;
        }
        for (Collection c: collectionMap.values()){
            return c.getDeepCollection(collectionName);
        }

        Collection returnC;
        if (this.getLevel() != 1){
            returnC = new Collection ("NULL", "NULL", -1);
        }
        else{

        }
    }
    public int getLevel(){
        Misc.db("Collection", "getLevel");
        return level;
    }
    public String getPathName(){
        Misc.db("Collection", "getPathName");
        return pathName;
    }
    public int getCollectionsNum(){
        Misc.db("Collection", "getCollectionsNum");
        return collectionMap.size();}
    public HashMap<String, Collection> getCollectionMap(){
        Misc.db("Collection", "getCollectionMap");
        return collectionMap;}
    public HashMap<String, Item> getItemMap(){
        Misc.db("Collection", "getItemMap");
        return itemMap;}

                    //Checkers
    public boolean hasItem(String itemName) {
        Misc.db("Collection", "hasItem");
        return itemMap.containsKey(itemName);
    }
    public boolean hasSurfaceCollection(String collectionName) {
        Misc.db("Collection", "hasSurfaceCollection");
        return collectionMap.containsKey(collectionName);
    }
    //Iterate through all collections see if a collection exists
    public boolean hasDeepCollection(String collectionName){
        Misc.db("Collection", "hasSurfaceCollection");
        if (collectionMap.containsKey(collectionName)){
            return true;
        }
        for (Collection c: collectionMap.values()){
            return c.hasDeepCollection(collectionName);
        }
        return false;
    }

                    //Show Collection
    public void showCollection() {
        Misc.db("Collection", "showCollection");
        System.out.print("Collections: \n");
        System.out.print("Items: \n");
    }
    public void displayUnorganized() {
        Misc.db("Collection", "displayUnorganized");
        for (String i : itemMap.keySet()) {
            System.out.println("key: " + i);
        }
        for (String c : collectionMap.keySet()) {
            System.out.println("key: " + c);
        }
    }
}
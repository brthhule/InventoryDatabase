package CollectonItems;

import java.util.HashMap;
import Infrastructure.*;
import java.util.Scanner;

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
    public void createAddItem(){
        //Get Item information
        Scanner createItemScan = new Scanner (System.in);
        System.out.print("Enter an item:");
        String itemName = createItemScan.nextLine();
        System.out.print("Enter an amount: ");
        String amount = createItemScan.nextLine();

        //Create new item
        Item i = new Item(itemName, Integer.parseInt(amount));
        this.addItem(i);
        System.out.println("Item " + Colors.BLUE + itemName + Colors.RESET + " successfully added to collection " + Colors.BLUE + this.getName() + Colors.RESET);
    }

    public void createAddCollection (){
        Scanner createCollectionScan = new Scanner (System.in);
        System.out.print("Enter a name: ");
        String cName = createCollectionScan.nextLine();
        Collection c = new Collection (this.getPathName(), cName, this.getLevel());
        this.addCollection(c);
        //Print out affirmation statement, colorized
        System.out.println("Collection " + Colors.BLUE + cName + Colors.RESET + " successfully added to collection " + Colors.BLUE + this.getName() + Colors.RESET);
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
        //If this collection is the right one
        if (this.getName().equals(collectionName)){
            return this;
        }
        //Search through all the collections this collection has
        for (Collection c: collectionMap.values()){
            Collection tempC = c.getDeepCollection(collectionName);
            if (!tempC.getName().equals("NULL"))
            {
                return tempC;
            }
        }

        //When the recursion "iterator" reaches the end of a path and has to go up to go the next one, return a null-type collection
        if (this.getLevel() != 1){
            Collection notHereC = new Collection ("NULL", "NULL", -1);
            return notHereC;
        }

        //Return statement bc all paths must return a value; should never be used
        Collection errorC = new Collection ("Error", "Error", -2);
        return errorC;

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
    public void showThisCollection() {
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

    public void showAllCollections(){
        String level = Integer.toString(this.getLevel());
        System.out.println("Collection name: " + this.name + "; Level: " + level);
        //Iterate through all collections in this collection
        for (Collection c: this.getCollectionMap().values()){
            c.showAllCollections();
        }
    }
}
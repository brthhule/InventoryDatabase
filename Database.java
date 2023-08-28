import java.util.Scanner;

import CollectonItems.Collection;
import CollectonItems.Item;
import Infrastructure.*;

public class Database {
                    //Private variables
    private Collection baseCollection;
    private final Scanner databaseScan;

                    //Constructors
    //Default Constructor
    public Database(){
        Misc.db("Database", "Database");
        baseCollection = new Collection("SavedInfo/", "baseCollection", 0);
        databaseScan = new Scanner(System.in);
    }

                    //Modifiers
    //Add an item to the database
    public void addObject() {
        Misc.db("Database", "addItem");
        Scanner addItemScan = new Scanner (System.in);

        //Show options
        int input = Misc.showOptions("addItem");
        switch (input){
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            default:
                System.out.println("Error occurred...");
        }

        String collectionName;
        String itemName;
        String amount;

        //Get item information
        System.out.print("Enter a collection name (Enter -1 to quit):");
        collectionName = databaseScan.nextLine();

        //Exit functionality
        if (collectionName.equals("-1")){
            return;
        }

        System.out.print("Enter an item:");
        itemName = databaseScan.nextLine();
        System.out.print("Enter an amount: ");
        amount = databaseScan.nextLine();

        //Create new item
        Item i = new Item(itemName, Integer.parseInt(amount));

        //If the collection doesn't already exist in the base collection
        if (!baseCollection.hasSurfaceCollection(collectionName)) {
            //Create collection
            Collection c = new Collection (baseCollection.getPathName(), collectionName, baseCollection.getLevel());
            //Add collection
            baseCollection.addCollection(c);
        }

        //Collection now exists, add item to collection
        baseCollection.getSurfaceCollection(collectionName).addItem(i);
    }

    public void createCollection(String name){
        Misc.db("Database", "createCollection");
        String pathName = "SavedInfo/" + name;
        //Create new collection object
        Collection newC = new Collection (pathName, name, baseCollection.getLevel());
        //Add the collection oject to the baseCollection map of collections
        baseCollection.addCollection(newC);
    }
    
    public void showAllUnorganized(){
        Misc.db("Database", "showAllUnorganized");
    }

    public void show() {
        Misc.db("Database", "show");
        Scanner showScan = new Scanner (System.in);
        Misc.showOptions("show");

        String input = showScan.nextLine();
        input = Misc.getInput(3, input);

        switch (input.charAt(0)) {
            case 1:
                showAllOrganized();
                break;
            case 2:
                showAllUnorganized();
                break;
            case 3:
                baseCollection.showCollection();
                break;
        }
    }

    public void showAllOrganized() {
        Misc.db("Database", "showAllOrganized");
    }

    public void moveCollection (String moveCollection, String destinationCollection){

    }
}



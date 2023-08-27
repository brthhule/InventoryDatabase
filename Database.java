import java.util.Scanner;

public class Database {
    //Private variables
    private Collection baseCollection;
    private Scanner databaseScan;

    //Constructor
    public Database(){
        databaseScan = new Scanner(System.in);
    }

    //Add an item to the database
    public void DBaddItem() {
        //Item information-
        String collectionName;
        String itemName;
        String amount;

        //Get item information
        System.out.print("Enter a collection name:");
        collectionName = databaseScan.nextLine();
        System.out.print("Enter an item:");
        itemName = databaseScan.nextLine();
        System.out.print("Enter an amount: ");
        amount = databaseScan.nextLine();

        Item newItem = new Item(itemName, Integer.parseInt(amount));

        //If the collection doesn't already exists in the base collection
        if (!baseCollection.hasCollection(collectionName)) {
            //Create collection
            createCollection(collectionName);
            //Collection now exists
        }
    }

    public void createCollection(String name){
        String pathName = "SavedInfo/" + name;
        //Create new collection object
        Collection newC = new Collection (pathName, name);
        //Add the collection oject to the baseCollection map of collections
        baseCollection.addCollection(newC);
    }
    
    public void showAllUnorganized(){
        
    }

    void show() {
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

    void showAllOrganized() {

    }
}



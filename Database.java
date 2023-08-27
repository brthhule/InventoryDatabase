import java.util.Scanner;

public class Database {
    
    private Collection baseCollection;
    Scanner databaseScan;
    
    public Database(){
        databaseScan = new Scanner(System.in);
    }
    public void DBaddItem(){
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

        Item newItem = new Item (itemName, Integer.parseInt(amount));

        //If the collection doesn't already exists in the base collection
        if (!baseCollection.hasCollection(collectionName))
        {
            //Create collection
            createCollection(collectionName);
            //Collection now exists
        }

    public void createCollection(String collectionNmae){
        
    }
    
    public void show(){
        
    }
    
    public void showAllUnorganized(){
        
    }
    

}

//Create a new collection for base collection
        void Database::createCollection(String collectionNmae) {
        String pathName = "SavedInfo/" + collectionNmae;
        //Create new collection object
        Collection newC (pathName, collectionNmae);
        //Add the collection oject to the baseCollection map of collections
        baseCollection.addCollection(newC);
        }

        void Database::show() {
        String input;
        Misc newMisc;
        newMisc.showOptions("show");
        getline(cin, input);
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



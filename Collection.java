import java

public class Collection {
    Collection() {
        //Empty
    }

    Collection(String pathNameArg, String nameArg) {
        pathName = pathNameArg;
    }

    void addCollection(Collection newC) {
        collectionMap[newC.getName()] = newC;
    }

    String getName() {
        return name;
    }

    void addItem(Item newI) {

        //If item exists
        if (itemMap.count(newI.getName())) {
            itemMap.at(newI.getName()).increaseAmount(newI.getAmount());
        }
    }

    Item getItem(String itemName) {
        return itemMap.at(itemName);
    }

    Collection *

    getCollection(String collectionName) {
        return &collectionMap.at(collectionName);
    }

    bool hasItem(String itemName) {
        return itemMap.count(itemName);
    }

    bool hasCollection(String collectionName) {
        return collectionMap.count(collectionName);
    }

    void showCollection() {
        System.out.print() << "Collections: \n";
        void*c = &collectionMap;
        showCollection2(c);
        //Collection c = showCollectionTemplate<Collection>(collectionMap);
        System.out.print() << "Items: \n";
        void *i = &itemMap;
        showCollection2(i);
        //Item i = showCollectionTemplate<Item>(itemMap);
    }

    void showCollection2(void*ptr) {
        unordered_map < String,>map = &ptr;
        for (auto it = ptr -> begin(); it != map.end(); it++) {
            //Print out the name of the itth object
            System.out.print() << "- " << (it -> first);
        }
    }

    hash_map <String, Collection> collectionMap;
    unordered_map<String, Item> itemMap;
    String name;
    String pathName;
    int level;

    template <typename s, typename k>
    class showCollectionsType {
        public:
        void showLayerItems() {
            System.out.print() << "Collections in collection"
        }
        private:
        unordered_map<String, k> objectMap;
        String
    };

    //I think that the problem is the scope of the functions vs the scope of the array of functions. The compiler sees the functions and the array as having different scopes, which is why it doesn't work in the class but it does in Stackoverflow solutions. I'm thinking of creating a functional header/cpp file to have the functions, but the hard part is passing the collections and items if the file is being called from a collection-- circular dependency issues. What if I do it but pass only the String vectors to the third party file-- that way, no object is passed; only a standard object.
    typedef void (*functionptr)();

    functionptr showAllOrganized();
    void showAllUnorganized();

    functionptr functions[3] = { &showAllOrganized };
}
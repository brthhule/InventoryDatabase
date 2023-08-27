public class Main {
    public static void main (String[] args){
        Database mainDatabase;
        Misc newMisc;
        String input;
        Misc.showOptions("main");
        getline(cin, input);
        input = newMisc.getInput(3, input);

        switch (input.at(0)) {
            case 1:
                mainDatabase.DBaddItem();
                break;
            case 2:
                mainDatabase.show();
                break;
            case 3:
                System.out.print() << "Ending program...";
                break;
            default:
                //nothing
                System.out.print() << "Error occurred probably...";
        }
    }
}

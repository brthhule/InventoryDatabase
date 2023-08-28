import java.util.Scanner;
import Infrastructure.*;

public class Main {
    public static void main (String[] args){
        Misc.db("Main", "main");
        Database mainDatabase = new Database();
        int input = Misc.getOption("main");

        switch (input) {
            case 0:
                System.out.println("Error; you cannot not go to the previous menu from the base menu... Please try again:");
                main (args);
                break;
            case 1:
                mainDatabase.addObject();
                break;
            case 2:
                mainDatabase.show();
                break;
            case 3:
                System.out.print("Ending program...");
                break;
            default:
                //nothing
                System.out.print("Error occurred probably...");
        }
    }
}

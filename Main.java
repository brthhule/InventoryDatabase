import java.util.Scanner;
import Infrastructure.*;

public class Main {
    public static void main (String[] args){
        Misc.db("Main", "main");
        Database mainDatabase = new Database();
        Scanner mainScan = new Scanner(System.in);
        Misc.showOptions("main");
        String input = mainScan.nextLine();
        input = Misc.getInput(3, input);

        switch (input.charAt(0)) {
            case 1:
                mainDatabase.addItem();
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

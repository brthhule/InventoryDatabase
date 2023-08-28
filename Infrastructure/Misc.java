package Infrastructure;

import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Misc {
    //Private variables
    private final static boolean debuggingMode = true;

    //Constructor
    public Misc (){
        db("Misc", "Misc");
        //Empty, not really needed bc all class methods are static
    }

    //Display what method the compiler is in and which final it is
    public static void db (String filename, String methodName){
        //Can't do db within db, creates infinite loop
        //db("Misc", "db");
        //Only show info if you want to see what is shown
        if (debuggingMode){
            System.out.println("File name: " + filename + "; Method name: " + methodName);
        }
        //Else, show nothing
    }

    //Show the options that a user can pick
    public static void showOptions(String filename) {
        db("Misc", "showOptions");
        String filePath = "ShowOptions\\main.txt";

        //String filePath = "src\\ShowOptions\\" + filename + ".txt";
        File newFile = new File (filePath);
        System.out.println("List of options:");
        Scanner fileReader = null;
        //Print options
        try {
            fileReader = new Scanner (newFile);
            String line = " ";
            while (fileReader.hasNextLine()) {
                line = fileReader.nextLine();
                System.out.print(line + "\n");
            }
            fileReader.close();
        } catch (FileNotFoundException d){
            System.out.println("File does not exist...");
        } catch (Exception e) {
            System.out.println("Error occurred... please try again");
        }
        System.out.print("Select an option: ");
    }

    public static String getInput(int highestNumber, String input) {
        db("Misc", "getInput");
        ArrayList<String> AV = new ArrayList<String>();
        for (int x = 1; x <= highestNumber; x++) {
            AV.add(Integer.toString(x));
        }

        for (String av : AV) {
            if (input == av)
                return input;
        }
        System.out.print ("Invalid entry; please try again...\n");
        getInput(highestNumber, input);
        return "NULL";
    }
}
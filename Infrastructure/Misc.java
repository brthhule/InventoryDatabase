package Infrastructure;

import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Misc {
    //Private variables
    private final static boolean debuggingMode = true;
    private final static Scanner input = new Scanner (System.in);

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
        System.out.print(Colors.PURPLE);
        if (debuggingMode){
            System.out.println("File name: " + filename + "; Method name: " + methodName);
        }
        System.out.print(Colors.RESET);
        //Else, show nothing
    }

    //Get the user's picked option
    public static int getOption(String filename) {
        db("Misc", "getOption");
        int highestNumber = showOptions(filename);
        Scanner showOptionsScan = new Scanner (System.in);
        String input = showOptionsScan.nextLine();
        input = getInput(highestNumber, input);
        return Integer.parseInt(input);
    }

    //Display options
    public static int showOptions (String filename){
        db("Misc", "showOptions");
        String filePath = "ShowOptions\\" + filename + ".txt";

        //String filePath = "src\\ShowOptions\\" + filename + ".txt";
        File newFile = new File (filePath);
        System.out.println("List of options:");
        Scanner fileReader = null;
        int highestNumber = 0;
        //Print options
        try {
            fileReader = new Scanner (newFile);
            String line = " ";
            //Get highest number
            highestNumber = Integer.parseInt(fileReader.nextLine());
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
        return highestNumber;
    }

    public static String getInput(int highestNumber, String input) {
        db("Misc", "getInput");
        ArrayList<String> AV = new ArrayList<String>();
        for (int x = 0; x <= highestNumber; x++) {
            AV.add(Integer.toString(x));
        }

        for (String av : AV) {
            if (input.equals (av)) {
                return input;
            }
        }
        System.out.print ("Invalid entry; please try again...\n");
        getInput(highestNumber, input);
        return "NULL";
    }

    public static String getItemName(String IorC) {
        System.out.print("Enter a name for this " + IorC + "(-1 to return to the previous menu): ");
        return input.nextLine();
    }
}
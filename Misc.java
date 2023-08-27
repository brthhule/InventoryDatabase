import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Misc {
    public Misc (){
        //Empty
    }

    public static void showOptions(String filename) {
        String filePath = "src\\ShowOptions\\test.txt";

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
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Misc {
    public Misc (){
        //Empty
    }

    public static void showOptions(String filename) {
        String filePath = "TxtFiles\\\\" + filename + ".txt";

        try {
            File newFile = new File (filePath);
            Scanner fileReader = new Scanner (newFile);
            String line = fileReader.nextLine();
            System.out.print(line);
            while (fileReader.hasNextLine()) {
                line = fileReader.nextLine();
                System.out.print("\n" + line);
            }
            fileReader.close();
        } catch (Exception e) {
            System.out.println("Error occurred... please try again");
        }
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
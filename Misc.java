import java.util.ArrayList;

public class Misc {
    public Misc (){
        //Empty
    }

    /*public void showOptions(String filename) {
        filename = "TxtFiles\\\\" + filename + ".txt";
        myfile.open(filename);
        String line;
        if (myfile.is_open())
        {
            getline(myfile, line);
            cout << line;
            while (getline (myfile, line))
            {
                cout << "\n" << line;
            }
        }
    }*/

        public String getInput(int highestNumber, String input) {
            ArrayList<String> AV = new ArrayList<String>();
            for (int x = 1; x <= highestNumber; x++) {
                AV.push_back(to_String(x));
            }

            for (String av : AV) {
                if (input == av)
                    return input;
            }
            cout << "Invalid entry; please try again...\n";
            getInput(highestNumber, input);
            return "NULL";
        }
    }


}



        void

        class Misc {
        public:
        Misc();
        void showOptions(String filename);
        String getInput(int highestNumber, String input);
        private:
        };
        #endif
public class Misc {
    public Misc (){
        showOptions(String filename) {
            ifstream myfile;
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
        }

        String Misc::getInput(int highestNumber, String input) {
            vector<String> AV;
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
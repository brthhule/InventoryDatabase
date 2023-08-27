public class Misc {
    public Misc (){
        Misc::showOptions(std::string filename) {
            std::ifstream myfile;
            filename = "TxtFiles\\\\" + filename + ".txt";
            myfile.open(filename);
            std::string line;
            if (myfile.is_open())
            {
                getline(myfile, line);
                std::cout << line;
                while (std::getline (myfile, line))
                {
                    std::cout << "\n" << line;
                }
            }
        }

        std::string Misc::getInput(int highestNumber, std::string input) {
            std::vector<std::string> AV;
            for (int x = 1; x <= highestNumber; x++) {
                AV.push_back(std::to_string(x));
            }

            for (std::string av : AV) {
                if (input == av)
                    return input;
            }
            std::cout << "Invalid entry; please try again...\n";
            getInput(highestNumber, input);
            return "NULL";
        }
    }


}



        void

        class Misc {
        public:
        Misc();
        void showOptions(std::string filename);
        std::string getInput(int highestNumber, std::string input);
        private:
        };
        #endif
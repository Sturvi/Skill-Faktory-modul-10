import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {
    public String translate() throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileInputStream("D13/src/message.txt"));


        StringBuilder result = new StringBuilder();

        while (scanner.hasNextLine()) {
            String[] line = scanner.nextLine().split("");
            for (int i = 0; i < line.length; i++) {
                result.append(getSymbolTranslate(line[i]));
            }
            result.append("\n");
        }

        return result.toString().trim();
    }

    private String getSymbolTranslate(String s) {
        switch (s) {
            case ("A"):
                return "1000001";
            case ("B"):
                return "1000010";
            case ("C"):
                return "1000011";
            case ("D"):
                return "1000100";
            case ("E"):
                return "1000101";
            case ("F"):
                return "1000110";
            case ("G"):
                return "1000111";
            case ("H"):
                return "1001000";
            case ("I"):
                return "1001001";
            case ("J"):
                return "1001010";
            case ("K"):
                return "1001011";
            case ("L"):
                return "1001100";
            case ("M"):
                return "1001101";
            case ("N"):
                return "1001110";
            case ("O"):
                return "1001111";
            case ("P"):
                return "1010000";
            case ("Q"):
                return "1010001";
            case ("R"):
                return "1010010";
            case ("S"):
                return "1010011";
            case ("T"):
                return "1010100";
            case ("U"):
                return "1010101";
            case ("V"):
                return "1010110";
            case ("W"):
                return "1010111";
            case ("X"):
                return "1011000";
            case ("Y"):
                return "1011001";
            case ("Z"):
                return "1011010";
            default:
                return s;
        }
    }
}

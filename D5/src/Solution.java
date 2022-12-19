import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Solution {
    public boolean arePalindromes() throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileReader("D5/src/strings.txt"));
        if (!scanner.hasNextLine()) return false;

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine().replaceAll(" ", "");
            String reverseLine = new StringBuilder(line).reverse().toString();

            if (!line.equalsIgnoreCase(reverseLine)){
                return false;
            }
        }

        return true;
    }
}

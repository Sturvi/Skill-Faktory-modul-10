import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Solution {
    public boolean arePalindromes() throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileReader("D5/src/strings.txt"));

        boolean empty = true;
        while (scanner.hasNextLine()) {
            empty = false;
            String line = scanner.nextLine();
            int start = 0;
            int end = line.length()-1;

            while (start < end) {
                if (!Character.toString(line.charAt(start)).equalsIgnoreCase (Character.toString(line.charAt(end)))) {
                    return false;
                }
                start++;
                end--;
                while (Character.toString(line.charAt(start)).equals(" "))
                    start++;
                while (Character.toString(line.charAt(end)).equals(" "))
                    end--;
            }
        }
        return empty ? false : true;
    }
}

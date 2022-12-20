import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public void dance() throws IOException {
        Scanner scanner = new Scanner(new FileInputStream("D7/src/dance.txt"));
        FileWriter writer = new FileWriter("D7/src/rhythm.txt");

        int rhythm = scanner.nextInt();
        StringBuilder result = new StringBuilder();
        while (scanner.hasNextInt()){
            int steps = scanner.nextInt();
            result.append(steps / rhythm).append(" ").append(steps % rhythm).append("\n");
        }

        writer.write(result.toString().trim());
        scanner.close();
        writer.close();
    }
}

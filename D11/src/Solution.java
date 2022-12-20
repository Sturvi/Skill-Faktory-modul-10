import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public void solve() throws IOException {
        Scanner scanner = new Scanner(new FileInputStream("D11/src/arithmetic.txt"));

        StringBuilder result = new StringBuilder();
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            String [] lineArray = line.split(" ");
            int answer=0;
            switch (lineArray[1]){
                case ("+"):
                    answer = Integer.parseInt(lineArray[0]) + Integer.parseInt(lineArray[2]);
                    break;
                case ("-"):
                    answer = Integer.parseInt(lineArray[0]) - Integer.parseInt(lineArray[2]);
                    break;
                case ("*"):
                    answer = Integer.parseInt(lineArray[0]) * Integer.parseInt(lineArray[2]);
                    break;
                case ("/"):
                    answer = Integer.parseInt(lineArray[0]) / Integer.parseInt(lineArray[2]);
                    break;
            }
            result.append(line).append(" = ").append(answer).append("\n");
        }

        scanner.close();
        FileWriter writer = new FileWriter("D11/src/answers.txt");
        writer.write(result.toString().trim());
        writer.close();
    }
}

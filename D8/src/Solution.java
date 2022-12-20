import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {
    public void solution(double n) throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileInputStream("Root/src/EGE.txt"));

        scanner.nextLine();
        while (scanner.hasNextLine()){
            String [] line = scanner.nextLine().split(";");
            if (Double.parseDouble(line[2]) > n){
                System.out.println(line[0]);
            }
        }
    }
}

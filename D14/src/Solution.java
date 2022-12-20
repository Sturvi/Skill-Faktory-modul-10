import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {
    public int findMaxQuantity() throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileInputStream("D14/src/forest.txt"));

        int [][] map = new int[10][10];
        int j=0;
        while (scanner.hasNextLine()){
            String[] temp = scanner.nextLine().split(";");
            for (int i = 0; i < 10; i++) {
                map[j][i]= Integer.parseInt(temp[i]);
            }
            j++;
        }

        for (int i = 1; i < 10; i++) {
            map[0][i] += map[0][i-1];
            map[i][0] += map[i-1][0];
        }

        for (int i = 1; i < 10; i++) {
            for (int k = 1; k < 10; k++) {
                map[i][k] += Math.max(map[i-1][k], map[i][k-1]);
            }
        }

        return map[9][9];
    }
}

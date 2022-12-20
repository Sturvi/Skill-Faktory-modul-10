import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public void solution() throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileInputStream("D15/src/trees.txt"));

        ArrayList<Integer> trees = new ArrayList<>();
        while (scanner.hasNextInt()){
            trees.add(scanner.nextInt());
        }

        if (trees.size() == 1)
            System.out.println(trees.get(0));
        if (trees.size() == 2)
            System.out.println(Math.max(trees.get(0), trees.get(1)));

        if (trees.size() % 2 == 0){
            int maxSum = 0;
            int maxSum2 = 0;

            for (int i = 0; i < trees.size(); i += 2) {
                maxSum += trees.get(i);
            }

            for (int i = 1; i < trees.size(); i += 2) {
                maxSum2 += trees.get(i);
            }

            System.out.println(Math.max(maxSum, maxSum2));
        }

        if (trees.size() % 2 == 1){
            int maxSum = 0;
            int tempSum = 0;

            for (int i = 0; i < trees.size()-1; i += 2) {
                tempSum += trees.get(i);
            }

            maxSum = tempSum;
            tempSum = 0;

            for (int i = 1; i < trees.size(); i += 2) {
                tempSum += trees.get(i);
            }

            maxSum = Math.max(maxSum, tempSum);
            tempSum = 0;

            for (int i = 2; i < trees.size(); i += 2) {
                tempSum += trees.get(i);
            }

            maxSum = Math.max(maxSum, tempSum);

            System.out.println(maxSum);
        }
    }
}

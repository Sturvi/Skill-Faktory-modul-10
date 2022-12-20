import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution {
    public void findMerchant(String name) throws FileNotFoundException {
        Scanner scanner = new Scanner( new FileInputStream("Root/src/outcome.txt"));

        scanner.nextLine();

        int totalSum = 0;

        while (scanner.hasNextLine()){
            String [] line = scanner.nextLine().split(";");

            if (line[1].equals(name)){
                int tempSum=Integer.parseInt(line[3]) * Integer.parseInt(line[4]);
                totalSum += tempSum;
                System.out.println(line[2] + "," + line[3] + "," + line[4] + "," + tempSum);
            }
        }

        DecimalFormat df = new DecimalFormat("#.0");
        System.out.println("tax: " + df.format((totalSum/100.0)*15));

        scanner.close();
    }
}

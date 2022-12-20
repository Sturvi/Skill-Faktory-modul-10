import java.io.*;
import java.util.Scanner;

public class Solution {
    public void solution(String district, int fromYear, int toYear) throws IOException {
        Scanner scanner = new Scanner(new FileInputStream("Root/src/crop_volumes.txt"));

        String[] line = scanner.nextLine().split(";");
        int startIndex=0;
        int endIndex = 0;

        for (int i = 2; i < line.length; i++) {
            if (line[i].equals(Integer.toString(fromYear))){
                startIndex = i;
            }
            if (line[i].equals(Integer.toString(toYear))){
                endIndex = i;
            }
            if (startIndex !=0 && endIndex !=0)
                break;
        }

        StringBuilder result = new StringBuilder();
        result.append(line[0]).append(";").append(line[startIndex]).append(";").append(line[endIndex]).append("\n");

        while (scanner.hasNextLine()){
            line = scanner.nextLine().split(";");

            if (district.equals(line[1]) &&
                    procent(Double.parseDouble(line[startIndex]), Double.parseDouble(line[endIndex])) > 4){
                result.append(line[0]).append(";").append(Double.parseDouble(line[startIndex])).append(";").append(Double.parseDouble(line[endIndex])).append("\n");
            }
        }

        scanner.close();

        FileWriter writer = new FileWriter("Root/src/data.txt");
        writer.write(result.toString().trim());
        writer.close();
    }

    static double procent (double firstNumber, double secondNumber){
        return ((secondNumber * 100) / firstNumber) - 100;
    }
}

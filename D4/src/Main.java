import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("D4/src/numbers.txt");
        Scanner scanner = new Scanner(fileReader);
        FileWriter fileWriter = new FileWriter("D4/src/output.txt");

        int count = 1;
        boolean test = false;

        while (scanner.hasNextInt()){
            if (scanner.nextInt() == count){
                if (test) {
                    fileWriter.write(System.getProperty( "line.separator" ));
                }
                fileWriter.write(Integer.toString(count));
                test = true;
            }
            count++;
        }

        if (!test){
            fileWriter.write("0");

        }

        fileReader.close();
        fileWriter.close();
    }
}
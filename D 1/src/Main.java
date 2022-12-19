import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("test.txt");
        Scanner scanner = new Scanner(fileInputStream);

        double sum=0;
        while (scanner.hasNextLine()){
            String[] line = scanner.nextLine().split(";");
            sum += Double.parseDouble(line[1]) * Double.parseDouble(line[2]);
        }
        System.out.println(sum);
    }
}
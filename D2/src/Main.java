import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("test2.txt");
        Scanner scanner = new Scanner(fileInputStream);

        int count = 0;
        while (scanner.hasNext()){
            count++;
            scanner.next();
        }
        System.out.println(count);
    }
}
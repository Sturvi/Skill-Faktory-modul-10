import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("Z10.2.2/src/files/answer.txt");
        int x = 0;
        while ((x = inputStream.read()) != 10);

        while (((x = inputStream.read()) != -1) && (x != 10)){
            System.out.print((char) x);
        }
    }
}
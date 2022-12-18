import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int x = 0;
        FileInputStream fileInputStream = new FileInputStream("Z 10.2.3/src/files/answer.txt");
        int y = 0;
        while ((x = fileInputStream.read()) != -1) {
            if (x >= 48 && x <= 57) {
                y++;
            }
        }
        System.out.println(y);
    }
}
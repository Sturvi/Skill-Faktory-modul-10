import java.util.Scanner;
import java.io.*;

public class Main {


    public static void main(String[] args) throws IOException{

        String text = "GIVE ME THE CODE, PLEASE";

        FileOutputStream fileOutputStream = new FileOutputStream("Root/files/request.txt");

        for (int i = 0; i < text.length(); i++) {
            fileOutputStream.write(text.getBytes());
        }
        fileOutputStream.close();

/*

Create file request.txt from folder "files" and write phrase
GIVE ME THE CODE, PLEASE
there
*/

    }

}

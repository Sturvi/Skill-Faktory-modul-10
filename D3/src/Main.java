import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("D3/src/data.txt");
        Scanner scanner = new Scanner(fileInputStream);

        int maxNumber = scanner.nextInt();

        ArrayList<Integer> divisors = new ArrayList<>();

        while (scanner.hasNextInt()){
            divisors.add(scanner.nextInt());
        }

        int composition = 1;

        for (int i = 1; i <= maxNumber; i++) {
            boolean test = false;
            for (int j = 0; j < divisors.size(); j++) {
                if (i % divisors.get(j) == 0){
                    test = true;
                    break;
                }
            }

            if (test)
                composition *= i;
        }

        System.out.println(composition);
    }
}
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @program: Assignment4
 * @filename: ReadFileInput
 * @author: Ke Chen
 * @date: 2020/9/27
 * @description:
 **/
public class ReadFileInput {
    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "quote.txt";
        Scanner scanner = new Scanner(new File(fileName));
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
    }
}

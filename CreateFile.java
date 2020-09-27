import java.io.*;
import java.util.Scanner;

/**
 * @program: Assignment4
 * @filename: CreateFile
 * @author: Ke Chen Ke Chen
 * @date: 2020/9/27
 * @description:
 **/
public class CreateFile {
    public static void main(String[] args) throws FileNotFoundException {
        String outputFilename = "command_line_input.txt";
        Scanner scanner = new Scanner(System.in);
        BufferedWriter bw = null;
        FileWriter fw = null;
        try {
            fw = new FileWriter(outputFilename, false);
            bw = new BufferedWriter(fw);
            while (true) {
                String line = scanner.nextLine();
                if (line.equals("@q")) {
                    break;
                } else {
                    bw.write(line + "\n");
                }
            }
            System.out.println("finish");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null)
                    bw.close();
                if (fw != null)
                    fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

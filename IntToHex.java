import java.util.Scanner;

/**
 * @program: Assignment4
 * @filename: IntToHex
 * @author: Ke Chen
 * @date: 2020/9/27
 * @description:
 **/
public class IntToHex {
    public static void main(String[] args) throws NumberFormatException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("please input an integer:");
                int intValue = Integer.parseInt(scanner.nextLine());
                System.out.println(Integer.toHexString(intValue));
                break;
            } catch (NumberFormatException ex) {
            }
        }
    }
}

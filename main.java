import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Benjamin Ehlers on 12/31/2018.
 */
public class main {

    public static void main(String[] args) {
        String[] inputRows = new String[3];
        int[] resultArray = new int[9];
        System.out.println("Enter all three lines, of the digital seven segment displays of the integers you want parsed.");
        Scanner scan = new Scanner(System.in);
        inputRows[0] = scan.nextLine();
        inputRows[1] = scan.nextLine();
        inputRows[2] = scan.nextLine();
        for(int i = 0; i < 27; i+=3) {
            DigitalNumber digitalNumber = new DigitalNumber(
                    inputRows[0].substring(i, i + 3),
                    inputRows[1].substring(i, i + 3),
                    inputRows[2].substring(i, i + 3));
            System.out.print(digitalNumber.findActualInteger());
        }
    }
}


import javax.swing.JOptionPane;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Hello World output
        System.out.println("Hello World!!!");
        System.out.println("Hello World!!!");
        System.out.println("Hello World!!!");

        // Rating the temperature by its value
        System.out.print("Enter the outdoor temperature: ");
        Scanner infoSrc = new Scanner(System.in);
        int temp;
            // Input error check
        do {
            if (infoSrc.hasNextInt()) {
                temp = infoSrc.nextInt();
                break;
            }
            System.out.print("Incorrect temperature value! Enter again: ");
            infoSrc.next();
        } while (true);
            // Final output
        if (temp>=30) System.out.println("It's hot!");
        else if (temp>=5) System.out.println("It's warm.");
        else if (temp>=-15) System.out.println("It's cold.");
        else System.out.println("It's too cold!");

        // Dividable by 7 numbers
        int count = 7;
        while (count<=98) {
            System.out.print(count + (count<98? ", ": "\n")); /*использован тернарный оператор для: 1) записи чисел через
            запятую с пробелом 2) перехода на новую строку после вывода последнего числа в строке */
            count+=7;
        }

    }
}

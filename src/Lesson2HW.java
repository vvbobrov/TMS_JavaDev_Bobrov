import java.util.Scanner;

public class Lesson2HW {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);



        /*Задание 1*/
        System.out.println("Введите число: ");
        int enteredNumber = scan.nextInt();
        System.out.println("Число " + enteredNumber + ( enteredNumber%2 == 0 ? " чётное.": " нечётное."));
        /* Для вывода результата используется тернарный оператор, внутри которого определяется чётность числа по результату
         вычисления остатка при делении на 2 */
        /* Задание реализовано без проверки корректности введённых данных*/



        /*Задание 2*/
        System.out.println("Введите значение температуры: ");
        int temperature = scan.nextInt();
        if (temperature > -5) System.out.println("Тепло.");
        else if (-5 >= temperature && temperature > -20) System.out.println("Нормально.");
        else System.out.println("Холодно.\n");



        /*Задание 3*/
        for (int i=10; i<=20; i++) {
            System.out.println(i + "^2 = " + i*i);
        }



        /*Задание 4*/
        int count = 7;
        while (count<=98) {
            System.out.print(count + (count<98? ", ": "\n")); /*использован тернарный оператор для: 1) записи чисел через
            запятую с пробелом 2) перехода на новую строку после вывода последнего числа в строке */
            count+=7;
        }



        /*Задание 5 (*) */
        int number;
        int sum = 0;
        System.out.println("Введите целое число (отрицательное число будет переведено в положительное):");

        /*проверка корректности введённых данных*/
        do {
            Scanner numberScan = new Scanner(System.in);
            if (numberScan.hasNextInt()) {
                number = numberScan.nextInt();
                break;
            }
            System.out.println("Введено некорректное значение!");
            /*scan.next();//переход к следующей попытке ввода*/
        } while (true);

        /*перевод орицательного числа в положительное*/
        number = number>0 ? number : (number *= -1);

        /*подсчёт суммы чисел от 1 до введённого значения*/
        for (int i=1; i<=number; i++) {
            sum+=i;
        }
        System.out.println("Сумма всех чисел от 1 до "+number+" равна: " +sum);
    }
}

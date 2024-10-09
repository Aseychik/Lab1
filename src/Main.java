import java.io.PrintStream;
import java.util.Scanner;
public class Main {
    // Объявляем объект класса Scanner для ввода данных
    public static Scanner in = new Scanner(System.in);
    // Объявляем объект класса PrintStream для вывода данных
    public static PrintStream out = System.out;

    public static void main(String[] args) {
        // считывание знаков трёх чисел
        int a = (int)Math.signum(in.nextLong()), b = (int)Math.signum(in.nextLong()), c = (int)Math.signum(in.nextLong());

        // произведение a, b и c даст 0 только если хотя бы одно из данных чисел равно 0
        // (проверка на 0 среди данных чисел)
        if (a * b * c == 0)
            out.print("Есть нулевые"); // Вывод ответа
        else {
            // если среди данных чисел нет 0 создаётся переменная, равная сумме "знаков" данных чисел
            int sumSign = a + b + c;

            // sumSign равна 3 только если все данные переменные были положительными
            if(sumSign == 3)
                out.print("Все числа положительные"); // Вывод ответа
            else {
                // если не все данные числа положительные и ни одно из них не равно 0
                // sumSign равно -3 только если все данные числа отрицательные
                if (sumSign == -3)
                    out.print("Все числа отрицательные"); // Вывод ответа
                else // если среди данных чисел нет равных 0,
                     // не все числа отрицательные и не все положительные,
                     // значит среди чисел есть и положительные и отрицательные
                    out.print("Все числа положительные или отрицательные"); // Вывод ответа
            }
        }
    }
}
// 3.Условные операторы: Программа для вывода четных и нечетных значений.
import java.util.Scanner;

public class evenOddNumber {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner number = new Scanner(System.in);
        int evenOdd = number.nextInt();
        if (evenOdd % 2 == 0) {
            System.out.println("Четное число");
        } else {
            System.out.println("Нечетное число");

        }
    }
}
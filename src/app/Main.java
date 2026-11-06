package app;

import java.util.Scanner;
import java.util.Locale;

public class Main {

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Введіть ціле число: ");
        int number = scanner.nextInt();

        printSquare(number);

        System.out.println("Введіть радіус циліндра: ");
        double radius = scanner.nextDouble();

        System.out.println("Введіть висоту циліндра: ");
        double height = scanner.nextDouble();

        double volume = calculateCylinderVolume(radius, height);

        System.out.println("Об'єм циліндра з радіусом " + radius + " і висотою " + height + " дорівнює " + volume + ".");

        int[] numbers = new int[5];

        System.out.println("Масив чисел: ");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        int sum = sumArray(numbers);

        System.out.println("Сума всіх елементів масиву дорівнює " + sum + ".");

        scanner.nextLine();

        System.out.println("Введить рядок: ");
        String text = scanner.nextLine();

        System.out.println("Рядок в звортньому порядку: " + reverseString(text));

        System.out.println("Введіть a: ");
        int a = scanner.nextInt();

        System.out.println("Введіть b: ");
        int b = scanner.nextInt();

        System.out.println("Результат " + a + "^" + b + " дрівнює " + power(a, b));

        System.out.println("Введіть ціле число n: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Введіть текствий рядок: ");
        String repeatTextInput = scanner.nextLine();

        repeatText(n, repeatTextInput);
    }

    static void printSquare(int number) {
        int square = number * number;
        System.out.println("Квадрат числа " + number + " дорівнює " + square + ".");
    }

    static double calculateCylinderVolume(double radius, double height) {
        return Math.PI * radius * radius * height;
    }

    static int sumArray(int[] number) {
        int sum = 0;

        for (int i = 0; i < number.length; i++) {
            sum += number[i];
        }

        return sum;
    }

    static String reverseString(String text) {
        return new StringBuilder(text).reverse().toString();
    }

    static long power(int a, int b) {
        long result = 1;

        for (int i = 0; i < b; i++) {
            result *= a;
        }

        return result;
    }

    static void repeatText(int n, String text) {
        for (int i = 0; i < n; i++) {
            System.out.println(text);
        }
    }
}
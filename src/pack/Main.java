package pack;

import java.util.Scanner;
import java.lang.Math;

public class Main {
    private static Scanner scan = new Scanner(System.in);
    private static int kol = 0;
    public static String Task3(int a, int b) {
        if (a > b) {
            if (a == b) {
                return Integer.toString(a);
            }
            return a + " " + Task3(a - 1, b);
        } else {
            if (a == b) {
                return Integer.toString(a);
            }
            return a + " " + Task3(a + 1, b);
        }
    }

    public static int Task4(int k, int s, int num) {
        int sum = 0, numCopy = num;
        if (num == (int) Math.pow(10, k)) return kol;
        for (int i = 0; i < k-1; i++) {
            sum += numCopy % 10;
            numCopy /= 10;
        }
        if (sum == s) kol++;
        return Task4(k, s, ++num);
    }

    public static void main(String[] args) {
        System.out.println("ЗАДАЧА 3\nВведите 2 числа: ");
        int num1 = scan.nextInt(), num2 = scan.nextInt();
        System.out.println(Task3(num1, num2));
        System.out.println("ЗАДАЧА 4\nВведите 2 числа: ");
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        int num3 = (int) Math.pow(10, num1-1);
        System.out.println(Task4(num1, num2, num3) + " Чисел");
    }
}
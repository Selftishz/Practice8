package pack;

import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);
    public static String Task1(int a, int b) {
        if (a > b) {
            if (a == b) {
                return Integer.toString(a);
            }
            return a + " " + Task1(a - 1, b);
        } else {
            if (a == b) {
                return Integer.toString(a);
            }
            return a + " " + Task1(a + 1, b);
        }
    }

    public static void main(String[] args) {
        System.out.println("ЗАДАЧА 3\nВведите 2 числа: ");
        int num1 = scan.nextInt(), num2 = scan.nextInt();
        System.out.println(Task1(num1, num2));

    }
}
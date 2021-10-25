package ru.gb.lesson2;

public class HomeWork2 {
    public static void main(String[] args) {
        System.out.println(within10and20(5, 16));
        isPositiveOrNegative(-4);
        System.out.println(isNegative(-8));
        printWordTimes("dream", 5);
        System.out.println(checkYear(2021));
    }

    public static boolean within10and20(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }


    public static void isPositiveOrNegative(int x) {
        if (x >= 0) {
            System.out.println("число положительное");
        } else {
            System.out.println("число отрицательное");
        }
    }


    public static boolean isNegative(int x) {
        if (x >= 0) {
            return false;
        } else {
            return true;
        }

    }

    public static void printWordTimes(String word, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(word);
        }
    }

    public static boolean checkYear(int y) {
        if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {
            return true;
                } else {
            return false;
        }
    }
}
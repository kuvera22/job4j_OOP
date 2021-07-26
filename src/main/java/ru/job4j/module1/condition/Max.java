package ru.job4j.module1.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }

    public static int max(int first, int second, int third) {
        int result = max(max(first, second), third);
        return result;
    }

    public static int max(int first, int second, int third, int fourth) {
        int result = max(max(first, second, third), fourth);
        return result;
    }
}

package ru.job4j.module5exeptions;

public class Count {
    public static int add(int start, int finish) {
        if (start > finish) {
            throw new IllegalArgumentException("Start should be less than finish.");
        }
        int rsl = 0;
        for (int i = start; i != finish; i++) {
            rsl += i;
        }
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println("Sum of 2 to 10 is: " + add(10, 2));
    }
}

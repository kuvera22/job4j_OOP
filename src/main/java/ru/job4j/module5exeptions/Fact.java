package ru.job4j.module5exeptions;

public class Fact {
    public static void main(String[] args) {
        System.out.println(new Fact().calc(5));
        System.out.println(new Fact().calc(0));
        System.out.println(new Fact().calc(0));
    }

    public int calc(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("Argument should be more than 0");
        }
        int rsl = 1;
        for (int index = 1; index <= n; index++) {
            rsl *= index;
        }
        return rsl;
    }
}

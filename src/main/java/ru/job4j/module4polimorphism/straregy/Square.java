package ru.job4j.module4polimorphism.straregy;

public class Square implements Shape {
    @Override
    public String draw() {
        String ln = System.lineSeparator();
        return " ____" + ln
                + "|    |" + ln
                + "|____|" + ln;
    }
}

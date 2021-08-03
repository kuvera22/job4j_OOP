package ru.job4j.module4polimorphism.transport2;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println("Идет по реальсам");
    }
}

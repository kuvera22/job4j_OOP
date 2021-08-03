package ru.job4j.module4polimorphism.transport2;

public class Plain implements Vehicle {
    @Override
    public void move() {
        System.out.println("Летает");
    }
}

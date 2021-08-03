package ru.job4j.module4polimorphism.transport2;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println("Едет");
    }
}

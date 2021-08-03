package ru.job4j.module4polimorphism.transport2;

public class Main {
    public static void main(String[] args) {
        Vehicle plain = new Plain();
        Vehicle train = new Train();
        Vehicle bus = new Bus();
        Vehicle[] vehicles = new Vehicle[] {plain, train, bus};
        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i].move();
        }
    }
}

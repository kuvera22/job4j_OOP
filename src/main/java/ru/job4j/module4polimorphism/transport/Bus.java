package ru.job4j.module4polimorphism.transport;

public class Bus implements Transport {
    @Override
    public void ride() {
        System.out.println("Начинаем движение");
    }

    @Override
    public void passengers(int passengers) {
        System.out.println("Пассажиров:" + passengers);
    }

    @Override
    public double refuel(double fuel) {
        double price = 5.3;
        return fuel * price;
    }
}

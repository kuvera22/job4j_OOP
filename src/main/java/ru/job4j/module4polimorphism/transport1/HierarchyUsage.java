package ru.job4j.module4polimorphism.transport1;

public class HierarchyUsage {
    public static void main(String[] args) {
        Car car = new Car();
        Transport tp = car;
        Object obj = car;
        Object ocar = new Car();
        Car carFromObject = (Car) ocar;

        Object bicycle = new Bicycle();
        Car cb = (Car) bicycle;
    }
}

package ru.job4j.module1;

public class Battery {
    private int load;

    public Battery(int load) {
        this.load = load;
    }

    public void exchange(Battery another) {
        another.load += this.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery battery1 = new Battery(20);
        Battery battery2 = new Battery(30);
        System.out.println(battery1.load + " " + battery2.load);
        battery1.exchange(battery2);
        System.out.println(battery1.load + " " + battery2.load);
    }
}

package ru.job4j.module4polimorphism;

public interface Store {
    void save(String value);

    String[] load();
}

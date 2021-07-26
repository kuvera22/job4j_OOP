package ru.job4j.module2.professions;

public class Builder extends Engineer {
    private String building;

    public Builder(String name, String surname, String education, String birthday, String level, String building) {
        super(name, surname, education, birthday, level);
        this.building = building;
    }

    @Override
    public void info() {
        System.out.println("Работа на здании №" + building);
        System.out.println(this.getName());
    }

}

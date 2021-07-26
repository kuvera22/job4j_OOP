package ru.job4j.module2.professions;

public class Main {
    public static void main(String[] args) {
        Builder builder = new Builder("Misha", "Dedun", "BMSTU", "13.10.1999", "0", "18");
        builder.info();

        Profession profession =  (Profession) new Builder("Veronika", "gf", "fjf", "fjf", "fjf", "dffd");
        profession.info();
    }
}

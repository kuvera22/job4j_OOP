package ru.job4j.module3incapulation;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Veronika");
        student.setSirname("Ku");
        student.setGroup("IU6");
        student.setDate(new Date());

        System.out.println("Info: " + student.getName() + " " + student.getSirname() + " " + student.getGroup() + student.getDate());
    }
}

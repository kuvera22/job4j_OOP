package ru.job4j.module1;

public class Student {

    public void music(String lyrics) {
        System.out.println("I can sing a song : " + lyrics);
    }

    public void song() {
        System.out.println("I believe I can fly");
    }

    public static void main(String[] args) {
        Student petya = new Student();
        String song = "I believe I can fly";
        petya.music(song);
        petya.song();
        petya.song();
        petya.song();

    }
}

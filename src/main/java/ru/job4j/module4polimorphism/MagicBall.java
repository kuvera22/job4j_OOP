package ru.job4j.module4polimorphism;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);
        System.out.print("Я великий Оракул. Что ты хочешь узнать? ");
        String question = input.nextLine();
        int answer = new Random().nextInt(3);
        switch (answer) {
            case 0:
                System.out.println("Да" + answer);
                break;
            case 1:
                System.out.println("Нет" + answer);
                break;
            default:
                System.out.println("Может быть" + answer);
        }
    }
}

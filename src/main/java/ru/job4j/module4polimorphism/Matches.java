package ru.job4j.module4polimorphism;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11.");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            System.out.println(player + " введите число от 1 до 3:");
            int matches = Integer.parseInt(input.nextLine());
            if (matches >= 1 && matches <= 3) {
                if (count - matches >= 0) {
                    turn = !turn;
                    count -= matches;
                    System.out.println("На столе осталось " + count + " спичек");
                } else {
                    System.out.println("Нет столько спичек на столе");
                }
            } else {
                System.out.println("Число не входит в диапазон");
            }
        }
        if (!turn) {
            System.out.println("Выиграл первый игрок");
        } else {
            System.out.println("Выиграл второй игрок");
        }
    }

//    static class Player {
//        private String name;
//
//        public Player(String name) {
//            this.name = name;
//        }
//
//        public int takeMatches() {
//            Scanner input = new Scanner(System.in);
//            return Integer.parseInt(input.nextLine());
//        }
//
//        public String getName() {
//            return name;
//        }
//
//    }
//
//    private static int matches = 11;
//    private static Player[] players;
//
//    public static void main(String[] args) {
//        int select, current = 0;
//        players = initPlayers(2);
//        Player lastPlayer = players[0];
//        while (!isFinished()) {
//            do {
//                System.out.println(players[current].getName() + " , возьмите количество спичек от 1 до 3");
//                select = players[current].takeMatches();
//            } while (!checkAmount(select));
//            matches -= select;
//            printAmount();
//            lastPlayer = players[current];
//            current = getNextPlayerIndex(players, current);
//        }
//        System.out.println(lastPlayer.getName() + " won");
//    }
//
//    private static int getNextPlayerIndex(Player[] players, int current) {
//        int next = current + 1;
//        if (next == players.length) {
//            next = 0;
//        }
//        return next;
//    }
//
//    private static Player[] initPlayers(int num) {
//        Player[] players = new Player[num];
//        for (int i = 0; i < players.length; i++) {
//            players[i] = new Player("Player [" + (i + 1) + "]");
//        }
//        return players;
//    }
//
//    private static boolean checkAmount(int amount) {
//        boolean result = true;
//        if (amount < 1 || amount > 3 || amount > matches) {
//            result = false;
//        }
//        return result;
//    }
//
//    private static boolean isFinished() {
//        return matches == 0;
//    }
//
//    private static void printAmount() {
//        System.out.println("Спичек осталось: " + matches);
//    }

}



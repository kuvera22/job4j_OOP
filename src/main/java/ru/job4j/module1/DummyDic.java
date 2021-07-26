package ru.job4j.module1;

public class DummyDic {
    public String engToRus(String eng) {
        String answer = "Неизвестное слово. " + eng;
        return answer;
    }

    public static void main(String[] args) {
        DummyDic dd = new DummyDic();
        System.out.println(dd.engToRus("help"));
    }
}

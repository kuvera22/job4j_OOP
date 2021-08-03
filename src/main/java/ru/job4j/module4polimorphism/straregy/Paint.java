package ru.job4j.module4polimorphism.straregy;

public class Paint {
    public void draw(Shape shape) {
        System.out.println(shape.draw());
    }

    public static void main(String[] args) {
        System.out.println(new Triangle().draw()); //по тупому
        System.out.println(new Square().draw());

        Paint context = new Paint();
        context.draw(new Triangle());
        context.draw(new Square());
    }
}

package ru.job4j.module4polimorphism.college;

public class College {
    public static void main(String[] args) {
        Student[] students = new Student[4];
        students[0] = new Student();
        students[1] = new Freshman();

        Object object = new Student();
        if (object instanceof Student) {
            students[2] = (Student) object;
        }

        Object object1 = new Freshman();
        if (object instanceof Student) {
            students[3] = (Student) object1;
        }

        Object[] objects = new Object[3];
        objects[0] = students[0];

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

        //Student student = (Student) new Object();

        Object o = new Student();
        Student st = (Student) o;
    }
}

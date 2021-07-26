package ru.job4j.module1.condition;

import static java.lang.Math.*;

public class Triangle {
    private Point first;
    private Point second;
    private Point third;

    public Triangle(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }

    public double semiPerimeter(double ab, double ac, double bc) {
        double rsl = (ab + bc + ac) / 2;
        return rsl;
    }

    public boolean exist(double ab, double ac, double bc) {
        boolean rsl = true;
        if (ab + ac < bc || ab + bc < ac || ac + bc < ab) {
            rsl = false;
        }
        return rsl;
    }

    public double area() {
        double rsl = -1;
        double ab = first.distance(second);
        double ac = first.distance(third);
        double bc = second.distance(third);

        if (this.exist(ab, ac, bc)) {
            double p = semiPerimeter(ab, bc, ac);
            rsl = sqrt(p * (p - ac) * (p - bc) * (p - ab));
        }
        return rsl;
    }
}

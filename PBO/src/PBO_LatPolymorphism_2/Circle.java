package PBO_LatPolymorphism_2;

public class Circle implements GeometricObject {
    protected double radius = 1.0;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        double output = (radius * 2 * 3.14 * 100.0)/100.0;
        return output;
    }

    @Override
    public double getArea() {
        double output = (radius * radius * 3.14 * 100.0)/100.0;
        return output;
    }

    @Override
    public String toString() {
        return "Geometric Object Type  : Circle \n" +
                "Radius                 : " + radius + "\n" +
                "Area                   : " + getArea() + "\n" +
                "Perimeter              : " + getPerimeter() + "\n";
    }
}

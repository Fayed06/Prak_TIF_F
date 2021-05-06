package PBO_LatPolymorphism_1;

public class Circle extends Shape{
    protected double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        double output = 3.14 * radius * radius;
        return output;
    }

    @Override
    public double getPerimeter() {
        double output = (3.14 * radius * 2 *100.0)/100.0;
        return output;
    }

    @Override
    public String toString() {
        String pilih;
        if(super.isFilled()){
            pilih = "Yes";
        } else {
            pilih = "No";
        }
        return "Shape      : Circle \n" +
                "Color      : " + super.getColor() + "\n" +
                "Filled     : " + pilih + "\n" +
                "Radius     : " + getRadius() + "\n" +
                "Area       : " + getArea() + "\n" +
                "Perimeter  : " + getPerimeter() + "\n";
    }
}

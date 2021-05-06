package PBO_LatPolymorphism_1;

public class Rectangle extends Shape{
    protected double width;
    protected double length;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length,String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        double output = width * length;
        return output;
    }

    @Override
    public double getPerimeter() {
        double output = 2 * (width +length);
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
        return "Shape      : Rectangle \n" +
                "Color      : " + super.getColor() + "\n" +
                "Filled     : " + pilih + "\n" +
                "Width      : " + getWidth() + "\n" +
                "Length     : " + getLength() + "\n" +
                "Area       : " + getArea() + "\n" +
                "Perimeter  : " + getPerimeter() + "\n";
    }
}

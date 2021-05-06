package PBO_LatPolymorphism_1;

public class Square extends Rectangle{
    public Square() {
    }
    public Square(double side){
        super(side, side);
    }
    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }
    public double getSide(){
        return super.getLength();
    }
    public void setSide(double side){
        this.setWidth(side);
        this.setLength(side);
    }
    @Override
    public void setWidth(double side){
        super.setWidth(side);
    }
    @Override
    public void setLength(double side){
        super.setLength(side);
    }
    @Override
    public String toString(){
        String pilih;
        if(super.isFilled()){
            pilih = "Yes";
        } else {
            pilih = "No";
        }
        return "Shape      : Square \n" +
                "Color      : " + super.getColor() + "\n" +
                "Filled     : " + pilih + "\n" +
                "Side       : " + getSide() + "\n" +
                "Area       : " + getArea() + "\n" +
                "Perimeter  : " + getPerimeter() + "\n";
    }

}

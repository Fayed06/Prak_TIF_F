package PBO_LatPolymorphism_1;

public class Main {
    public static void main(String[] args) {
        Shape[] Shapes = new Shape[5];
        Shapes[0] = new Circle(10, "White", true);
        Shapes[1] = new Rectangle(5, 10, "Black", false);
        Shapes[2] = new Square(4, "Red", true);
        Shapes[3] = new Circle(15, "Blue", false);
        Shapes[4] = new Rectangle(10, 25, "Purple", true);
        for(int i = 0; i < Shapes.length; i++) {
            System.out.println("============"+"Shape Number " +(i+1)+"============");
            System.out.print(Shapes[i].toString() + "\n");
        }
    }
}

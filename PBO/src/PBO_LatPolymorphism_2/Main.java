package PBO_LatPolymorphism_2;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        ResizableCircle circle2 = new ResizableCircle(15);
        circle2.resize(10);
        System.out.println("============Normal============");
        System.out.print(circle1.toString());
        System.out.println("============Resize============");
        System.out.print(circle2.toString());
    }
}
package PBO_LatPolymorphism_2;

public class ResizableCircle extends Circle implements Resizable {

    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public void resize(int percent) {
        double temp = percent / 100.0;
        this.radius = this.radius * temp;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

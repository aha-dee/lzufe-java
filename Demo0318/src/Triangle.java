public class Triangle extends Shape{
    double w;
    double h;

    @Override
    public double getArea() {
        return w*h*0.5;
    }

    public Triangle() {
    }

    public Triangle(double w, double h) {
        this.w = w;
        this.h = h;
    }
}

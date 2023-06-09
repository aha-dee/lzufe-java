public class Rectangle extends Shape {

    double w;
    double h;

    @Override
    public double getArea() {
        return w * h;
    }

//    public Rectangle() {
//    }
//
//    public Rectangle(double w, double h) {
//        this.w = w;
//        this.h = h;
//    }

    public Rectangle() {
    }

    public Rectangle(double w, double h) {
        this.w = w;
        this.h = h;
    }
}

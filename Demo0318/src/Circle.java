public class Circle extends Shape{

//    public Circle() {
//    }
//
//    public Circle(double r) {
//        this.r = r;
//    }
    public Circle(){
    }
    public Circle(double r){
        this.r = r;
    }

    double r;
    final public static double PI = 3.14;
    @Override
    public double getArea() {
        return PI*r*r;
    }
}

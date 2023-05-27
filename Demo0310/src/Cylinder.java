public class Cylinder extends Circle{
    int h;

    public Cylinder() {
        System.out.println("圆柱的无参构造器");
    }

    public Cylinder(int x, int y, int r, int h) {
        super(x, y, r);
        System.out.println("圆柱的有参构造器");
        this.h = h;
    }


    @Override
    public String toString() {
        return "Cylinder{" +
                "h=" + h +
                ", r=" + r +
                ", x=" + x +
                ", y=" + y +
                '}';
    }  //重写toString()方法的目的是为了能够多次输入不同的值（h r）

    @Override
    public double getArea() {
        double s = (2 * PI * r * r) + PI * 2 * r * h;
        return s;
    }

    public double getVolume(){
        double v = (PI*r*r)*h;
        return v;
    }
}

public class Demo0310 {
    public static void main(String[] args) {
        System.out.println("--------------circle1---------------");
        Circle circle1=new Circle();
        circle1.x=1;
        circle1.y=2;
        circle1.r=3;
        System.out.println("circle1 = " + circle1);
        System.out.println("circle1.getArea()= " + circle1.getArea());

        System.out.println("--------------cylinder1---------------");
        Cylinder cylinder1=new Cylinder();
        cylinder1.x=1;
        cylinder1.y=2;
        cylinder1.r=3;
        cylinder1.h=4;
        System.out.println("cylinder1 = " + cylinder1);
        System.out.println("cylinder1.getArea() = " + cylinder1.getArea());
        System.out.println("cylinder1.getVolume() = " + cylinder1.getVolume());


        System.out.println("--------------circle2---------------");
        Circle circle2=new Circle(2,3,4);
        System.out.println("circle2 = " + circle2);

    }
}

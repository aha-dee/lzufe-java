//abstract 抽象的
public class Demo0318 {
    public static void main(String[] args) {
        Circle circle1 = new Circle(10);
        System.out.println("circle1.getArea() = " + circle1.getArea());
        
        Rectangle rectangle1 = new Rectangle(10,5);
        System.out.println("rectangle1.getArea() = " + rectangle1.getArea());
        
        Shape shape1 = new Circle(2);
        System.out.println("shape1.getArea() = " + shape1.getArea());

        Shape shape2 = new Rectangle(2,4);
        System.out.println("shape2.getArea() = " + shape2.getArea());
        
        Shape shape3 = new Triangle(2,2);
        System.out.println("shape3.getArea() = " + shape3.getArea());

    }
}


//多态（Polymorphism） 父类的同一个方法，在子类中可以有不同实现  允许不同类型的对象对同一个方法做出不同的响应
//抽象类可以继承抽象类，具体类继承抽象类必须实现（重写）抽象方法
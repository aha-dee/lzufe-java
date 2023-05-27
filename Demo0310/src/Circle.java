public class Circle extends Piont{

    public static final double PI = 3.14;    //表示一个公共（public）的、静态（static）的、不可变（final）的双精度浮点数（double）常量
    int r;

    public Circle() {
        System.out.println("圆的无参构造器");
    }

    public Circle(int x, int y, int r) {
        super(x, y);//调用超类构造器   超类构造器必须放在第一排
        System.out.println("圆的有参构造器");
        this.r = r;
    }

    public double getArea(){  //getArea是一个方法名，它被定义为计算并返回圆的面积的方法。
        double s = PI * r * r;
        return s;
    }

//    public 返回类型 方法名(参数列表){
//        // 方法体
//        // 方法执行的逻辑
//        // 可能会有返回语句
//    }

//    for example
//
//    public double getArea(){
//        // 计算并返回面积
//        return length * width;
//    }

}

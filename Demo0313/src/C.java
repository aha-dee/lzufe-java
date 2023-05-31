//final demo 最终的    //一般定义常量
public class C {
    public C() {
        x1 = 1;
        x3 = 3;
    }


    int k;//实例成员变量如果不赋值，系统会给默认值
    final int x1;    //实例变量，成员变量，field，域，字段
    final int x2 = 1;
    final int x3;
    final static int y;   //类变量，静态变量，成员变量，field，域，字段
    final static int y1 = 1;
    public static final double PI = 3.14;

    static {      //静态代码块一般给静态变量赋初值
        y = 16;
    }

    void m1() {
        final int i = 10;  //局部变量
//        i = 20;
//        x1 = 5;//最终的成员变量，不让修改
//        y = 9;
    }
}

//类变量，成员变量，静态变量，局部变量，实例变量
//1.final可以修饰局部变量，一旦赋值就不让修改（常量）
//1.1 变量分为局部变量和成员变量（field，域，字段），成员变量分为实例变量和类变量
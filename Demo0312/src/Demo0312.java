public class Demo0312 {
    public static void main(String[] args) {
        C c = new C();
        c.f1 = 1;  //  实例.实例变量
        c.f2 = 2; // 可以这么用  但是不推荐  实例可以访问变量(f2是类)
        C.f2 = 3;  // 推荐用法： 类.类变量


        c.m1();  //实例.实例方法
        c.m1();  // 可以这么用  但是不推荐   实例可以访问类方法
        C.m2();  //  推荐用法： 类.方法

    }
}

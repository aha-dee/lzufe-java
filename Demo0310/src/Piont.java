public class Piont {
    int x;
    int y;

    public Piont() {
        System.out.println("点的无参构造器");
    }

    public Piont(int x, int y) {
        System.out.println("点的有参构造器");
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Piont{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}


//Point: 1. base class,基类   2.super class,超类    3.father class,父类
//Circle:   子类（sub class,child class）
//DRY   不要重复使用
//REUSE 复用
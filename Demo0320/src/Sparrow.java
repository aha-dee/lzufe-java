//继承自鸟类，实现了会飞的接口
public class Sparrow extends Bird implements Flyable{
    @Override
    public void introduce() {
        System.out.println("我是一只麻雀");
    }

    @Override
    public void fly() {
        System.out.println("我飞翔在乌云之中");
    }
}

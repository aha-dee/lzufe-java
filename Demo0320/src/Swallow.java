//燕子类
public class Swallow extends Bird implements Flyable{
    @Override
    public void introduce() {
        System.out.println("我是一只小燕子");
    }

    @Override
    public void fly() {
        System.out.println("我飞的很好看");
    }
}

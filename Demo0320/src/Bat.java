//实现了会飞的接口
public class Bat implements Flyable{
//    @Override
    public void introduce() {
        System.out.println("我是一只小蝙蝠");
    }


    @Override
    public void fly() {
        System.out.println("我飞行在黑暗之中");
    }
}

public class Penguin extends Bird implements Swimmable{
    @Override
    public void introduce() {
        System.out.println("我是一只小企鹅");
    }

    @Override
    public void swim() {
        System.out.println("我会游泳哦");
    }
}

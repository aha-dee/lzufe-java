public class Swan extends Bird implements Swimmable,Flyable{
    @Override
    public void swim() {
        System.out.println("我会静静的游");
    }

    @Override
    public void fly() {
        System.out.println("我会优雅的飞");
    }

    @Override
    public void introduce() {
        System.out.println("我是一只小天鹅");
    }
}

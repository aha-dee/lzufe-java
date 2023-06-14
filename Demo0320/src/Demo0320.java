public class Demo0320 {
    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow();
        sparrow.introduce();
        sparrow.fly();
        System.out.println("-------------------------------------------");
        Penguin penguin = new Penguin();
        penguin.introduce();
        penguin.swim();
        System.out.println("-------------------------------------------");
        Bat bat = new Bat();
        bat.introduce();
        bat.fly();
        System.out.println("--------------------------------------------");
        Swallow swallow = new Swallow();
        swallow.introduce();
        swallow.fly();
        System.out.println("--------------------------------------------");
        Swan swan = new Swan();
        swan.introduce();
        swan.fly();
        swan.swim();
    }
}

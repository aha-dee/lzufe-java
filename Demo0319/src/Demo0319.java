public class Demo0319 {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.cry();
        dog1.introduce();

       Cat cat1 =new Cat();
       cat1.cry();
       cat1.introduce();

       Tiger tiger1 = new Tiger();
       tiger1.cry();
       tiger1.introduce();


        System.out.println("--------------------------------------------------");

        Animal animal1 = new Animal() {
            @Override
            public void introduce() {
                System.out.println("我是小猪");
            }

            @Override
            public void cry() {
                System.out.println("houhou");
            }
        };

        animal1.introduce(); // 调用introduce()方法
        animal1.cry(); // 调用cry()方法


    }
}

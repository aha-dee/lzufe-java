import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Demo0601 {
    public static void main(String[] args) {
//        String[] singers = {"周杰伦", "薛之谦", "林俊杰", "陈奕迅", "薛之谦"}; //有序 可重
//        int i;
//        for (i = 0; i < singers.length; i++) ;
//        System.out.println(singers[i]);
//    }


//        String[] singers = {"周杰伦", "薛之谦", "林俊杰", "陈奕迅", "薛之谦"};
//        for (String singer : singers) {
//            System.out.println(singer);
//        }
//        singers[4]="李荣浩";


//        List singers = new ArrayList();  //有序 可重 不定长  每个元素都是对象
//        singers.add("周杰伦");
//        singers.add("薛之谦");
//        singers.add("林俊杰");
//        singers.add("陈奕迅");
//        singers.add("张国荣");
//        singers.add(1);
//        singers.add(true);
//        for (Object singer : singers) {
//            System.out.println(singer);
//        }


        List<String> singers = new ArrayList<>();  //有序 可重 不定长  每个元素都是指定类型
        singers.add("周杰伦");
        singers.add("薛之谦");
        singers.add("林俊杰");
        singers.add("陈奕迅");
        singers.add("张国荣");
        singers.add("周杰伦");
        for (Object singer : singers) {
            System.out.println(singer);

        }

        singers.remove(5);
        System.out.println("-----------------------------");
        for (Object singer : singers) {
            System.out.println(singer);

        }
        System.out.println("-------------------------------");
        singers.set(2,"张国荣");
        System.out.println("singers.get(3) = " + singers.get(3));


        System.out.println("-------------------------------");
        for (Object singer : singers) {
            System.out.println(singer);

        }

        System.out.println("------------------------------");
    }

}
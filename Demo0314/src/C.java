public class C {
    void m1(final int i){
//        i=20;

    }
    void m2(){
        int x=10;
        m1(x);
    }

    void m3(Student student){
        System.out.println("student.name = " + student.name);
    }

    void m4(final Student student){
        System.out.println("student.name = " + student.name);
    }
}

//final关键字用于声明不可修改的变量。一旦参数被声明为final，它的值就不能在方法内部被修改
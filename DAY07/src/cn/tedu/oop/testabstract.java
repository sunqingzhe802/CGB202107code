package cn.tedu.oop;

public class testabstract {
    public static void main(String[] args) {
    animal a = new cat();
        System.out.println(a.color);
        System.out.println(a.price);
//        a.test();
        cat c1 = new cat();
        System.out.println(c1.color);
        System.out.println(c1.price);
    }
}

abstract class animal{
    String color = "red";
    int price = 12;
    public void test(){
        System.out.println("我是抽象父类");
    }
    public animal(){
        System.out.println("我是父类的无参构造");
    }
}

class cat extends animal{
    String color = "blue";
    int price = 11;
    @Override
    public void test() {
        System.out.println("我是抽象子类");
    }
    public cat(){
        super();
        System.out.println("我是抽象子类的无参构造");
    }
}
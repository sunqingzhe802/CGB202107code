package cn.tedu.oop;

public class ooptest1 {
    public static void main(String[] args) {
//    phone p1 = new phone();
//        System.out.println(p1.size);
//        p1.call();
//        xiaomi x1 = new xiaomi();
//        System.out.println(x1.color);
//        System.out.println(x1.name);
//        System.out.println(x1.size);
//        x1.call();
//        x1.sing();
        phone p2 = new xiaomi();
        System.out.println(p2.size);
        p2.call();


    }
}

class phone{
    double size = 6.7;
    public void call(){
        System.out.println("call phone");
    }
}

class xiaomi extends phone{
    String name = "hongmi";
    String color = "blue";
    @Override
    public void call() {
        System.out.println("小米视频通话");
    }
    public void sing(){
        System.out.println("小米就是便宜");
    }
}

class huawei extends phone{
    String name = "huawei P5";
    String color = "black";
    @Override
    public void call() {
        System.out.println("华为5G 通话");
    }
    public void photo(){
        System.out.println("华为take photo");
    }
}

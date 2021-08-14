package cn.tedu.innerclass;
public class TestInner1 {
    public static void main(String[] args) {
        Outer t1 = new Outer();
        t1.find();
//        Outer.Inter t2 = new Outer.Inter();
//        new Outer().find();//创建匿名对象
//        Outer.Inter t2 = new Outer().new Inter();
//        t2.delete();
//        new Outer().new Inter().delete();

    }
}

class Outer{
    String name;
    private int age;
    public void find(){
        System.out.println("我是外部类的方法");
        Inter t3 = new Inter();
        t3.delete();

    }
    //成员内部类(类里方法外)
    //局部内部类(方法里)
    class Inter{
        String name1;
        int sum = 10;
        public void delete(){
            System.out.println("我是成员内部类的inter的delete方法");
            System.out.println(age);
            System.out.println(name);
//            find();
        }
    }
}
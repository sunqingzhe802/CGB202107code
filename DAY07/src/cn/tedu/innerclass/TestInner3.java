package cn.tedu.innerclass;
public class TestInner3 {
    public static void main(String[] args) {
        Outer3.Inter3 t3 = new Outer3.Inter3();//普通方式创建静态内部类对象
        new Outer3.Inter3().show();//创建匿名的静态内部类对象
        t3.show();//通过创建静态内部类对象调用show方法
        Outer3.Inter3.fly();//访问静态内部类的静态方法--链式加载
    }
}

class Outer3{
    static class Inter3{
        public void show(){
            System.out.println("我是成员内部类innter3的普通方法show");
        }
        //内部类作为外部类的一个特殊成员，需要设置成静态才能添加静态方法
        public static void fly(){
            System.out.println("我是成员内部类的inner3的静态方法fly");
        }
    }
}

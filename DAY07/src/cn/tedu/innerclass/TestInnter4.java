package cn.tedu.innerclass;

public class TestInnter4 {
    public static void main(String[] args) {
        Outer4 i1 = new Outer4();
        i1.show();

    }
}

class Outer4{
    public void show(){
        System.out.println("我是外部类的普通方法");
        /*局部内部类：位置方法里*/
        class Inter4{
            String name;
            int age;
            public void eat() {
                System.out.println("我是局部内部类的普通方法eat");
            }
        }
        Inter4 i4 = new Inter4();
        i4.eat();
    }
}
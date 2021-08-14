package cn.tedu.innerclass;

public class TestInnter2 {
    public static void main(String[] args) {
        Outer2 i2 = new Outer2();
        i2.test();
    }


}

class Outer2{
    private String name;
    public void test(){
        Inter2 t2 = new Inter2();
        t2.eat();
    }

    private class Inter2{
        public void eat(){
            System.out.println("我是私有成员内部类的普通方法eat");
        }
    }
}
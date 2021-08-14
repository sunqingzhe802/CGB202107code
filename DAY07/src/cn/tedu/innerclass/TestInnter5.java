package cn.tedu.innerclass;
/*本类用于测试匿名内部类*/
public class TestInnter5 {
    public static void main(String[] args) {
        new Inter1(){
            @Override
            public void save() {
                System.out.println("正在保存");
            }
            @Override
            public void get() {
            }
        }.save();
        new Inter2() {
            @Override
            public void dance() {

            }
        }.play();
        new Inter2(){
            @Override
            public void dance() {
                System.out.println("跳舞");
            }
        }.dance();
        new Inter3().test();
    }
}

interface Inter1{
    void save();
    void get();
}

abstract class Inter2 {
    public void play(){
        System.out.println("inter2普通方法");
    }
    abstract public void dance();
}

class Inter3 {
    public void test(){
        System.out.println("inter3一起吃屎");
    }
}

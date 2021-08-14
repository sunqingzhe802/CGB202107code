package cn.tedu.junit2107;
import org.junit.Test;

public class TestJunit {
    /*单元测试方法
    * 是java测试的最小单位
    * **/
    @Test
    public void testFor(){
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
    @Test
    public void testFor2(){
        int n = 2;
        if( n == 1){
            System.out.println("今天中午吃马兰头");
        }else{
            System.out.println("中午吃拌面");
        }
    }

}

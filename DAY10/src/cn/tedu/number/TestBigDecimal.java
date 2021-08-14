package cn.tedu.number;

import java.math.BigDecimal;
import java.util.Scanner;

public class TestBigDecimal {
    public static void main(String[] args) {
//        f1();
        f2();
    }
    private static void f2() {
        System.out.println("请输入第一个小数");
        double d1 = new Scanner(System.in).nextDouble();
        System.out.println("请输入第二个小数");
        double d2 = new Scanner(System.in).nextDouble();
        BigDecimal bd1 = new BigDecimal(d1+"");
        BigDecimal bd2 = new BigDecimal(d2+"");

        System.out.println(bd1.add(bd2));

        System.out.println(bd1.divide(bd2,3,BigDecimal.ROUND_HALF_UP));
        System.out.println(bd1.subtract(bd2));
        System.out.println(bd1.multiply(bd2));
    }
    private static void f1() {
        System.out.println("请输入第一个小数");
        double d1 = new Scanner(System.in).nextDouble();
        System.out.println("请输入第二个小数");
        double d2 = new Scanner(System.in).nextDouble();
        System.out.println(d1 + d2);
        System.out.println(d1 - d2);
        System.out.println(d1 * d2);
        System.out.println(d1 / d2);
    }
}


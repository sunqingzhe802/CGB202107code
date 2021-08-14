package cn.tedu.oop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestError {
    public static void main(String[] args) {
//        method1();
//        method2();
        method3();
    }
    private static void method1()throws ArithmeticException,InputMismatchException,Exception {
        System.out.println("请输入一个整数");
        int num1 = new Scanner(System.in).nextInt();
        System.out.println("请输入第二个整数");
        int num2 = new Scanner(System.in).nextInt();
        System.out.println(num1/num2);
    }
    //自己处理捕获异常try{}cache(){}
    private static void method2() {
        try {
            System.out.println("请输入一个整数");
            int num1 = new Scanner(System.in).nextInt();
            System.out.println("请输入第二个整数");
            int num2 = new Scanner(System.in).nextInt();
            System.out.println(num1/num2);
        }catch (ArithmeticException e) {
            System.out.printf("别输入0啊");
        }catch (InputMismatchException e){
            System.out.println("别输入小数啊");
        }catch (Exception e){
            System.out.println("系统错误");
        }
    }
//  用method3 包裹可能出现bug的方法，method使用throws 抛出异常
    private static void method3() {
        try{
            method1();
        }catch (Exception e){
            System.out.println("系统错误");
        }

    }
}

package cn.tedu.java500;

import java.util.Scanner;

public class bidaxiao {
    public static void main(String[] args) {
//        String name = "海绵宝宝";
//        int age = 11;
//        System.out.println("我是"+name+"年龄"+age);
        /**其实我们可以通过父母的身高大致推断出子女的身高，假定父母与子女的身高遗传关系如下：
         儿子身高（厘米）＝(父亲身高＋母亲身高) ×1.08÷2
         女儿身高（厘米）＝(父亲身高×0.923＋母亲身高) ÷2
         那已知：现有父亲身高175CM,母亲身高160CM。
         请将预测的子女身高打印输出*/
//    double father = 175;
//    double mather = 160;
//        System.out.println("儿子身高"+(father+mather)*1.08/2);
//        System.out.println("女儿身高"+(father*0.923+mather)/2);
        /**已知小红同学有25元，她攒了几天钱之后发现自己的现在的钱比原来的2倍还多出10块。
         * 而小蓝同学有30元，他攒了几天钱之后发现自己的钱正好是原来的2倍。
         * 于是小胖说：小红和小蓝现在的钱一样多，请问，他说的对吗？*/
//        int xh = 25*2+10;
//        int xl = 30*2;
//        System.out.println(xh==xl);
        /**某小伙想定一份外卖，商家的优惠方式如下：
         * 鱼香肉丝单点24元，油炸花生米单点8元，米饭单点3元。订单满30元8折优惠。
         * 鱼香肉丝优惠价16元，但是优惠价和折扣不能同时使用。那么这个小伙要点这三样东西，最少要花多少钱？*/
//        double zhekou;
//        double youhui;
//        zhekou = (24+8+3)*0.8;
//        youhui = 16+8+3;
//        double result = zhekou < youhui ? zhekou : youhui;
//        System.out.println(result);
        /**接收用户输入的3个整数,并将它们的最大值作为结果输出*/
//        int[] sortnum = new int[3];
//        System.out.println("请输入第一个整数");
//        int a = new Scanner(System.in).nextInt();
//        sortnum[0] = a;
//        System.out.println("请输入第二个整数");
//        int b = new Scanner(System.in).nextInt();
//        sortnum[1] = b;
//        System.out.println("请输入第三个整数");
//        int c = new Scanner(System.in).nextInt();
//        sortnum[2] = c;
//        Arrays.sort(sortnum);
//        System.out.println(Arrays.toString(sortnum));
        System.out.println("请输入第一个整数");
        int num1 = new Scanner(System.in).nextInt();
        System.out.println("请输入第二个整数");
        int num2 = new Scanner(System.in).nextInt();
        System.out.println("请输入第三个整数");
        int num3 = new Scanner(System.in).nextInt();
        int num12 = num1 > num2 ? num1 : num2;
        num12 = num12 > num3 ? num12 : num3;
        System.out.println(num12);
    }
}

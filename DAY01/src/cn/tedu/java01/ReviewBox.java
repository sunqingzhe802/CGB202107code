package cn.tedu.java01;
public class ReviewBox {
    public static void main(String[] args) {
        Integer i1 = new Integer(100);
        Integer i2 = Integer.valueOf(100);
        Integer i3 = 100;

        Double d1 = new Double(1.1); //没有高效效果
        Double d2 = Double.valueOf(2.1);//也没有高效的效果
        Double d3 = 3.1;//自动装箱double -》Double
        System.out.println(i1.parseInt("7777")+111);
        System.out.println(d1.parseDouble("5.6")+1.1);

        int i = i1;
        double d = d1;
        System.out.println(i);
        System.out.println(d);
    }
}

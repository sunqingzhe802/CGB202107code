package cn.tedu.java01;

import java.util.Arrays;

public class Testoop {
    public static void main(String[] args) {
        String s2 = "abfbbb";
        System.out.println(s2.indexOf("b"));
        System.out.println(s2.lastIndexOf("b"));
        System.out.println(s2.toUpperCase());
        System.out.println(s2.toLowerCase());
        String s3 = "abcbdbeb";
        s3.split("b");
        System.out.println(Arrays.toString(s3.split("b")));
        String s4 = "    basd dsd    ";
        System.out.println(s4.trim());

        System.out.println(String.valueOf("10")+10);
        String s5 = "abcdefgh";
        System.out.println(s5.substring(3));
        System.out.println(s5.substring(1,5));
    }
}

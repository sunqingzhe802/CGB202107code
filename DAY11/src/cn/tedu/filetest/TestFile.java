package cn.tedu.filetest;
//本类用于测试File类的方法;File类需要导入
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class TestFile {
    public static void main(String[] args) throws IOException {
        //创建File对象f1，需要对文件路径使用\进行转义;D:\目录下创建javatestfile.txt并写入数据
        File f1 = new File("D:\\javatestfile.txt");
        System.out.println(f1.length());//length()获取文件中的字节数量
        System.out.println(f1.exists());//检查文件或目录是否存在，存在则返回true
        System.out.println(f1.isFile()); //检查是否是文件，是则返回true
        System.out.println(f1.isDirectory());//检查是否是目录，是则返回true
        System.out.println(f1.getName());//获取文件或者目录的名称
        //获取文件或目录的父路径，没有则返回null
        System.out.println(f1.getParent());
        //或者文件或者目录的绝对路径
        System.out.println(f1.getAbsoluteFile());
        //createNewFile();新建文件
        f1 = new File("D:\\test03");
        System.out.println(f1.createNewFile());
        //mkdir()创建目录
        f1 = new File("D:\\newdirectory");
        System.out.println(f1.mkdir());
        //mkdirs()创建多层目录
        f1 = new File("D:\\a\\b\\c");
        System.out.println(f1.mkdirs());
        //delete()删除空文件夹，文件
        f1 = new File("D:\\test03");
        System.out.println(f1.delete());
        //测试list()和listFiles(),创建testfile和testfile1
        f1 = new File("D:\\newdirectory\\testfile.txt");
        f1.createNewFile();
        f1 = new File("D:\\newdirectory\\testfile1.txt");
        f1.createNewFile();
        f1 = new File("D:\\newdirectory");
        String[] filelistname = f1.list();
        System.out.println(Arrays.toString(filelistname));
        File[] listf1 = f1.listFiles();
        System.out.println(Arrays.toString(listf1));
    }
}

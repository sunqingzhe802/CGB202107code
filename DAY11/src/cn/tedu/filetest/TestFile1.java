package cn.tedu.filetest;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class TestFile1 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("D:\\javatestfile.txt");
        System.out.println(f1.length());
        System.out.println(f1.exists());
        System.out.println(f1.isFile());
        System.out.println(f1.isDirectory());
        System.out.println(f1.getName());
        System.out.println(f1.getParent());
        System.out.println(f1.getAbsoluteFile());
        f1 = new File("D:\\test03");
        System.out.println(f1.createNewFile());
        f1 = new File("D:\\newdirectory");
        System.out.println(f1.mkdir());
        f1 = new File("D:\\a\\b\\c");
        System.out.println(f1.mkdirs());
        f1 = new File("D:\\test03");
        System.out.println(f1.delete());
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

package utils;
import org.junit.Test;


public class FileTest {
//    @Test
//    public  void temp(){
//        System.out.println(123);
//    }


    @Test
    public  void testreadFile(){
        String fileName="C:\\Users\\SyMy\\Desktop\\orig.txt";
        String s = Fileu.readFile(fileName);
        System.out.println(s);
    }

    @Test
    public  void TestwriteFile(){
        String fileName="C:\\Users\\SyMy\\Desktop\\orig.txt";
        String date="测试失败！";
        Fileu.writeFile(fileName,date);
    }

    @Test
    public  void TestreadFileEcp(){
        String fileName="C:\\Users\\SyMy\\Desktop\\orig.txt";
        Fileu.readFile(fileName);
    }

    @Test
    public  void TestwriteFileEcp(){
        String fileName="C:\\Users\\SyMy\\Desktop\\orig.txt";
        String date="测试成功！";
        Fileu.writeFile(fileName,date);
    }
}

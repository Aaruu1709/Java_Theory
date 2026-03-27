package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsEx2 {
    void m2() throws InterruptedException, FileNotFoundException {
        Thread.sleep(1000);
        System.out.println("hiii");
        FileInputStream fis=new FileInputStream("abc.txt");
    }
    void m1() {
        try{
            m2();
        }
        catch (  FileNotFoundException | InterruptedException e){
e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        ThrowsEx2 t=new ThrowsEx2();
        t.m1();
    }
}

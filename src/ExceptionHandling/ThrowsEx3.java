package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsEx3 {


    void m2() throws InterruptedException, FileNotFoundException {
        Thread.sleep(1000);
        FileInputStream fis=new FileInputStream("abc.txt");
    }
    void m1() throws  InterruptedException {
        try {
            m2();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();

        }
        }


    public static void main(String[] args) {
        ThrowsEx3 t=new ThrowsEx3();
       try{
           t.m1();
       }
       catch(InterruptedException e){
           e.printStackTrace();
       }

    }
}

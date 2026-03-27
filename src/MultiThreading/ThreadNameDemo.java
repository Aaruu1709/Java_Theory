package MultiThreading;


class MyThread4 extends Thread{

}
public class ThreadNameDemo {
    public static void main(String[] args) {
MyThread4 obj=new MyThread4();
MyThread4 obj2=new MyThread4();

//get name of thread using getname()
        System.out.println(obj.getName());
        System.out.println(obj2.getName());
        System.out.println(Thread.currentThread().getName());

        obj.setName("aaruu");
        obj2.setName("saruu");
        Thread.currentThread().setName("piulii");

        System.out.println(obj.getName());
        System.out.println(obj2.getName());
        System.out.println(Thread.currentThread().getName());

    }
}

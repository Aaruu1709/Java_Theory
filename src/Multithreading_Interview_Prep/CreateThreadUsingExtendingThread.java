package Multithreading_Interview_Prep;

class MyClass extends  Thread{
    public void run(){
        for(int i=0;i<=10;i++){
            System.out.println(i);
        }
    }
}
public class CreateThreadUsingExtendingThread {
    public static void main(String[] args) {
        MyClass mobj=new MyClass();
        mobj.start();
    }
}
//The run() method contains the code executed by the thread.
// Calling start() initiates a new thread and
// executes the run() method concurrently with the main thread.
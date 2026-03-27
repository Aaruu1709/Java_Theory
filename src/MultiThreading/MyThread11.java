package MultiThreading;

class MyThreadDemo extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("user defined Thread...");
        }
    }
}
public class MyThread11 {
    public static void main(String[] args) {//main thread
       //user defined thread starting code
        MyThreadDemo t=new MyThreadDemo();
        t.start();//2 threads
        //logic of main thread
        for(int i=0;i<10;i++){
            System.out.println("main thread");

        }
        }

    }
//if aapplication contains more thna one thread then thread execution decided by thread schedular
//thrrad chedular is component of JVM
//it follows two algorithm:to allocte the cpu
//-priative algorithm
//-time slicing algo
//to allocate cpu for this thread
//JVM first check start() method in MyThread Class then Thread class
//thrad class start is executing
//You call:
//
//        t.start();
//
//
//JVM executes Thread class’s start() method
//
//start() internally:
//
//Creates a new thread
//
//Calls run() method automatically
//
//Since you overrode run(), your run() executes
//
//📌 You should NEVER override start()
//Only override run() ✔️

//Thread Scheduler explanation (clean version)
//
//Thread Scheduler is part of JVM
//
//It decides which thread gets CPU
//
//Algorithms used:
//
//Preemptive scheduling
//
//Time slicing
//
//⚠️ Output order is NOT guaranteed
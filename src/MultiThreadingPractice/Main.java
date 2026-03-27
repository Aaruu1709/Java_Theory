package MultiThreadingPractice;

class EvenNumberPopulation implements Runnable{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println(i*2);
            System.out.println("even number");
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e){

                e.printStackTrace();
            }
        }
    }
}

class OddNumberPopulation extends Thread{
    public void run(){
        for(int i=1;i<=10;i+=2){
            System.out.println(i);

            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
public class Main {
    public static void main(String[] args) {
        EvenNumberPopulation e=new EvenNumberPopulation();
        Thread t=new Thread(e);
        t.start();
       //
        new Thread(e).start();
        new Thread(e).start();
        new Thread(e).start();
//        e.start();
        System.out.println("_________________");
        OddNumberPopulation o=new OddNumberPopulation();
        o.start();
        System.out.println("main method completed");

        new Thread(e).start();
        o.start();
    }
}

//parallel processing
//at a time thread execute hota hai
//thread-when we start->run() method call hoke method run hogii
//when tehire work is done they stop release resources

//thread class=>start() and run() both diffrent
//strat()->run() start hota hai in different thread contenxt(allocate memory differently ,separate resources)
//run()->normal method->main ke sequence method mehi hi call hogi..woh return aayegi
//start()=>return nhi ayega

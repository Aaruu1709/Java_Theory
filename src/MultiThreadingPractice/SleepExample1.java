package MultiThreadingPractice;
//Example 1: Simple Sleep on Main Thread
public class SleepExample1 {
    public static void main(String[] args) {
        System.out.println("im staring programming newly from now");
        try{
            Thread.sleep(1000);
        }
        catch (InterruptedException e){
            System.out.println("Interrupted successfully");
        }
        System.out.println("yes im reache succsfully with proper slepp");

    }
}

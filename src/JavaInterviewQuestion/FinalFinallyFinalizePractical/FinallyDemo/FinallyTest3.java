package JavaInterviewQuestion.FinalFinallyFinalizePractical.FinallyDemo;
//❌ 3. Infinite Loop (finally never reached)
public class FinallyTest3 {
    public static void main(String[] args) {
        try {
            System.out.println("Im inside try....");
        while (true){
            //infinite loop
            System.out.println("im running infinitely");
        }
        }finally {
            System.out.println("im inside finally...");//never reachd here
        }
    }
}

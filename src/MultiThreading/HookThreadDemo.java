package MultiThreading;

public class HookThreadDemo {
        public static void main(String[] args) throws Exception {

            Runtime.getRuntime().addShutdownHook(
                    new Thread(() -> System.out.println("Ctrl+C detected. Cleaning up..."))
            );

            while (true) {
                System.out.println("Application running...");
                Thread.sleep(1000);
            }
        }


}

package MainMethod;

public class CommandLineArgs {
    public static void main(String[] args) {
        System.out.println(args.length);
        System.out.println(args[0]);
        System.out.println(args[1]);

        System.out.println(args[0]+args[1]);

        int num1=Integer.parseInt(args[0]);
        double num2=Double.parseDouble(args[1]);
        System.out.println(num1+num2);
    }
}

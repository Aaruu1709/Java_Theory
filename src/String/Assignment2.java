package String;

public class Assignment2 {
    public static void main(String[] args) {
        String str1="ramu";
        String str2="durga";
        String str3="ramu";

        System.out.println(str1.equals(str2));//false
        System.out.println(str1.equals(str3));//true
        System.out.println(str2.equals(str3));//false
        System.out.println("ramu".equals("RAMU"));//false
        System.out.println("ramu".equalsIgnoreCase("RAMU"));//true
        System.out.println("_________________");

        System.out.println(str1.compareTo(str2));//+ve 14
        System.out.println(str1.compareTo(str3));//0
        System.out.println(str2.compareTo(str1));//-ve -14
        System.out.println("ramu".compareTo("ramun"));//-1
        System.out.println("ramu".compareTo("RAMU"));//+32
        System.out.println("ramu".compareToIgnoreCase("RAMU"));//0

        System.out.println("__________________");

        System.out.println("anu".compareTo("anutnrtn"));//-5
        System.out.println("anurtn".compareTo("anu"));//3
    }
}

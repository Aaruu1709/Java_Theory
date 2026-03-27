package String;

public class StringMethod {
    public static void main(String[] args) {
        String s1="     aaruu   ";
        System.out.println(s1);
        System.out.println(s1.trim());
        System.out.println(s1.length());
        System.out.println(s1.trim().length());

        System.out.println("________________________");

        String s2="aaruushinde";
        System.out.println(s2.charAt(4));//4
//        System.out.println(s1.charAt(15));stringindexoutofboundException
        System.out.println(s2.indexOf("a"));
        System.out.println(s2.indexOf('s'));
        System.out.println(s2.lastIndexOf('u'));


        System.out.println("________________________");
        String s3="hi sir how are u";
        System.out.println(s3.endsWith("e"));
        System.out.println(s3.endsWith("how"));
        System.out.println(s3.startsWith("hi"));
        System.out.println(s3.startsWith("r"));

        System.out.println("-________________");

        String s4="hi ratan sir how are you";
        String [] s=s4.split(" ");
        for(String ss: s){
            System.out.println(ss);
        }
        System.out.println("________________________");
        String s5="hi sir RATAN sir";
        System.out.println(s5.toUpperCase());
        System.out.println(s5.toLowerCase());

        System.out.println("____________________");

        String s6="hi sir ratan sir";
        System.out.println(s6.contains("ratan"));
        System.out.println(s6.contains("anu"));

        System.out.println("___________________");
        String s7="hi ratan sir";
        System.out.println(s7.replace('a','A'));
        System.out.println(s7.replace("ratan","naresh"));
        System.out.println(s7.replace("anu","ramu"));
        System.out.println(s7.replace(" ",""));




    }

}

package String;

public class Example1 {
    public static void main(String[] args) {
        System.out.println("______________1__________________");

        String str="Aaruu";
        System.out.println(str);

        System.out.println("_______________2_________________");

        String str1=new String("aaruu");
        System.out.println(str1);

        System.out.println("______________3__________________");

        //conversion of char[] to string format
        char [] ch={'a','a','r','u','u'};
        String str2=new String(ch);
        System.out.println(str2);

        System.out.println("____________4____________________");

        char [] ch1={'a','a','r','u','u'};
        String str3=new String(ch1,2,3);
        System.out.println(str3);

        System.out.println("________________________________");

        //conversion of to string format
        byte[]b1={65,66,67,68,69,70};
        String str4=new String(b1);
        System.out.println(str4);

        System.out.println("________________________________");

        byte [] b2={65,66,67,68};
        String str5=new String(b2,1,2);
        System.out.println(str5);

    }
}

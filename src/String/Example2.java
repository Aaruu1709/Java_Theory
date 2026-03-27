package String;

public class Example2 {
    public Example2(String string){

    }
    public static void main(String[] args) {
        //object class equals: reference comparison
        Example2 e1=new Example2("aaruu");
        Example2 e2=new Example2(("aaruu"));
        System.out.println(e1.equals(e2));//false
        System.out.println(e1==e2);//false
        System.out.println("_____________________");


        //string class overriding equlas():content comparison
        String s1="aaruu";
        String s2="aaruu";
        System.out.println(s1.equals(s2));//true
        System.out.println(s1==s2);//true
        System.out.println("_____________________");


        String s3=new String("saruu");
        String s4=new String("saruu");
        System.out.println(s3.equals(s4));//true
        System.out.println(s3==s4);//false
        System.out.println("_____________________");

        //Stringbuffer class not overriding equals():uses object class equals() so it for reference
        StringBuffer sb=new StringBuffer("aaruu");
        StringBuffer sb1=new StringBuffer("aaruu");
        System.out.println(sb.equals(sb1));//false
        System.out.println(sb==sb1);//false


    }
}

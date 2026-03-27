package String.String_Programs;

public class ReverseNumber {
    public static void main(String[] args) {
        //solution 1
        System.out.println("--------------------1.StringBuilder.reverse()-------------------------");
        String str="hello";
      String reversed=new StringBuilder(str).reverse().toString();
        System.out.println(reversed);
        //.toString()
        //Converts the reversed StringBuilder object back into an immutable String.

        //solution 2
        System.out.println("______________________2_Char Array In-Place Swap_____________________");
        char[] arr=str.toCharArray();
        int start=0,end=arr.length-1;
        //toCharArray() is a built-in String method in Java.
        //It converts the string into a character array.
        //here we use two pinter approach
        for (int i=start,j=end;i<j;i++,j--){
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }

        String reversed2=new String(arr);//again convert back to string
        System.out.println(reversed2);



        //solution 3
        System.out.println("-------------3.using for loop-------------");
        String reversed3="";
        for(int i=str.length()-1;i>=0;i--){
            reversed3=reversed3+str.charAt(i);
        }
        System.out.println(reversed3);

    }
}
//why it is efficient:
//StringBuilder is Mutable
//uses extra memory for stringBuilder
//can not modify original string(string are immutable)
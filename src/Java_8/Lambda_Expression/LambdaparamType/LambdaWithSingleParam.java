package Java_8.Lambda_Expression.LambdaparamType;


import java.util.ArrayList;

public class LambdaWithSingleParam {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList();
        list.add(1);
        list.add(20);
        list.add(5);
        list.add(80);

        System.out.println("all elements:"+ list);
        list.forEach(n-> System.out.println(n));


        System.out.println("all even number elements are:");
        list.forEach(n-> {
            if(n % 2==0){
                System.out.println("even number"+ n);
            }
        });
    }
}

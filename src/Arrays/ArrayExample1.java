package Arrays;

import java.util.Arrays;

public class ArrayExample1 {
    //creating array
    public static void main(String[] args) {
        int[] arr={10,29,30,40,50};
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println("array length:"+arr.length);
        System.out.println(Arrays.toString(arr));

//approach 1:
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }

        System.out.println("_____________________________");
 //approach 2:
         for(int x:arr){
             System.out.println(x);
         }
        System.out.println("_____________________________");
 //approach 3:

    }
}

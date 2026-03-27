package Arrays;

import java.util.Arrays;
import java.util.OptionalInt;

public class MaxMinEleWithStream {
    public static void main(String[] args) {
        int arr[]={};
        OptionalInt min= Arrays.stream(arr).min();
        if(min.isPresent()){
            System.out.println("min:"+ min.getAsInt());
        }else {
            System.out.println("array is empty , no minimum value");
        }
//        int max=Arrays.stream(arr).max().getAsInt();

        System.out.println("minimum element:"+ min);
//        System.out.println("maximum element: "+max);
    }
}

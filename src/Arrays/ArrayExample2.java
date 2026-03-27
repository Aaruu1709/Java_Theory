package Arrays;

import java.util.Arrays;

public class ArrayExample2 {
    public static void main(String[] args) {
        int arr[]={2,4,6,3,8,2,4};
        //find out duplicate number
        for (int i=0;i< arr.length;i++){//2
            for(int j=i+1;j< arr.length;j++){
                    if(arr[i]==arr[j]){
                    System.out.println("dupplicate:"+ arr[i]);
                }
            }
        }

        System.out.println("____________________________");

    }
}
//In this code, I'm are trying to find duplicate numbers in an array.
// The logic is simple: we compare each element of the array with every
// element that comes after it. If we find two
// elements with the same value, we print it as a duplicate.
//Why j = i + 1?
//
//The outer loop i picks one element at a time.
//
//The inner loop j checks for duplicates of that element only
// in the elements that come after it.

//So by doing j = i + 1, we:
//
//Avoid comparing the same element with itself.
//
//Avoid repeated comparisons.

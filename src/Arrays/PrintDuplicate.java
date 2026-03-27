package Arrays;

public class PrintDuplicate {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,12,2,4,2,4,4};
        int count;
        for(int i=0;i<arr.length;i++){
            count=0;
            for(int j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count==0){
                System.out.println(arr[i]+" ");
            }


        }
    }
}


//package arrays;
//
//import java.util.Arrays;
//import java.util.HashSet;
//import java.util.Set;
//
//public class Practice_Array {
//    public static void main(String[] args) {
//        int[] a={2,3,4,5,12,2,4,2,4};
//
//        Set s=new HashSet();
//        for(int i=0;i<a.length;i++){
//            s.add(a[i]);
//        }
//        System.out.println(s);
//    }
//}


//int[] arr={2,3,4,5,12,2,4,2,4,4};
//for(int i=0;i<arr.length;i++)
//{
//    boolean duplicate=false;
//    for(int j=0;j<i;j++)
//    {
//        if(arr[i]==arr[j])
//        {
//            duplicate=true;
//            break;
//        }
//    }
//    if(duplicate==false)
//    {
//        for(int k=i+1;k<arr.length;k++)
//        {
//            if(arr[i]==arr[k])
//            {
//                System.out.print(arr[i]+" ");
//                break;
//            }
//        }
//    }
//}

//package CollectionFile.ArrayListFile;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//
//public class Demo {
//
//    public static void main(String[] args) {
//
//        ArrayList al = new ArrayList(Arrays.asList(2,3,4,2,3,2,4,5,7,8));
//
//        System.out.println(al);
//
//
//
//        for(int i =0; i<al.size() ;i++)
//        {
//            for(int j=i+1; j< al.size() ; j++)
//            {
//                if(al.get(i).equals(al.get(j)))
//                {
//                    al.remove(j);
//                    j--;
//
//                }
//            }
//        }
//
//        System.out.println(al);
//
//    }
//}
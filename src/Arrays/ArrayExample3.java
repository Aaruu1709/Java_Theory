package Arrays;

public class ArrayExample3 {
    public static void main(String[] args) {
        //lowest and heighest number
        int arr[]={10,20,30,4,6,7,90};

        int max=arr[0];
        int min=arr[0];
        for(int i=0;i< arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("min:"+min);
        System.out.println("max:"+max);
    }
}

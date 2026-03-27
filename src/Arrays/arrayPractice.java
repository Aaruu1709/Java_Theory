package Arrays;


//input: int[] arr = {2,3,1,5,6,7};
//output: {6,3,1,5,2,7};
public class arrayPractice {
    public static void main(String[] args) {
        int[] arr = {2,3,1,5,6,7};
        int temp = arr[0];
        arr[0] = arr[4];
        arr[4] = temp;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

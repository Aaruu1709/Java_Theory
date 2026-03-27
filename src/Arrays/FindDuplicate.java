package Arrays;

public class FindDuplicate {
    public static void main(String[] args) {

        int[] arr = {2,3,2,4,5,3,5,2,6};

        for(int i=0; i<arr.length ; i++)
        {
            int count = 1;

            if(arr[i] == -1)
            {
                continue;
            }
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i] == arr[j])
                {
                    count++;
                    arr[j] = -1;
                }
            }

            if(count > 1)
            {
                System.out.println(arr[i]+ " : "+count);
            }
        }
    }
}
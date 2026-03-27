package Arrays;

public class DuplicateEleInArray {
    public static void main(String[] args) {
        int [] a = { 2, 3, 3, 5, 6, 2,  5, 2, 65};

        for(int i = 0; i < a.length; i++){
            boolean printed = false;
            for ( int k=0;k<i;k++){
                if(a[k]==a[i]){
                    printed = true;
                    break;
                }

            }
            if(!printed){
                for(int j = i+1; j < a.length; j++){
                    if(a[i] == a[j]){
                        System.out.println("Duplicate Element " +a[i]);
                        break;
                    }
                }

            }
        }
    }
}

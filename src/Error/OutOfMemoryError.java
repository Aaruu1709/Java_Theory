package Error;

import java.util.ArrayList;

public class OutOfMemoryError {
    public static void main(String[] args) {
        ArrayList  list=new ArrayList<>();
        while (true){
            list.add(new int[10000000]);
        }
    }
}

package Map_Interface;

import java.util.HashMap;
import java.util.Map;

public class BasicMapExample {
    public static void main(String[] args) {
        //here we creating map using hashmap..because map is interface so we can not able to create object of map then
        //we create object of its implemented class here we take hashMap to create object
        Map<String,Integer> m=new HashMap<>();
        m.put("emp_1", 1);
        m.put("emp_2",2);
        m.put("emp_3",3);

        System.out.println("map elements: "+ m);

    }
}

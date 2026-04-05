package Map_Interface;

import java.util.HashMap;
import java.util.Map;

public class Remove_Remove_Elem {
    public static void main(String[] args) {
        //here we create object
        Map<Integer,String> empData=new HashMap<>();
        //store element into map as key-value pair
        //each key-value pair is called entrySet
        empData.put(100,"Kaif Dev");
        empData.put(101,"Kumar Sharma");
        empData.put(103,"Ram Chavan");
        // Integer a = new Integer(10); is deprecated since Java 9 because it always creates a new object,
// which is inefficient and unnecessary.

// From Java 5 onwards, autoboxing was introduced to automatically convert primitive types
// to wrapper objects.

// So instead of manual conversion, we can simply write:
// Integer a = 10;  // primitive int is automatically converted to Integer (autoboxing)

        //print out original map
        System.out.println("employee data: "+ empData);

        //remove
        empData.remove(103);
        //to check is remove entry or not
        System.out.println("updated removed empdata list is:"+ empData);
    }
}


//employee data: {100=Kaif Dev, 101=Kumar Sharma, 103=Ram Chavan}
//updated removed empdata list is:{100=Kaif Dev, 101=Kumar Sharma}
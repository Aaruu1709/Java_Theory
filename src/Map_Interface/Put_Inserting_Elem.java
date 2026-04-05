package Map_Interface;

import java.util.HashMap;
import java.util.Map;

//public class Put_Inserting_Elem {
//    public static void main(String[] args) {
//       Initialization of a Map using Generics
//    Map<Integer, String> hm1
//            = new HashMap<Integer, String>();
//
//        Inserting the Elements
//        hm1.put(new Integer(1), "Geeks");
//        hm1.put(new Integer(2), "Geeks");
//        hm1.put(new Integer(3), "Geeks");
//
//
//        System.out.println("Initial Map: " + hm1);
//
//        hm1.put(new Integer(2), "For");
//
//        System.out.println("Updated Map: " + hm1);
//}
//}
//-------------------------------------------------------------------
//🔥 Why is it deprecated
//Because:
//It is unnecessary object creation
//Java already provides better ways
//It slows performance slightly (extra object creation)
//That is deprecated in Java 9+, so modern Java uses autoboxing.

//--------------------------------------------------------------
//✅ Modern Correct Way
//✔ Autoboxing (BEST way)
//Integer a = 10;
//
//✔ Or valueOf()
//Integer a = Integer.valueOf(10);

//“The constructor Integer(int) is deprecated in Java 9 and
// marked for removal because it is inefficient and unnecessary due
// to autoboxing. Instead, we should use Integer.valueOf() or simply
// assign the primitive value directly,
// which allows Java to handle conversion automatically.”

//✅ Updated Modern Version of Your Code


public class Put_Inserting_Elem {
    public static void main(String[] args) {

    Map<Integer,String> hm=new HashMap<>();
    hm.put(1,"aaruu");
    hm.put(2,"sauruu");
    hm.put(3,"piulii");
        System.out.println("initial map:"+ hm);

        //now we want to update value then
        hm.put(2,"My Dream");
        System.out.println("Updated value is:"+ hm);

    }
    }
//output is:initial map:{1=aaruu, 2=sauruu, 3=piulii}
//Updated value is:{1=aaruu, 2=My Dream, 3=piulii}
//---------------------------------------------------------------
    //“Internally, HashMap calculates the hash of the key and
// uses it to decide the bucket location. Each entry is stored
// as a node containing key, value, and hash. If the key already exists,
// the value is replaced;
// otherwise, a new entry is added in the appropriate bucket.”
//-------------------------------------------------------------
//1. You write:
//        hm.put(1, "aaruu");
//2. Compiler internally changes it to:
//        hm.put(Integer.valueOf(1), "aaruu");
//Because:
//
//Map key type is Integer
//But you are giving int
//So Java automatically converts it
//java compiler does this conversion
//“When we pass a primitive int into a HashMap with Integer key,
// Java automatically performs autoboxing.
// The compiler converts int into Integer using Integer.valueOf(),
// so the primitive is wrapped into an object before being stored in the Map.
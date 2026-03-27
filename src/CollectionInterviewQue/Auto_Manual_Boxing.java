package CollectionInterviewQue;

import java.util.ArrayList;
import java.util.List;

public class Auto_Manual_Boxing {

        public static void main(String[] args) {

            List<Integer> list = new ArrayList<>();

            // 🔄 AUTOBOXING
            list.add(10);

            // 🔄 MANUAL BOXING
            Integer obj = Integer.valueOf(20);
            list.add(obj);

            // 🔽 AUTO UNBOXING
            int a = list.get(0);

            // 🔽 MANUAL UNBOXING
            int b = list.get(1).intValue();

            System.out.println("Auto unboxing: " + a);
            System.out.println("Manual unboxing: " + b);
        }
    }
//auto boxing-unboxing && manual boxing-unboxing
//?AutoBoxing:
//Primitive->Object->doen by java autoamtically
//List<Integer> list=new ArrayList<Integer>();
//list.add(10);  //int->Integer->Automatically
//internally:
//list.add(Integer.valueOf(10));

//?manual-Boxing
//developer can do it
//Integer obj=Integer.valueOf(10);//manually boxing
//list.add(obj);

//?__________________________________

//?Auto-unboxing
//int x=list.get(0);//Interger->int(automatically)
//internally
//int x=list.get(0).intValue();

//? manual-unboxing
//Integer obj = Integer.valueOf(20);//boxing
//int x = obj.intValue(); // manual unboxing


//valueOf()=>Boxing
//intValue()=>unboxing

//?“Integer values between -128 to 127 are cached,
// ?  so == may return true.”
//Integer a = 200;
//Integer b = 200;
//
//System.out.println(a == b);      // false ❌
//System.out.println(a.equals(b)); // true ✅
//🎯 Rule
//👉 == → compares reference
//👉 equals() → compares value


//Integer x = null;
//int y = x;   // ❌
//👉 Exception: NullPointerException
//🎯 Why?
//x.intValue(); // null ❌
//🎯 Interview Line
//“Unboxing null Integer causes NullPointerException.”

//✅ To remove value:=>list.remove(Integer.valueOf(20));
//“List remove is overloaded—int removes index, Integer removes value.”
//List<Integer> list = new ArrayList<>();
//list.add(10);
//list.add(20);
//list.remove(1);
//System.out.println(list);
//👉 Output: [10]

//“Comparable is used for natural/default sorting inside the class,
// while Comparator is used for custom sorting outside the class

//“TreeSet needs to compare elements to maintain sorted order.
// If no comparison logic is provided, it doesn’t know how to compare objects,
// so it throws ClassCastException.”
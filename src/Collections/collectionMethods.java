package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class collectionMethods {
    public static void main(String[] args) {
//        collcetion interface

    Collection<Integer> c=new ArrayList<>();
    //add()
        c.add(10);
        c.add(20);
        c.add(30);
        c.add(40);
        System.out.println("After adding elements..."+c);//10 20 30 40
        System.out.println("collection size:"+ c.size());//4
        System.out.println("contains 20?"+c.contains(20));//true
        System.out.println("is empty:"+ c.isEmpty());//false
        System.out.println("___________________");
        Collection<Integer> c2=new ArrayList<>();
        c2.add(40);
        c2.add(50);
        c2.add(60);//[40,50,60]
        c2.addAll(c);//[40,50,60,10,20,30,40]
        System.out.println("after addAll():"+ c2);//[40,50,60,10,20,30,40]
        System.out.println("_______________");
        c.remove(20);
        c.add(1);
        System.out.println("list of c is:"+ c);
        System.out.println("list of c2: "+c2);
        System.out.println("After remove(20) c:"+ c);//[10,30,40]
        c.removeAll(c2);//👉 Remove from c all elements that are present in c2.
//        Only c is modified.
//⚠️ c2 is not modified at all.
        System.out.println("aftrer remove all c2: "+ c2);
        System.out.println("After removeAll():"+ c);
        c.add(30);//[10,30,40]
//No. removeAll() modifies only the collection on which it is called.
// The passed collection is used only for comparison.


        //retainAll()
        //“retainAll() keeps only the common elements
        // between two collections and removes all others.”
        //“retainAll() modifies only the collection on which it is called (first collection).”
        Collection <Integer> c3=new ArrayList<>();
        c3.add(10);
        c3.add(20);
        c3.add(30);
        System.out.println("_________________________________");

        System.out.println("collecton of c3"+c3);
        System.out.println("collection of c:"+  c);
        System.out.println("_________________________________");



        c.retainAll(c3);
        System.out.println("afrer retainAll():"+ c);

        //ierator
        //method:
        // 1. hasNext()👉 Checks if next element is present=>✔ returns true / false
        //2. next()👉 Returns next element=>✔ moves cursor forward
      //  3. remove()👉 Removes current element=>✔ removes last returned element by next()
        System.out.println("using Iterator:");
        Iterator<Integer> it=c.iterator();
        while (it.hasNext()){
            System.out.println(it.next()+" ");
            it.remove();//if we direct call remove before next() then -> java.lang.IllegalStateException
        }
        System.out.println();

        //toArray();=>👉 Convert the collection into an array.
        Object arr[]= c.toArray();
        System.out.println("Arrry elements:");

        for (Object o:arr){
            System.out.println(o);
        }


        c.clear();
        System.out.println("After clear(): " + c);

        // isEmpty()
        System.out.println("Is Empty now? " + c.isEmpty());
    }

}
//⚠️ Important Rules (INTERVIEW TRAPS)
//❗ Rule 1: Must call next() before remove()
//it.remove(); ❌ ERROR
//👉 Throws:
//
//IllegalStateException
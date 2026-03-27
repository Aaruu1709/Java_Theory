package CollectionInterviewQue;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        Iterator<String> it= list.iterator();//create iterator

        while (it.hasNext()){
            System.out.println(it.next());//traverse element
        }
    }
}

//✅ Java Iterator
//🔹 Definition (simple)
//An Iterator is an object that allows you to traverse (loop)
// through a collection of elements one by one safely.
//Used to traverse collections → like List, Set, etc.
//Created from a collection → Iterator it = collection.iterator();
//Methods:
//hasNext() → checks if there are more elements
//next() → gets the next element
//remove() → removes the current element safely
//?The forEachRemaining() method was added in the Java 8
//4.Concurrent modification warning → If collection
// changes while iterating, ConcurrentModificationException may occur
//You cannot use for-each methods to remove elements safely, but Iterator.remove() allows it
//Helps avoid errors when modifying collections during traversal
//“An Iterator in Java is an object used to traverse a collection
// element by element. It provides hasNext(), next(), and remove()
// methods, and throws an exception
// if the collection is modified during traversal.
//“hasNext() checks if more elements exist, next()
// returns the next element, remove() deletes the last
// returned element, and forEachRemaining()
// performs an action on all remaining elements.”
package Map_Interface.TreeMap;

import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {

        TreeMap<Integer, String> tm = new TreeMap<>();

        tm.put(10, "Geeks");
        tm.put(15, "For");
        tm.put(20, "Geeks");

        System.out.println(
                "TreeMap using TreeMap() constructor");
        // Printing the elements of TreeMap
        System.out.println("TreeMap: " + tm);
    }
}


//?-------------------------------------------------------------
//TreeMap in Java
//- java.util package implemented the map interface
//stores key-value pairs in a sorted order using either a natural or custom sorting
//tree map internally uses a red-black tree for efficient sorting
//does not allow null keys, but allows null values

//Constructors of TreeMap
//In order to create a TreeMap, we need to create an object of the TreeMap class
//1. TreeMap()
//This constructor is used to build an empty TreeMap that will be
// sorted by using the natural order of its keys.
//TreeMap<k,v>map=new TreeMap<>();


//2. TreeMap(Comparator comp):
//create new empty treemap
//but insteed of usin default (natural sorting order),
// it uses custom rule to decide how keys should be sorted
//default behavior->
//TreeMap<Integer,String> map=new TreeMap<>();
//keys are sorted : 1,2,3,4...

//custom sorting using comparator:
//TreeMap<Integer,String>map=new TreeMap<>((a,b)->b-a);
//now keys are sorted in descending order
//alternate solution to do sorting
//TreeMap<String, Integer> map =  new TreeMap<>(Comparator.reverseOrder());
//

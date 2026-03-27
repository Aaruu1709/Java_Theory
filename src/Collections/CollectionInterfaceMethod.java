package Collections;
import java.util.*;

public class CollectionInterfaceMethod {

    public static void main(String[] args) {

        // Create Collection object (using ArrayList implementation)
        Collection<String> collection = new ArrayList<>();

        System.out.println("----- add() -----");

        boolean added1 = collection.add("Apple");
        boolean added2 = collection.add("Banana");
        System.out.println("Added Apple: " + added1);//true
        System.out.println("Added Banana: " + added2);//true
        System.out.println("Collection: " + collection);// [apple, banana]

        System.out.println("\n----- addAll() -----");
        Collection<String> extra = new ArrayList<>();
        extra.add("Orange");
        extra.add("Grapes");
        boolean addAllResult = collection.addAll(extra);
        System.out.println("addAll result: " + addAllResult);//true
        System.out.println("Collection: " + collection);//[apple, banana ,orange ,graphs]

        System.out.println("\n----- size() -----");
        System.out.println("Size: " + collection.size());//4

        System.out.println("\n----- isEmpty() -----");
        System.out.println("Is empty: " + collection.isEmpty());//false

        System.out.println("\n----- contains() -----");
        System.out.println("Contains Apple: " + collection.contains("Apple"));//true
        System.out.println("Contains Mango: " + collection.contains("Mango"));//false

        System.out.println("\n----- containsAll() -----");
        System.out.println("Contains all extra: " + collection.containsAll(extra));//true

        System.out.println("\n----- iterator() -----");
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println("Element: " + iterator.next());//traverse//element :apple elementt:banana element:orange element:graphs
        }

        System.out.println("\n----- toArray() -----");
        Object[] array = collection.toArray();
        for (Object obj : array) {
            System.out.println(obj);//apple banana orange graphs
        }

        System.out.println("\n----- toArray(T[] a) -----");
        String[] stringArray = collection.toArray(new String[0]);
        System.out.println(Arrays.toString(stringArray));//[apple banana orange graphs]
        //It converts a collection into a typed array (here String[]) instead of Object[].

        System.out.println("\n----- remove() -----");
        boolean removed = collection.remove("Banana");
        System.out.println("Removed Banana: " + removed);//true
        System.out.println("Collection: " + collection);//[apple,orange,graphs]

        System.out.println("\n----- removeAll() -----");
        System.out.println("remove all element from another collection");
        boolean removeAllResult = collection.removeAll(extra);
        System.out.println("removeAll result: " + removeAllResult);//true
        System.out.println("Collection: " + collection);//[apple]

        System.out.println("\n----- retainAll() -----");
        System.out.println("It is used to keep only the elements that are common between two collections.");
        collection.add("Apple");
        collection.add("Mango");
        Collection<String> retain = new ArrayList<>();
        retain.add("Apple");
        boolean retainResult = collection.retainAll(retain);
        System.out.println("retainAll result: " + retainResult);
        System.out.println("Collection: " + collection);

        System.out.println("\n----- clear() -----");
        System.out.println("clear() removes all elements from the collection, but the collection object itself still exists.");
        collection.clear();
        System.out.println("Collection after clear: " + collection);

        System.out.println("\n----- equals() -----");
        Collection<String> c1 = new ArrayList<>();
        Collection<String> c2 = new ArrayList<>();
        c1.add("A");
        c2.add("A");
        System.out.println("c1 equals c2: " + c1.equals(c2));

        System.out.println("\n----- hashCode() -----");
        System.out.println("HashCode of c1: " + c1.hashCode());

        System.out.println("\n----- removeIf() -----");
        collection.add("Dog");
        collection.add("Cat");
        collection.add("Cow");
        boolean removeIfResult = collection.removeIf(s -> s.startsWith("C"));
        System.out.println("removeIf result: " + removeIfResult);
        System.out.println("Collection: " + collection);

        System.out.println("\n----- stream() -----");
        collection.stream().forEach(System.out::println);

        System.out.println("\n----- parallelStream() -----");
        collection.parallelStream().forEach(System.out::println);

        System.out.println("\n----- forEach() -----");
        collection.forEach(item -> System.out.println("Item: " + item));
    }
}


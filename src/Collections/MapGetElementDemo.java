package Collections;

import java.util.HashMap;
import java.util.Map;

public class MapGetElementDemo {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(101,"aaruu");
        map.put(102,"piulii");
        map.put(103,"devanshi");
        map.put(100,"meesab");
        System.out.println("___________using keyset______________");

        for (Integer key:map.keySet()){
            System.out.println(key+ "->"+ map.get(key));
        }
        System.out.println("___________using values___________");
        for(String value:map.values()){
            System.out.println(value);
        }

        System.out.println("______________entrySet________________");
        for (Map.Entry<Integer,String >entry : map.entrySet()){
            System.out.println(entry.getKey()+ "->"+ entry.getValue());
        }

        System.out.println("_________using lambda 8__________");
map.forEach((key,value)-> System.out.println(key+ "->"+ value));
    }
}

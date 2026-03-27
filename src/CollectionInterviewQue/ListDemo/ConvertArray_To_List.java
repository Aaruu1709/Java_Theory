package CollectionInterviewQue.ListDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArray_To_List {
    public static void main(String[] args) {
        //creatiing array
        String[] array={"java","Python","Machine learning","MYSQL"};

        //converting Array to List
        List<String> list=new ArrayList<>();
        for(String lang:array){
            list.add(lang);
        }
        System.out.println("Printing List"+ list);
    }
}
//output: Printing List[java, Python, Machine learning, MYSQL]


//How to convert List to Array
//We can convert the List to Array by calling the List.toArray() method.

//
//class Main{
//    psv{
//        List<String> fruitList=new ArrayList<>();
//        fuitList.add("mango");
//        fuitList.add("baanana");
//        fuitList.add("tomato");
//        fuitList.add("corrot");

        //converting arrayList to array
//        String[] array=fruitList.toArray(new String[ fruitList.size()]);
//        System.out.println("printing array"+ Arrays.toString(array));
//        System.out.println("prnting list:"+ fruitList);
//
//
//
//    }
//}

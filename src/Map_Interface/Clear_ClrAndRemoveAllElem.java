package Map_Interface;

import java.util.HashMap;
import java.util.Map;

public class Clear_ClrAndRemoveAllElem {
    public static void main(String[] args) {
        Map<Integer,String> shoppingList=new HashMap<>();
        shoppingList.put(5,"Water Bottles");
        shoppingList.put(10,"Milk-Pouch");
        shoppingList.put(30,"Lemon");

        System.out.println("shopping list:"+shoppingList);
        shoppingList.clear();
        System.out.println("after clearing :"+shoppingList);
    }
}
